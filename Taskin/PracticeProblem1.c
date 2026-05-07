#include <stdio.h>
int main()
{
    int total, defective;
    float pct;
    printf("Enter total and defective: ");
    scanf("%d %d", &total, &defective);
    pct = (defective * 100.0) / total;
    if (pct < 2)
        printf("Excellent\n");
    else if (pct < 5)
        printf("Acceptable\n");
    else
        printf("Poor\n");

    printf("ID : 2411004\n");
    return 0;
}