#include <stdbool.h>

extern void __static_parse_error(char *msg);
extern void __static_type_error(char *msg);
extern void __static_renaming(char *renaming, char *original);
extern void __static_condition_renaming(char *expression, char *renaming);

void __static_initializer_default();

extern const bool __static_condition_default_11;
extern const bool __static_condition_default_8;
extern const bool __static_condition_default_12;
extern const bool __static_condition_default_9;
void __static_initializer_default() {
__static_renaming("__x_7", "x");
__static_renaming("__x_10", "x");
__static_renaming("__main_13", "main");

__static_condition_renaming("__static_condition_default_8", "(defined A) && !(defined B)");
__static_condition_renaming("__static_condition_default_9", "!(defined A) && !(defined B)");
__static_condition_renaming("__static_condition_default_11", "(defined A) && (defined B)");
__static_condition_renaming("__static_condition_default_12", "!(defined A) && (defined B)");

};
struct __x_0 {
int  __a_1;// L4
unsigned  __a_2;// L6
};
struct __x_3 {
int  __a_4;// L4
unsigned  __a_5;// L6
int  __b_6;// L9
};

struct __x_0 ;// L1
struct __x_3 ;// L1
int  (__main_13) () {

{
{



struct __x_0  __x_7;// L15
{
if (__static_condition_default_8) {
__x_7.__a_1 = 1;
__static_type_error("designator doesn't exist.");
}
if (__static_condition_default_9) {
__x_7.__a_2 = 1;
__static_type_error("designator doesn't exist.");
}
}

struct __x_3  __x_10;// L15
{
if (__static_condition_default_11) {
__x_10.__a_4 = 1;
__x_10.__b_6 = 2;
}
if (__static_condition_default_12) {
__x_10.__a_5 = 1;
__x_10.__b_6 = 2;
}
}

return 0 ;// L16
}
}


}

