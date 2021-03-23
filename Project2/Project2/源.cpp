#include<iostream>
using namespace std;

class Base
{
public:
    Base() {}
    ~Base() {}
    void fn1();
    void fn2();
};

void Base::fn1()
{
    cout << "Base fn1 is used." << endl;
}

void Base::fn2()
{
    cout << "Base fn2 is used." << endl;
}

class Derived :public Base
{
public:
    Derived() {}
    ~Derived() {}
};

int main()
{
    Derived n;
    n.fn1();
    n.fn2();
    return 0;
}
