#include <iostream>

int main() {

    int n;
    int m;

    do
    {
        std::cout << "Enter the number of lines: ";
        std::cin >> n;
    }
    while (n <= 0);

    do
    {
        std::cout << "Enter the number of columns: ";
        std::cin >> m;
    }
    while (m <= 0);

    for (int i = 1; i <= n; i++)
    {
        for (int k = 1; k < i; k++)
        {
            std::cout << " ";
        }

        for (int j = 1; j <= m; j++)
        {
            std::cout << "*";
        }

        std::cout << "\n";
    }

    char end; std::cin >> end;
    return 0;

}
