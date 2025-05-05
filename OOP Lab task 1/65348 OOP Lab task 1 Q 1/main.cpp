#include <iostream>
using namespace std;

class AverageCalculator
{
private:
    float values[100];
    int size;

public:
    void inputValues(int numValues)
    {
        size = numValues;
        cout << "Please enter " << size << " floating-point values:" << endl;
        for (int i = 0; i < size; i++)
        {
            cout << "Enter value " << (i + 1) << ": ";
            cin >> values[i];
        }
    }

    float sumValues()
    {
        float sum = 0.0;
        for (int i = 0; i < size; i++)
        {
            sum += values[i];
        }
        return sum;
    }

    float average()
    {
        return sumValues() / size;
    }

    void outputValues()
    {
        cout << "The values entered are: ";
        for (int i = 0; i < size; i++)
        {
            cout << values[i] << " ";
        }
        cout << endl;
    }
};

int main()
{
    int numValues;

    cout << "Enter the number of values(or size) you want to input (up to 100): ";
    cin >> numValues;

    if (numValues <= 0 || numValues > 100)
    {
        cout << "Please enter a positive number of values between 1 and 100!" << endl;
        return 1;
    }

    AverageCalculator calc;

    calc.inputValues(numValues);

    calc.outputValues();

    cout << "The sum of the values is: " << calc.sumValues() << endl;

    cout << "The average of the values is: " << calc.average() << endl;

    return 0;
}
