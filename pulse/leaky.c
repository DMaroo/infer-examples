#include <stdlib.h>

int main(int argc, char *argv[]) {
    int *a = malloc(16);
    
    int *b = malloc(16);
    b[10] = 0;
    free(b);

    return 0;
}
