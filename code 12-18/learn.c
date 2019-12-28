#include<stdio.h>
struct stu
{
	char name[20];
	char sex[5];
	int age;


};
struct stu s = { "王鹏程","man",20 };
struct stu b = { "王东","man",21 };
 print1(struct stu s)
{
	 printf("%s %d %s\n", s.name ,s.age, s.sex);

}
 print2(struct stu *s, struct stu* a)
 {
	 if (s->age > a->age)
	 {
		 printf("%s %d %s\n", s->name, s->age, s->sex);
	 }
	 else if(s-> age< a->age)
	 {
		 printf("%s %d %s\n", a->name, a->age, a->sex);
	 }
	 else {
		 printf("%s %d %s\n", a->name, a->age, a->sex);
		 printf("%s %d %s\n", s->name, s->age, s->sex);
	 }

 }

int main()
{
	
	print1(s);
	print1(b);
	print2(&s,&b);
	

	return 0;
}
结构体练习；
