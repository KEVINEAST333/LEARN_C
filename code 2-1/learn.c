#include<stdio.h>

//Tolowercase()
//{
//
//
//}
//
//int main()
//{
//	char str[20];
//	int i = 0;
//
//
//	printf("please entre a str\n");
//	for (i = 0; i <= 20; i++)
//	{
//		scanf_s("%s", &str[i]);
//		i++;
//	}
//
//
//
//	for (i = 0; i <= 20; i++)
//	{
//		printf("%s", &str[i]);
//	}
	




//
//
//	return 0;
//}
//#include <stdio.h>
//#include <string.h>
//
//int main() {
//	char ch = 0;
//	//ch = getchar();
//	while ((ch = getchar()) != EOF) {
//		if ((ch >= 'a') && (ch <= 'z')) {
//			//ch = ch - 32;
//			ch = ch - ('a' - 'A');
//			printf("ch=%c\n", ch);
//		}
//		else if ((ch >= 'A') && (ch <= 'Z')) {
//			//ch = ch + 32;
//			ch = ch + ('a' - 'A');
//			printf("ch=%c\n", ch);
//		}
//	}
//
//	return 0;
//}

int main()
{
	char a[100];
	int i;
	gets(a);
	for (i = 0; a[i] != '\0'; i++)
	{
		if (a[i] >= 'a' && a[i] <= 'z')
			a[i] -= 32;

	}
	printf("%s", a);
	return 0;
}