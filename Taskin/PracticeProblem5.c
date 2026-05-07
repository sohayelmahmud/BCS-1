#include <stdio.h>

int main()
{
    int n, i, j, s;

    printf("Enter n: ");
    scanf("%d", &n);

    for (i = 1; i <= n; i++)
    {
        for (s = 1; s <= n - i; s++)
        {
            printf(" ");
        }

        for (j = 1; j <= i; j++)
        {
            if (j == 1 || i == n || j == i)
            {
                printf("* ");
            }
            else
            {
                printf("  ");
            }
        }
        printf("\n");
    }

    printf("\nID : 2411004\n");

    return 0;
}