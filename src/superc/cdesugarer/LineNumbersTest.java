package superc.cdesugarer;

import java.util.List;
import superc.cdesugarer.CActions.LineNumbers.Range;

public class LineNumbersTest extends junit.framework.TestCase {

  /** Create a new test class. */
  public LineNumbersTest() { /* Nothing to do. */ }

  /** Test line number merging. */
  public void testMerge() {
    List<List<CActions.LineNumbers>> testCases = List.of(
      List.of(
        new CActions.LineNumbers("main.c", List.of(new Range(1, 2))),
        new CActions.LineNumbers("main.c", List.of(new Range(3, 4))),
        new CActions.LineNumbers("main.c", List.of(new Range(1, 4)))
      ),
      List.of(
        new CActions.LineNumbers("main.c", List.of(new Range(3, 4))),
        new CActions.LineNumbers("main.c", List.of(new Range(1, 2))),
        new CActions.LineNumbers("main.c", List.of(new Range(1, 4)))
      ),
      List.of(
        new CActions.LineNumbers("main.c", List.of(new Range(1, 2))),
        new CActions.LineNumbers("main.c", List.of(new Range(4, 42))),
        new CActions.LineNumbers("main.c", List.of(new Range(1, 2), new Range(4, 42)))
      ),
      List.of(
        new CActions.LineNumbers("main.c", List.of(new Range(1, 2), new Range(4, 5))),
        new CActions.LineNumbers("main.c", List.of(new Range(3, 4))),
        new CActions.LineNumbers("main.c", List.of(new Range(1, 5)))
      ),
      List.of(
        new CActions.LineNumbers("main.c", List.of(new Range(3, 4))),
        new CActions.LineNumbers("main.c", List.of(new Range(1, 2), new Range(4, 5))),
        new CActions.LineNumbers("main.c", List.of(new Range(1, 5)))
      )
    );

    for (List<CActions.LineNumbers> testCase : testCases) {
      CActions.LineNumbers first = testCase.get(0);
      CActions.LineNumbers second = testCase.get(1);
      CActions.LineNumbers expected = testCase.get(2);
      CActions.LineNumbers merged = new CActions.LineNumbers(first, second);
      assertEquals(expected, merged);
    }
  }
}
