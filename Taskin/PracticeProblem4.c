#include <stdio.h>
int main()
{
    int level;
    printf("Enter level (0-100): ");
    scanf("%d", &level);
    printf("Pump %s\n", level >= 80 ? "OFF" : "ON");
    if (level < 20)
        printf("Critical LOW\n");

    printf("ID : 2411004\n");
    return 0;
}