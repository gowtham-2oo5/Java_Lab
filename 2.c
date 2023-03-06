#include<stdio.h>
#include<malloc.h>
struct node{
    int data;
    struct node* next;
};
struct node* head=NULL;
void create(int val)
{
     struct node *ptr = (struct node*)malloc(sizeof(struct node));     
        struct node *temp;  
            ptr->data = val;  
            if(head == NULL)  
            {  
                ptr -> next = NULL;  
                head = ptr;  
            }  
            else  
            {  
                temp = head;  
                while (temp -> next != NULL)  
                {  
                    temp = temp -> next;  
                }  
                temp->next = ptr;  
                ptr->next = NULL;
            }  
          
    }  


void display()
{
    
    if(head==NULL)
    printf("-1");
    else
    {
        int k;
        scanf("%d",&k);
        int g;
        struct node* temp=head;
        while(temp!=NULL)
        {
            g=temp->data;
            if(g<=k)
            printf("%d ",temp->data);
            
            temp=temp->next;
        }
    }
}
int main()
{
    int m;
    scanf("%d",&m);
    while(m!=0)
    {
        create(m);
        scanf("%d",&m);
    }
    display();
}
