#include <iostream>
using namespace std;

class Temperature
{
private:
    double celsius;

public:
    double getCelsius() const
    {
        return celsius;
    }
    void setCelsius(double c)
    {
        celsius = c;
    }
    double getFahrenheit() const
    {
        return (celsius * 9 / 5) + 32;
    }
    void setFahrenheit(double f)
    {
        celsius = (f - 32) * 5 / 9;
    }
};

int main()
{
    Temperature temp;

    temp.setCelsius(25);
    cout << "Celsius: " << temp.getCelsius() << "'C" << endl;
    cout << "Fahrenheit: " << temp.getFahrenheit() << "'F" << endl;

    temp.setFahrenheit(77);
    cout << "Celsius: " << temp.getCelsius() << "'C" << endl;
    cout << "Fahrenheit: " << temp.getFahrenheit() << "'F" << endl;

    return 0;
}
