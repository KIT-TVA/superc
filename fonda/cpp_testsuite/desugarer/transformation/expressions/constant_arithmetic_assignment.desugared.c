#include <stdbool.h>

extern void __static_parse_error(char *msg);
extern void __static_type_error(char *msg);
extern void __static_renaming(char *renaming, char *original);
extern void __static_condition_renaming(char *expression, char *renaming);

void __static_initializer_default();

void __static_initializer_default() {
__static_renaming("__x_0", "x");
__static_renaming("__main_1", "main");


};

int  (__main_1) (void  ) {

{
{



int  __x_0;// L2

 __x_0  = 3 ; // L4
 __x_0  += 1 ; // L6
 __x_0  -= 2 ; // L8
 __x_0  *= 5 ; // L10
 __x_0  /= 3 ; // L12
 __x_0  %= 4 ; // L14
return 0 ;// L16
}
}


}

