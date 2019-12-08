#include <stdio.h>
int GET_MAX(int x,int y)
{
	if (x > y)
	{
		printf("%d", x);
		
		return x;


	}
	else
		return y;


}
int main()
{
	
	int num1 = 10;
	int num2 = 28;
	int max = GET_MAX(num1, num2);
	printf("%d\n", max);
	return 0;
}