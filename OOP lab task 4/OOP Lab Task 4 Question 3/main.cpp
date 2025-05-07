#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Product
{
public:
    string name;
    double price;
    int quantity;

    Product(string n, double p, int q) : name(n), price(p), quantity(q) {}

    double totalValue() const
    {
        return price * quantity;
    }
};

class Inventory {
public:
    vector<Product> products;

    void addProduct(const Product& p)
    {
        products.push_back(p);
    }

    void displayProductsAboveThreshold(double threshold)
    {
        for (const auto& product : products)
        {
            if (product.totalValue() > threshold)
            {
                cout << "Product: " << product.name << ", Price: " << product.price
                     << ", Quantity: " << product.quantity << ", Total Value: "
                     << product.totalValue() << endl;
            }
        }
    }
};

int main()
{
    Inventory inventory;
    string name;
    double price;
    int quantity;

    for (int i = 0; i < 5; ++i)
        {
        cout << "Enter details for Product " << i + 1 << endl;
        cout << "Name: ";
        cin >> name;
        cout << "Price: ";
        cin >> price;
        cout << "Quantity: ";
        cin >> quantity;

        Product product(name, price, quantity);
        inventory.addProduct(product);
    }

    cout << "\nProducts with total value exceeding $500:" << endl;
    inventory.displayProductsAboveThreshold(500.0);

    return 0;
}
