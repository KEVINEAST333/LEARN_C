#include <stdio.h>
//int main()
//{
//	int a, b, c;
//	a = 5;
//	c = ++a;
//	b = ++c, c++, ++a, a++;
//	b += a++ + c;
//	printf("a = %d b = %d c = %d\n:", a, b, c);
//	return 0;
//} // TEST
//int main()
//{
//	int a = 15;
//	int b = 17;
//	b = a + b;
//	a = b - a;
//	b = b - a;
//	printf("a = %d ,b = %d", a, b);
//	return 0;
//} //  JIAO HUAN  
//int main()
//{
//		int a = 15;
//	   int b = 17;
//	   a = a ^ b;
//	   b = a ^ b;
//	   a = a ^ b;
//	   printf("a = %d,b = %d", a,b);
//
//	return 0;
//}
//int find1(int *a)
//{
//	int flag = 0;
//	while (*a != 0)
//	{
//
//		if (*a % 2 == 1 )
//		{
//			flag++;
//		}
//		*a = *a / 2;
//	}
//	return flag;
//	
//}
//int main()
//{
//	int a = 0;
//	int ret = 0;
//	printf("enter a number\n");
//	scanf_s("%d",&a);
//	ret = find1(&a);
//	printf("%d", ret);
//
//	return 0;
//}
//
//#include <stdio.h>
//int main()
//{
//	int date = 0;
//	printf("请输入数字：");
//	scanf_s("%d", &date);
//	int a[32];
//	int i = 0;
//	for (i = 0; i < 32; i++)
//	{
//		a[i] = date % 2;
//		date /= 2;
//	}
//	printf("偶数：");
//	for (i = 31; i >= 0; i -= 2)
//	{
//		printf("%d", a[i]);
//	}
//	printf("\n");
//	printf("奇数：");
//	for (i = 30; i >= 0; i -= 2)
//	{
//		printf("%d", a[i]);
//	}
//	system("pause");
//	return 0;
//
//}
//int main()
//{
//	int a = 0;
//	int b = 0;
//	int flag = 0;
//	printf("please enter two number\n");
//	scanf_s("%d %d", &a, &b);
//	while (a != 0 || b != 0)
//	{
//		if (a % 2 != b % 2)
//		{
//			flag++;
//		}
//		a = a / 2;
//		b = b / 2;
//	}
//	printf("%d\n", flag);
//
//	return 0;
//}
