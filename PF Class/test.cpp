#include <bits/stdc++.h>

using namespace std;

int main()
{
    int myList[] = {1, 2, 3, 4, 5};
    int n = sizeof(myList) / sizeof(myList[0]);

    for (int i = 0; i < n - 1; i++)
    {
        swap(myList[i], myList[i + 1]);
    }

    for (int i = 0; i < n; i++)
    {
        cout << myList[i] << " ";
    }

    return 0;
}