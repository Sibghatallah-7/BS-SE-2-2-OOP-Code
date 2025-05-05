#include <iostream>
using namespace std;

class laptop
{
private:
    string brand;
    string model;
    int serial;
    string color;
    float price;
    float processorspeed;
    int RAM;
    float screensize;

public:
    laptop(string b, string m, int s, string c, float p, float ps, int r, float ss)
    {
        brand = b;
        model = m;
        serial = s;
        color = c;
        price = p;
        processorspeed = ps;
        RAM = r;
        screensize = ss;
    }
    void display()
    {
        cout << "Brand: " << brand << endl;
        cout << "Model: " << model << endl;
        cout << "Serial Number: " << serial << endl;
        cout << "Color: " << color << endl;
        cout << "Price: " << price << endl;
        cout << "Processor Speed: " << processorspeed << endl;
        cout << "RAM: " << RAM << endl;
        cout << "Screen Size: " << screensize << endl;
        cout << "Brand: " << brand << endl;
    }
};
int main()
{
    laptop laptop1("Samsung", "AAA", 111, "White", 54, 1.4, 2, 4.6);
    laptop laptop1("Toshiba", "BBB", 222, "Black", 12, 0.6, 1, 6.9);
    laptop laptop1("Dell", "CCC", 333, "Red", 20, 2.0, 3, 10.3);

    cout << "Laptop 1 Details: " << endl;
    laptop1.display();

    cout << "Laptop 2 Details: " << endl;
    laptop2.display();

    cout << "Laptop 3 Details: " << endl;
    laptop3.display();

    return 0;
}
