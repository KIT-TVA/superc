#include <stdbool.h>

extern void __static_parse_error(char *msg);
extern void __static_type_error(char *msg);
extern void __static_renaming(char *renaming, char *original);
extern void __static_condition_renaming(char *expression, char *renaming);

void __static_initializer_default();

extern const bool __static_condition_default_3;
extern const bool __static_condition_default_4;
void __static_initializer_default() {
__static_renaming("__x_0", "x");
__static_renaming("__main_1", "main");
__static_renaming("__main_2", "main");

__static_condition_renaming("__static_condition_default_3", "!(defined A)");
__static_condition_renaming("__static_condition_default_4", "(defined A)");

};

extern int  __x_0;// L2
int  (__main_1) () {

if (__static_condition_default_3) {

{
{



__static_type_error("type error") ; // L7
}
}


}
}
int  (__main_2) () {

if (__static_condition_default_4) {

{
{



 __x_0  ++ ; // L7
}
}


}
}

