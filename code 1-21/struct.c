#include < stdio.h >
struct s
{
	int a;
	int b;
};
int main()
{
	struct s a, * p = &a;
	a.a = 99;
	printf("%d\n", *p.a);
	return 0;
}//test
struct stu
{
	int num;
	char name[10];
	int age;
};
void fun(struct stu* p)
{
	printf( "% s\n", (*p).name);
	return;
}
int main()
{
	struct stu students[3] = { {9801,"zhang",20},
							 {9802,"wang",19},
			   {9803,"zhao",18}
	};
	fun(students + 1);
	return 0;
}//test
int main()
{
	int a = 0;
	
	printf("please enter money number\n");
	scanf_s("%d", &a);

	int flag = a;
	
	while (a>=2)
	{
		flag += a / 2;

		a = a / 2 + a % 2;
	}
	printf("drink %d cola\n",flag);
    return 0;
}
//  喝汽水，1瓶汽水1元，2个空瓶可以换一瓶汽水，给20元，可以多少汽水