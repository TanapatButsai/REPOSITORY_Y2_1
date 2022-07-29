#include <stdio.h>
struct Location
{
    char province[20],subDistrict[20];
};
struct Flower 
{ 
    char name[20];
    char id[20];
    int price;
    struct Location location;
};
void main(){
    struct Flower flower[3];

    for (int i = 0; i < 3; i++)
    {
        printf("Input the name, id, price, province and subDistrict of the flower\n");
        scanf("%s %s %d %s %s",&flower[i].name,&flower[i].id,&flower[i].price,&flower[i].location.province,&flower[i].location.subDistrict);
        printf("\n");
    }
    printf("================================\nOUTPUT\n================================\n");
    for (int i = 0; i < 3; i++)
    {
        printf("%s %s %d %s %s\n\n",&flower[i].name,&flower[i].id,flower[i].price,&flower[i].location.province,&flower[i].location.subDistrict);
    }
}