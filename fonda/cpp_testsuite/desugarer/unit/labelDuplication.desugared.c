#include <stdbool.h>

extern void __static_parse_error(char *msg);
extern void __static_type_error(char *msg);
extern void __static_renaming(char *renaming, char *original);
extern void __static_condition_renaming(char *expression, char *renaming);

void __static_initializer_default();

extern const bool __static_condition_default_2;
extern const bool __static_condition_default_3;
void __static_initializer_default() {
__static_renaming("__x_0", "x");
__static_renaming("__main_1", "main");

__static_condition_renaming("__static_condition_default_2", "(defined A)");
__static_condition_renaming("__static_condition_default_3", "!(defined A)");

};

int  (__main_1) () {

{
if (__static_condition_default_2) {

{
{



int  __x_0;// L3

if (  __x_0  )// L4
{

{
{




{
goto lab_0;
}
}
}
}

lab_0:
{
 __x_0  = 1 ; // L9
}
return  __x_0  ;// L11
}
}


}

if (__static_condition_default_3) {

{
{



int  __x_0;// L3

if (  __x_0  )// L4
{

{
{




{
goto lab_1;
}
}
}
}

lab_1:
{
return  __x_0  ;// L11
}
}
}


}

}}

