#include<iostream>
#include<cmath>
using namespace std;
int fnl(int i,int j);
int sum(int k);
int main() {
	int i, j, x, y;
	cin >> i;
	//cin >> j;
	/*x = fnl(i, j);
	y = i * j / x;
	cout << "最大公约数" << x <<endl;
	cout << "最小公倍数 " << y << endl;*/
	cout << sum(i) << endl;
}
int fnl(int i, int j)
{
	int temp;
	if (i < j) {
		temp = i;
		i = j;
		j = temp;
	}
	while (j != 0) {
		temp = i % j;
		i = j;
		j = temp;
	}
	return i;
}
int sum(int k ) {
	if (k == 1) {
		return 1;
	}
	return k + sum(k - 1);
}
