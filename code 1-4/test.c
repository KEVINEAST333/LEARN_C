#include <stdio.h>
int main()
{
	int a, b, c;
	a = 5;
	c = ++a;
	b = ++c, c++, ++a, a++;
	b += a++ + c;
	printf("a = %d b = %d c = %d\n:", a, b, c);
	return 0;
}
int main()
{
	int a = 15;
	int b = 17;
	b = a + b;
	a = b - a;
	b = b - a;
	printf("a = %d ,b = %d", a, b);
	return 0;
}
int main()
{
		int a = 15;
	   int b = 17;
	   a = a ^ b;
	   b = a ^ b;
	   a = a ^ b;
	   printf("a = %d,b = %d", a,b);

	return 0;
}
int find1(int a)
{
	int flag = 0;
	while (a != 0)
	{

		if (a % 2 == 1 )
		{
			flag++;
			/*a = a / 2;*/
		}
		a = a / 2;
	}
	return flag;
	

}
int main()
{
	int a = 0;
	int ret = 0;
	printf("enter a number\n");
	scanf_s("%d",&a);
	ret = find1(a);
	printf("%d", ret);

	return 0;
}
