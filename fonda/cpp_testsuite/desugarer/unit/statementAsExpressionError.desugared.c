#include <stdbool.h>

extern void __static_parse_error(char *msg);
extern void __static_type_error(char *msg);
extern void __static_renaming(char *renaming, char *original);
extern void __static_condition_renaming(char *expression, char *renaming);

void __static_initializer_default();

extern const bool __static_condition_default_4;
extern const bool __static_condition_default_5;
void __static_initializer_default() {
__static_renaming("__x_0", "x");
__static_renaming("__y_1", "y");
__static_renaming("__main_2", "main");
__static_renaming("__main_3", "main");

__static_condition_renaming("__static_condition_default_4", "!(defined A)");
__static_condition_renaming("__static_condition_default_5", "(defined A)");

};

int  __x_0;// L2
int  (__main_2) () {

if (__static_condition_default_4) {

{
{



int  __y_1;// L7

__static_type_error("type error") ; // L8
return 0 ;// L9
}
}


}
}
int  (__main_3) () {

if (__static_condition_default_5) {

{
{



int  __y_1;// L7

 __y_1  = ( 
{



 __x_0  ; // L8
}
 ) ; // L8
return 0 ;// L9
}
}


}
}

