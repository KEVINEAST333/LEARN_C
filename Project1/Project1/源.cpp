#include <iostream>
#include <vector>
using namespace std;
//定义基类Base，含有两个共同成员函数fn1、fn2，
//私有派生出Derived类，通过Dervied类的对象调用基类函数fn1()，请写出源程序。
class Base {
public :
    Base() {};
    ~Base() {
    };
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

class Dervied : private Base {
public:
    Dervied() {};
    ~Dervied() {};
};




//int main()
//{
//
//    Dervied d ;
//    d.fn1(); 
//    return 0;
//}