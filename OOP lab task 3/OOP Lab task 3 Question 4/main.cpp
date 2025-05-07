#include <iostream>
using namespace std;

class Counter
{
private:
    int count;
public:

    Counter()
    {
        count = 0;
    }
    void incrementByValue(Counter c)
    {
        c.count++;
    }

    void incrementByReference(Counter &c)
    {
        c.count++;
    }

    void incrementByPointer(Counter* c)
    {
        c -> count++;
    }

    void displayCount() const
    {
        cout << "Count: " << count << endl;
    }
};

int main()
{
    Counter counter;
    cout << "Initial ";
    counter.displayCount();

    counter.incrementByValue(counter);
    cout << "After Increment By Value, ";
    counter.displayCount();

    counter.incrementByReference(counter);
    cout << "After Increment By Reference, ";
    counter.displayCount();

    counter.incrementByPointer(&counter);
    cout << "After Increment By Pointer, ";
    counter.displayCount();

    return 0;
}
