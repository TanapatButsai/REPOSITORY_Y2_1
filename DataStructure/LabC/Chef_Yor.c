#include <stdio.h>
#include <string.h>

void showFunction() {}
int main() {
  char operation[20];
  char list[20][20];
  int count = 1;
  while (1) {
    //printf("%d\n", count);
    //printf("oper: ");
    scanf("%s", operation);
    if (strcmp(operation, "exit") == 0) {
        printf("<< Menu >>\n");
        for (int x = 1; x < count; x++) {
          printf("%d. %s\n", (x), list[x]);
        }
        break;
      } 
    else if (strcmp(operation, "add") == 0) {
        char name[100];
        scanf("%s", name);
        //printf("\n|%s|\n", name);
        strcpy(list[count], name);
        //printf("\n|%s|\n", list[count]);
        count++;
      } 
    else if (strcmp(operation, "show") == 0) {
        printf("<< Menu >>\n");
        for (int x = 1; x < count; x++) {
          printf("%d. %s\n", (x), list[x]);
        }
      } 
    else if (strcmp(operation, "del") == 0) {
      int no;
      scanf("%d", &no);
      //printf("%d",no);
        if (no <=count)
        {
          strcpy(list[no],"");
          strcpy(list[no],list[no+1]);
          strcpy(list[no+1],"");      
          count--;
        }
      }
  }
}