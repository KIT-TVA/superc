#include <stdbool.h>

extern void __static_parse_error(char *msg);
extern void __static_type_error(char *msg);
extern void __static_renaming(char *renaming, char *original);
extern void __static_condition_renaming(char *expression, char *renaming);

void __static_initializer_default();

extern const bool __static_condition_default_5;
extern const bool __static_condition_default_6;
extern const bool __static_condition_default_10;
extern const bool __static_condition_default_3;
extern const bool __static_condition_default_9;
extern const bool __static_condition_default_4;
void __static_initializer_default() {
__static_renaming("__nondet_0", "nondet");
__static_renaming("__err_1", "err");
__static_renaming("__netpoll_setup_2", "netpoll_setup");
__static_renaming("__main_7", "main");
__static_renaming("__main_8", "main");

__static_condition_renaming("__static_condition_default_3", "(defined CONFIG_NETPOLL)");
__static_condition_renaming("__static_condition_default_4", "(defined CONFIG_NETPOLL) && (defined CONFIG_IPV6)");
__static_condition_renaming("__static_condition_default_5", "(defined CONFIG_NETPOLL) && !(defined CONFIG_IPV6)");
__static_condition_renaming("__static_condition_default_6", "(defined CONFIG_NETPOLL) && (defined CONFIG_IPV6)");
__static_condition_renaming("__static_condition_default_9", "!(defined CONFIG_NETPOLL)");
__static_condition_renaming("__static_condition_default_10", "(defined CONFIG_NETPOLL)");

};

int  (__nondet_0) () {

{
{



return 42 ;// L1
}
}


}
int  (__netpoll_setup_2) () {

if (__static_condition_default_3) {

{
{



int  __err_1;// L6

if (__static_condition_default_4) {
 __err_1  = - 1 ; // L9
}
if (__static_condition_default_5) {

{
goto put_0;
}
}
if (__static_condition_default_6) {
if (  __nondet_0 ( ) )// L10
{

{
goto put_0;
}
}
}

put_0:
{
return  __err_1  ;// L17
}
}
}


}
}
int  (__main_7) (void  ) {

if (__static_condition_default_9) {

{
{



return 0 ;// L26
}
}


}
}
int  (__main_8) (void  ) {

if (__static_condition_default_10) {

{
{



 __netpoll_setup_2 ( ) ; // L24
return 0 ;// L26
}
}


}
}

