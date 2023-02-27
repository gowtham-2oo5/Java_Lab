#include<stdio.h>
#define s 50
int st[s];
int top;
void set()
{
	top=-1;
}
void push()
{
	if(top==-1)
	printf("No plates\n");
	else if(top<s)
	{
		int pn;
		scanf("%d",&pn);
		top++;
		st[top]=pn;
		printf("Inserted %d",st[top]);
		if(pn%2==0)
		printf("\nEven\n");
		else
		printf("\nOdd\n");
	}
	else
	printf("Stack full");
}
void pop()
{
	printf("Removed %d\n",st[top]);
	top--;
}
void display()
{
	int i;
	for(i=top;i>0;i--)
	printf("%d\n",st[i]);
}
int main()
{
	int loop=1,k;
	while(loop)
	{
		printf("***MENU***\n");
		printf("1. Insert\n");
		printf("2. Remove\n");
		printf("3. Display\n");
		printf("4. Exit\n");
		scanf("%d",&k);
		switch(k)
		{
			case 1:push();break;
			case 2:pop();break;
			case 3:display();break;
			case 4:loop=0;break;
			default:printf("Invalid input\n");
		}
	}
	return 0;
}
