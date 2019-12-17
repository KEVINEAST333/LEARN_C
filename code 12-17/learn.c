#include<stdio.h>
 ADD1(int *x,int *y)
{ 
	 int z = *x + *y;
		 return z;
}
 ADD2(int* x, int* y)
 {
	 int z = *x + *y;
	 return z;
 }
int main()
{
	int num1 = 100;
	int num2 = 200;
	int t = 0;
	int x = 0;
	
	t=ADD1(&num1, &num2);
	x= ADD2(&num1, &num2);
	printf("%d", t);
	printf("%d", x);
	return 0;
}
void CHENG(int*a)
{
	int i = 0;
	int j = 0;
	int t = 0;
	for (i = 1; i <= *a; i++)
	{
		for (j = i; j <= *a; j++)
		{
			t = i * j;
			printf("%d*%d=%d\n", i,j,t);
			
		}
	}
	
}
int main()
{
	int a = 0;
	printf("请输入一个数\n");
	scanf_s("%d", &a);
	 CHENG(&a);
	

	return 0;
}
函数实现乘法口诀表
void change(int* x, int* y)
{
	int t = 0;
	t = *x;
    *x = *y;
	*y = t;
	

}
int main()
{
	int num1 = 100;
	int num2 = 200;
	change(&num1, &num2);
	printf("%d,%d",num1, num2);

	return 0;
}
函数交换两个数
void change(int* x, int* y)
{
	int t = 0;
	t = *x;
	*x = *y;
	*y = t;


}
int main()
{
	int num1 = 0;
	int num2 = 0;
	printf("请输入两个数\n");
	scanf_s("%d %d", &num1, &num2);
	change(&num1, &num2);
	printf("%d,%d", num1, num2);

	return 0;
}