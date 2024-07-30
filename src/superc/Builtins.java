package superc;

import xtc.Limits;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * A class that provides information about the built-in macros and system directories of the GCC
 * compiler.
 */
public class Builtins {
  private final String builtin;
  private final List<String> sysdirs;

  /**
   * Constructs a new Builtins instance by detecting the built-in macros and system directories of the GCC installation.
   *
   * @throws IOException          if an I/O error occurs while invoking the GCC compiler.
   * @throws InterruptedException if the current thread is interrupted while waiting for the GCC process to exit.
   */
  public Builtins() throws IOException, InterruptedException {
    builtin = invokeGCCPreprocessor(List.of("-dM"), false);
    List<String> verboseGCCOutput
            = Arrays.stream(invokeGCCPreprocessor(List.of("-v"), true).split(System.lineSeparator()))
            .map(String::strip)
            .toList();
    int sysdirsIndex = verboseGCCOutput.indexOf("#include <...> search starts here:");
    int endSysdirsIndex = verboseGCCOutput.indexOf("End of search list.");
    sysdirs = verboseGCCOutput.subList(sysdirsIndex + 1, endSysdirsIndex);
  }

  /**
   * Returns the built-in macros of the GCC compiler as a string of preprocessor definition statements.
   *
   * @return the built-in macros of the GCC compiler.
   */
  public synchronized String getBuiltin() {
    return builtin;
  }

  /**
   * Returns the system directories of the GCC compiler as a list of strings.
   *
   * @return the system directories of the GCC compiler.
   */
  public synchronized List<String> getSysdirs() {
    return sysdirs;
  }

  private static String invokeGCCPreprocessor(List<String> extraArgs, boolean returnStderr)
          throws IOException, InterruptedException {
    List<String> gccCall = Stream.concat(Stream.of(Limits.COMPILER_NAME, "-E", "-"), extraArgs.stream()).toList();
    Process gccProcess = new ProcessBuilder(gccCall).start();
    gccProcess.outputWriter().close();
    InputStream outputStream = returnStderr ? gccProcess.getErrorStream() : gccProcess.getInputStream();
    String output = new String(outputStream.readAllBytes(), Charset.defaultCharset());
    int exitCode = gccProcess.waitFor();
    if (exitCode != 0) {
      throw new IOException("GCC exited with non-zero exit code: " + exitCode);
    }
    return output;
  }
}
