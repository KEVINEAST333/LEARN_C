#include<stdio.h>
int main()
{
	int i = 5;
	int a[5] = { 1,2,3,4,5 };
	int b[5];
	int k ;
	int j ;
	scanf_s("%d", &k);
	if (k >= 0 && k < i)
	{
		for (j = 0; j <= i - k-1; j ++)
		{
			
				b[k] = a[j];
			
				k++;

		}

		for (j = i - k; j < 5; j++)
		{
			b[k - 1] = a[j];
			k--;
		}

	}
	for (i = 0; i < 5; i++)
	{
		printf("  %d  ", b[i]);
	}




	return 0;
} //test