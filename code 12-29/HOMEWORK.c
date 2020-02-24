#include<stdio.h>
int main()
{
	int a[ 10]  = { {0},{3} };
	/*a[0] = 5 * 2;*/
	/*a[1] = a[2] * a[0];*/
	a[9] = 2;

	a[0] = 1;
	return 0;
}
#include <stdio.h>
int main()
{
	int arr[] = { 1,2,(3,4),5 };
	printf("%d\n", sizeof(arr[0]));
	return 0;
}
#include <stdio.h>
int main()
{
	char str[] = "hello bit";
	char a[] = { 'a','b','c' };
	printf("%d %d\n", sizeof(str), sizeof(a));
	return 0;
}

int main()
{
	int i = 0;
	int j = 0;
	int a[5] = { 1, 2, 3, 4, 5, };
    int b[5] = { 6, 7, 8, 9, 10, };
	int c[5] = { 0 };
	j = sizeof(a) / sizeof(a[0]);
	for (i = 0; i <= j; i++)
	{
		c[i] = a[i];
		a[i] = b[i];
		b[i] = c[i];

		printf("a[]=%d b[]=%d c[]=%d", a[i], b[i], c[i]);

	}
	

	return 0;
}
#define N 10
init(int *b,int x) //初始数组为零
{
	int i = 0;
	for (i = 0; i < x; i++)
	{
		*b = 0;
		printf("%d\n", *b);
		b++;
		
	}
}
print(int *a,int x)//da yin
{
	int i = 0;
	for (i = 0; i <x; i++)
	{
		printf("%d  ", *a);
		a++;
	}
}
reverse(int *a,int x)//ni zhi
{
	int i = 0;
	int j = 0;
	int b[10] = { 0 };
	for (i = x-1; i >= 0; i--)
	{
		b[i] = *a;
		a++;
	}
	a -= 10;

	for (j = 0; j < 10; j++)
	{
		*a = b[j];
		printf("%d  ", *a);
		a++;
	}
	
	return 0;
}

int main()
{
	int a[N] = { 1,2,3,4,5,6,7,8,9,10 };
	init(a, N);
	print(a, N);
	reverse(a, N);
	return 0;
}
int main()
{
	int i = 0;
	int a[] = { 3,2,10,4,8 };
	int l = sizeof(a) / sizeof(a[0]);
	int j = 0;
  for (j = 0; j < l - 1; j++)
	{
		for (i = 0; i < l - 1 - j; i++)
		{
			if (a[i] >= a[i + 1])
			{
				int t = 0;
				t = a[i + 1];
				a[i + 1] = a[i];
				a[i] = t;
			}
		}

	}
	for (i = 0; i < 5; i++)
	{
		printf("%d  ", a[i]);
	}
	

	return 0;
}
//   冒泡排序一串数字
//fuxi
