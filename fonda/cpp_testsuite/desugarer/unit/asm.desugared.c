#include <stdbool.h>

extern void __static_parse_error(char *msg);
extern void __static_type_error(char *msg);
extern void __static_renaming(char *renaming, char *original);
extern void __static_condition_renaming(char *expression, char *renaming);

void __static_initializer_default();

void __static_initializer_default() {
__static_renaming("__val_0", "val");
__static_renaming("__main_1", "main");


};

int  (__main_1) () {

{
{



int  __val_0;// L3

__asm__( "bswapq %0" : "=r" (  __val_0  ) : "0" (  __val_0  ) );
return 0 ;// L5
}
}


}

