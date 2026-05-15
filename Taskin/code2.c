#include <stdio.h>
#include <string.h>

int main() {
    char str[10];
    scanf("%s", str);
    
    int n = strlen(str);
    int flag = 0;
    
    for (int i = 0, j = n - 1; i < j; i++, j--) {
        if (str[i] != str[j]) {
            printf("not palindrome\n");
            flag = 1;
            break;
        }
    }
    
    if (flag == 0) {
        printf("palindrome\n");
    }
    
    printf("ID : 2411004");
    
    return 0;
}