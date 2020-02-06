#include<stdio.h>

int main()
{
	int i = 6;
	int a[6]= { 1,2,3,4,5 ,6};
	int b[6];
	int k= 0  ;
	int c = 0 ;
	int j = 0 ;
	int m = 0 ;
	scanf_s("%d", &k);
	 c = k;
	if (k >= 0 && k < i)
	{
		m = i - k;
		for (j = 0; j <m; j++)
		{
			
				b[k] = a[j];
			
				k++;

		}
		k = c;
		for (j = m; j < i; j++)
		{
			b[k-c ] = a[j];
			k++;
		}
		
		for (i = 0; i < 6; i++)
		{
			printf("  %d  ", b[i]);
		}


	}
	
	return 0;
} //»»
