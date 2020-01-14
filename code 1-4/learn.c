#include <stdio.h>
int print(int* a)
{
	int i = 0;
	for(i=1;i<=10;i++)
	{
		printf("%d\n", *a);
		a++;
	}

}
int main()    
{
	int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
	print(arr);

	return 0;
}
int main()
{
	int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
	int* a = arr;
	int j = sizeof(arr) / sizeof(arr[0]);
	int i;
	for (i = 1; i <= j; i++)
	{
		printf("   %d", *a);
		a++;
	}

		return 0;
}
#include <stdio.h>
int main()
{
	int a = 0x11223344;
	char* pc = (char*)&a;
	*pc = 0;
	printf("%x\n", a);
	return 0;
}
#include <stdio.h>
int main()
{
	int arr[] = { 1,2,3,4,5 };
	short* p = (short*)arr;
	int i = 0;
	for (i = 0; i < 4; i++)
	{
		*(p + i) = 0;
	}
	for (i = 0; i < 5; i++)
	{
		printf("%d ", arr[i]);
	}
	return 0;
}
int main()
{
	unsigned long pulArray[] = { 6,7,8,9,10 };
	unsigned long* pulPtr;
	pulPtr = pulArray;
	*(pulPtr + 3) += 3;
	printf(" %d, %d\n", *pulPtr, *(pulPtr + 3));
}
void Reverse(char* a, int k)

{
	
	char b[10] = {0};
	int i;
	int j;
	for (i = k-2 ; i>=0; i--)
	{
		b[i] = *a;
		
		a++;
	}

	printf("%s\n", &b[0]);
	

}
int main()
{
		char str[] = "hello bit";
		
		int a = sizeof(str);	
		Reverse(str,a);
		return 0;
	
}
//#include<stdio.h>
int main()
{
	int i = 0;
	int j = 0;
	int line = 0;


	for (i = 1; i <= 7; i++) //控制行数
	{
		//先打印空格
		for (j = 1; j <= (7 - i); j++) //正三角中需要打印空格的行数为正三角的行数-1(最后一行不用打空格)
		{
			printf(" ");
		}
		//再打印*
		for (j = 1; j <= 2 * i - 1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	//倒三角
	for (i = 1; i < 7; i++) //控制行数
	{
		//先打印空格
		for (j = 1; j <= i; j++)
		{
			printf(" ");
		}
		for (j = 1; j <= 2 * (7 - i) - 1; j++)
			//再打印*
		{
			printf("*");
		}
		printf("\n");
	}
}

int main()
{
	int a = 0;
	printf("please enter a number:> ");
	scanf_s("%d", &a);
	int sn = a * 1 + a * 11 + a * 111 + a * 1111 + a * 11111;
	printf("%d", sn);

	return 0;
}
	