#include <stdio.h>
int square(int* value);
int square(int* value) {
    return (*value) * (*value); // dereferenzierung
}
int main() {
    int x = 3;
    int x2 = 4;
    int* y = &x2; // erstellen Referenz auf die Speicheradresse von x

    int result1 = square(y);
    int result2 = square(&x);

    printf("%i\n", result1);
    printf("%i\n", result2);

}

