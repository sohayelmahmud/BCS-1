#include <stdio.h>

int fact(int n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * fact(n - 1);
    }
}

int ncr(int n, int r) {
    return fact(n) / (fact(r) * fact(n - r));
}

int main() {
    int n, r;
    
    scanf("%d %d", &n, &r);
    
    int result = ncr(n, r);
    
    printf("%d\n", result);
    printf("ID : 2411004");
    
    return 0;
}