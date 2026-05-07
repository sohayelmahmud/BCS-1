#include <stdio.h>
int main()
{
    float a, b, res;
    char op;
    printf("Enter a, operator, b: ");
    scanf("%f %c %f", &a, &op, &b);
    switch (op)
    {
    case '+':
        res = a + b;
        break;
    case '-':
        res = a - b;
        break;
    case '*':
        res = a * b;
        break;
    case '/':
        if (b != 0)
            res = a / b;
        else
        {
            printf("Error Division by zero\n");
            return 0;
        }
        break;
    default:
        printf("Invalid operator\n");
        return 0;
    }
    printf("Result: %.2f\n", res);

    printf("ID : 2411004\n");
    return 0;
}