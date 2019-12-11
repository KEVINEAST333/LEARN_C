#include <stdio.h>
int main()
{
	int i = 0;
	for (i = 0; i < 10; i++)
	{
		if (i = 5)
			printf("%d ", i);
	}
	return 0;
}
判断写成赋值 死循环 程序循环打印


#include<stdio.h> 
int main()
{

	int i = 1;
	while (i <= 100)
	{
		if (0 == i % 3)
		{
			printf("%d\n", i);
		}
		i++;
	}
	return 0;
}


# include <stdio.h>
int main()
{
	int a,b, c;
	printf("请输入三个数\n");
	scanf_s("%d%d%d", &a, &b,&c);
	if (a > b && a > c)
	{
		if (b > c)
		{
			printf("%d,%d,%d" ,a , b, c);
		
		}
		else
			printf("%d %d %d",a , c, b);
	}
	else if (b > a&& b > c)
	{
		if (a > c)
		{
			printf("%d %d %d",b, a, c);

		}
		else
			printf("%d %d %d",b ,c ,a);
	}
	else if (c > a&& c > b)
	{
		if (b > a)
		{
			printf("%d %d %d",c, b, a);

		}
		else
			printf("%d %d %d",c, a, b);
	}

	return 0;
}
#include <stdio.h>
int main() {
	int x = 3;
	int y = 3;
	switch (x % 2){
	case 1:
		switch (y)
		{
		case 0:
			printf("first ");
		case 1:
			printf("second ");
			break;
		default: printf("hello ");
			
		}
		
	case 2:
		printf(" third");
	}
	return 0;
}
#include<stdio.h>
int main()
{
	int b;
	switch (1)
	{
	case 1: b = 30;
	case 2: b = 20;
	case 3: b = 16;
	default: b = 0;
	}
	printf("%d", b);
	return b;
}


#include<stdio.h>
int main()
{
	int i, j, flag;
	for (int i = 2; i < 100; i++)
	{
		flag = 1;
		for (int j = 2; j < i; j++)
		{
			if (i % j == 0)
			{
				flag = 0;
				break;
			}
		}
		if (flag)
			printf("%d\n", i);
	}
}
#include<stdio.h>
int main()
{
	int flag;
	int i = 2;
	while ( i < 100)
	{
		flag = 1;
		int j = 2;
		while ( j < i)
		{
			if (i % j == 0)
			{
				flag = 0;
				break;
			}
			j++;
		}
		if (flag)
			printf("%d\n", i);
		i++;
	}
}
#include <stdio.h>
int main () 
{

	int i = 1;
	while (i<=10)
	{
		if (i == 5)
			/*continue ;*/
		break;
		printf("%d\n", i);
		i++;

	}

	return 0;
}