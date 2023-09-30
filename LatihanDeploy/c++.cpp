#include <iostream>
using namespace std;

int main() {
    // Tipe data
    int num;

    // Input
    cout << "Masukkan bilangan bulat positif: ";
    cin >> num;

    // Inisialisasi faktorial
    int factorial = 1;

    // For loop
    if (num >= 0) {
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Output hasil faktorial
        cout << "Faktorial dari " << num << " adalah " << factorial << endl;
    } else {
        cout << "Masukkan bilangan bulat positif." << endl;
    }

    // Contoh penggunaan array satu dimensi
    int arrSatuDimensi[5] = {1, 2, 3, 4, 5};
    cout << "Contoh array satu dimensi: ";
    for (int i = 0; i < 5; i++) {
        cout << arrSatuDimensi[i] << " ";
    }
    cout << endl;

    // Contoh penggunaan array multidimensi
    int arrMultiDimensi[2][3] = {{1, 2, 3}, {4, 5, 6}};
    cout << "Contoh array multidimensi:" << endl;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            cout << arrMultiDimensi[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
