#include<stdio.h>

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
	char str[200] ;

	gets(str);
	int i;
	for (i = 0; str[i] != '\0'; i++);
	{
		if (str[i] >= 'A' && str[i] <= 'Z')

		{
			str[i] = str[i] + 32;
		}
		
	}
	
	printf("%s", str);



	return 0;

}