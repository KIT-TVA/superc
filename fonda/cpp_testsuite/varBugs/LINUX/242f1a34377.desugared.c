#include <stdbool.h>

extern void __static_parse_error(char *msg);
extern void __static_type_error(char *msg);
extern void __static_renaming(char *renaming, char *original);
extern void __static_condition_renaming(char *expression, char *renaming);

void __static_initializer_default();

extern const bool __static_condition_default_3;
extern const bool __static_condition_default_10;
extern const bool __static_condition_default_11;
extern const bool __static_condition_default_5;
extern const bool __static_condition_default_1;
extern const bool __static_condition_default_4;
void __static_initializer_default() {
__static_renaming("__crypto_alloc_ablkcipher_0", "crypto_alloc_ablkcipher");
__static_renaming("__test_cipher_2", "test_cipher");
__static_renaming("__main_8", "main");
__static_renaming("__main_9", "main");

__static_condition_renaming("__static_condition_default_1", "(defined CONFIG_CRYPTO_BLKCIPHER)");
__static_condition_renaming("__static_condition_default_3", "(defined CONFIG_CRYPTO_TEST)");
__static_condition_renaming("__static_condition_default_4", "(defined CONFIG_CRYPTO_BLKCIPHER) && (defined CONFIG_CRYPTO_TEST)");
__static_condition_renaming("__static_condition_default_5", "!(defined CONFIG_CRYPTO_BLKCIPHER) && (defined CONFIG_CRYPTO_TEST)");
__static_condition_renaming("__static_condition_default_10", "!(defined CONFIG_CRYPTO_TEST)");
__static_condition_renaming("__static_condition_default_11", "(defined CONFIG_CRYPTO_TEST)");

};

void  * ((__crypto_alloc_ablkcipher_0) ()) {

if (__static_condition_default_1) {

{
{



return ( void  * ) 0 ;// L4
}
}


}
}
static void  (__test_cipher_2) () {

if (__static_condition_default_3) {

{
{



if (__static_condition_default_4) {
 __crypto_alloc_ablkcipher_0 ( ) ; // L11
}
if (__static_condition_default_5) {
__static_type_error("type error") ; // L11
}
}
}


}
}
int  (__main_8) (int  __argc_6, char  * (* (__argv_7))) {

{
if (__static_condition_default_10) {

{
{



}
}


}

}}
int  (__main_9) (int  __argc_6, char  * (* (__argv_7))) {

{
if (__static_condition_default_11) {

{
{



 __test_cipher_2 ( ) ; // L18
}
}


}

}}

