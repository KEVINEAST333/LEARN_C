#include<iostream>
#include <string>
using namespace std;
class Dog {
public:
	Dog(int initialAge , int initialWeight );
	~Dog();
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this->age = age;
	}
	int getWeight() {
		return weight;
	}
	void setWeight(int weight) {
		this->weight = weight;
	}
private:
	int age, weight;
};
	Dog::Dog(int initialAge, int initialWeight) {
		age = initialAge;
		weight = initialWeight;
	}
	Dog::~Dog() {
	}
	//int main() {
	//	Dog Jack(2, 10);
	//	cout << "杰克是条";
	//	cout << Jack.getAge() << "岁" << Jack.getWeight() << "磅重的狗" << endl;
	//	Jack.setAge(7);
	//	Jack.setWeight(20);
	//	cout << "现在杰克是";
	//	cout << Jack.getAge() << "岁" << Jack.getWeight() << "磅重的狗" << endl;
	//	return 0;
	//}