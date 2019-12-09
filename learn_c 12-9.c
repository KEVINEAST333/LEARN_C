#include<stdio.h>
void test()
{
	int a =0 ;
	 a = a++;
	
	printf("%d\n", a);


}
int main()
{   int i = 0;
	for (i = 0; i < 10; i++)
	{
		test();

	}


return 0;
}


#include<stdio.h>
void test()
{
	static int a = 0;
	a = a++;

	printf("%d\n", a);


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