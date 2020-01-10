#include <iostream>
int main() {
    int n;
    do
    {
        std::cout << "Enter the number of lines: ";
        std::cin >> n;
    }
    while (n <= 0);
    for (int i = 1; i <= n; i++)
    {
        for (int k = 1; k <= n - i; k++)
        {
            std::cout << " ";
        }
        for (int j = 1; j <= i; j++)
        {
            std::cout << "*";
        }
        std::cout << "\n";
    }
    char end; std::cin >> end;
    return 0;
}