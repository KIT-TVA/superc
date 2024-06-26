#include <stdbool.h>

extern void __static_parse_error(char *msg);
extern void __static_type_error(char *msg);
extern void __static_renaming(char *renaming, char *original);
extern void __static_condition_renaming(char *expression, char *renaming);

void __static_initializer_default();

extern const bool __static_condition_default_5;
extern const bool __static_condition_default_4;
extern const bool __static_condition_default_3;
void __static_initializer_default() {
__static_renaming("__a_0", "a");
__static_renaming("__main_1", "main");
__static_renaming("__main_2", "main");

__static_condition_renaming("__static_condition_default_3", "!(defined A)");
__static_condition_renaming("__static_condition_default_4", "(defined A)");
__static_condition_renaming("__static_condition_default_5", "!(defined A)");

if (__static_condition_default_5)
{
__static_parse_error("Unable to parse");
}
};
typedef int  __a_0;// L2

// typedef moved to top of scope
int  (__main_1) () {

if (__static_condition_default_3) {


}
}
int  (__main_2) () {

if (__static_condition_default_4) {

{
{



return 0 ;// L9
}
}


}
}

