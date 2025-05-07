#include <iostream>
using namespace std;

class Computer
{
protected:
    int word_size;
    int memory_size;
    int storage_size;
    int speed;
public:
    Computer(int w = 0, int m = 0, int s = 0, int sp = 0)
        : word_size(w), memory_size(m), storage_size(s), speed(sp) {}

    void setSpecs(int memory, int speed)
    {
     memory_size = memory;
        speed = speed;
    }

    void setSpecs(int memory, int speed, int storage)
    {
      memory_size = memory;
     speed = speed;
 storage_size = storage;
    }

void display()
{
        cout << "Computer Specifications:\n";
        cout << "Word Size: " << word_size << " bits\n";
        cout << "Memory Size: " << memory_size << " MB\n";
        cout << "Storage Size: " << storage_size << " MB\n";
        cout << "Speed: " << speed << " MHz\n";
}
};

class Laptop : public Computer
{
private:
    float length;
    float width;
    float height;
    float weight;
public:
    Laptop(int w = 0, int m = 0, int s = 0, int sp = 0, float l = 0, float wd = 0, float h = 0, float wt = 0)
     : Computer(w, m, s, sp), length(l), width(wd), height(h), weight(wt) {}

    void setSpecs(float l, float wd, float h, float wt)
    {
     length = l;
     width = wd;
     height = h;
     weight = wt;
    }
    void display()
    {
        cout << "Computer Specifications:\n";
        cout << "Word Size: " << word_size << " bits\n";
        cout << "Memory Size: " << memory_size << " MB\n";
        cout << "Storage Size: " << storage_size << " MB\n";
        cout << "Speed: " << speed << " MHz\n";
        cout << "Laptop Dimensions (L x W x H): " << length << " x " << width << " x " << height << " cm\n";
        cout << "Weight: " << weight << " kg\n";
 }
};

int main()
{
    int word_size, memory_size, storage_size, speed;
    float length, width, height, weight;
    cout << "Enter Computer specifications:\n";
    cout << "Word Size (bits): ";
    cin >> word_size;
    cout << "Memory Size (MB): ";
    cin >> memory_size;
    cout << "Storage Size (MB): ";
    cin >> storage_size;
    cout << "Speed (MHz): ";
    cin >> speed;

    Computer comp(word_size, memory_size, storage_size, speed);
    comp.display();

    cout << "\n Enter Laptop specifications:\n";
    cout << "Word Size(bits): ";
    cin >> word_size;
    cout << "\n Memory Size (MB): ";
    cin >> memory_size;
    cout << "\n Storage Size(MB): ";
    cin >> storage_size;
    cout << "\n Speed (MHz): ";
    cin >> speed;
    cout << "\n Length (cm): ";
    cin >> length;
    cout << "\n Width (cm): ";
    cin >> width;
    cout << "\n Height(cm): ";
    cin >> height;
    cout << "\n Weight (kg): ";
    cin >> weight;

    Laptop lap(word_size, memory_size, storage_size, speed, length, width, height, weight);
    lap.display();

    return 0;
}
