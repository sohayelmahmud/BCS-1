#include <stdio.h>
int main()
{
    int speed, zone;
    float fine;
    printf("Enter speed and zone (1=school,2=highway,3=city): ");
    scanf("%d %d", &speed, &zone);
    int limit = (zone == 1) ? 30 : (zone == 2) ? 100
                                               : 60;
    if (speed > limit)
    {
        fine = (speed - limit) * 500;
        printf("Fine: %.0f Tk\n", fine);
    }
    else
        printf("Safe\n");

    printf("ID : 2411004\n");
    return 0;
}