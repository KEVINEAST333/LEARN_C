#include<stdio.h>
int main()
{
	int a = 0;
	printf("good study 1 or 0\n");
	scanf_s("%d",&a);
	if (a == 1)
	{
		printf("offer");
	}

	else
	{
		printf("go home");
	}

	return 0;
  }
#include<stdio.h>
int ADD(int x, int y)
{
	int z = x + y;

	return z;
}

int main()

{
	int num1 = 0;
	int num2 = 0;
	int sum = 0;
	printf("please enter two numbers\n");
	scanf_s("%d,%d", &num1, &num2);
	sum=ADD(num1, num2);
	printf("%d",sum);
	return 0;


}
#include <stdio.h>
int main()
{
	int a = 4;
	int b = 7;
	b = ++a;
	printf("%d\n", b);
	printf("%d\n", a);




	return 0;
}
#include<stdio.h>
void test()
{
	static int i = 0;
	i++;
	printf("%d\n", i);


}
int main()
{
	int i = 0;
	for (i = 0; i < 10; i++)
	{
		test();
	}


	return 0;
}
#define MAX 10
#define ADD(x,y) ((x)+(y))
#include<stdio.h>
int main()
{
	printf("%d\n",MAX);
	 printf("%d\n", ADD(4,5) );
	return 0;
}
#include<stdio.h>
int main()
{
	int num = 10;
	int* p = &num;
	*p = 20;
	printf("%d", num);



	return 0;
}