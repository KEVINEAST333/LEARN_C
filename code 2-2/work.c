#include<stdio.h>
//int main()
//{
//	int num = 7;
//	int sum = 7;
//	sum = num++, sum++, ++num;
//	printf("%d", sum);
//
//
//
//
//	return 0;
/*}*/// test
//ToLowerCase(char str[20])
//{
//	int i = 0;
//	for (i = 0; i < 20; i++);
//	{
//		if ( str[i]>'A' &&  str[i]<='z');
//		{
//			str[i] = str[i] + 32;
//		}
//		printf("%s", str);
//
//		/*return str[20];*/
//	}



//}
int main()
{
	char str[20];
	char f[20];
    printf("enter a str\n");
	gets(str);
	int i;
	for (i = 0; i < 20; i++);
	{
		if (str[i] > 'A' && str[i] <= 'z');
		{
			str[i] = str[i] + 32;
		}
	}
	/*ToLowerCase(str);*/
	/*f[20] = str[20];*/
	/*printf("%s", f);*/
	printf("%s", str);



	return 0;

}