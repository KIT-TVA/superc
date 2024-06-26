#include <stdio.h>
#include <stdlib.h>

#include <openssl/crypto.h>

void error(const char *fmt, ...);

int main() {
  size_t BUFFER_SIZE = 256;
  unsigned char *buffer = OPENSSL_malloc(BUFFER_SIZE);
  for (size_t i = 0; i < BUFFER_SIZE; ++i) {
    buffer[i] = i;
  }

  #ifdef CONFIG_A
    OPENSSL_cleanse(buffer, BUFFER_SIZE);
  #endif

  // buffer freed but maybe not cleared
  OPENSSL_free(buffer);
  return 0;
}
