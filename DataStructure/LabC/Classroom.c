#include <stdio.h>
#include <string.h>
void main(){
    int input , numRow ,count =0;
    scanf("%d",&input);
    numRow = (input / 6)+1; //จำนวนแถว
    char seat[numRow][6],x = "X";
    for (int i = 0; i < numRow; i++)
    {
        for (int j = 0; j < 6; j++)
        {
            if (count != input)
            {
                seat[i][j] = "X";
            } else {
                break;
            }
            
            count += 1;
        } 
    }
    for (int i = 0; i < numRow; i++)
    {
        for (int j = 0; j < 6; j++)
        {
            if (j == 5)
            {
                printf("%s\n",seat[i][j]);
            }else{
                printf("%s ",seat[i][j]);
            }
            
            
            count += 1;
        } 
    }




    // for (int i = 0; i < numRow; i++)
    // {
    //     for (int j = 0; j < 6; j++)
    //     {
    //         if (j == 5){

    //             printf("X\n");

    //         } else if (count == input){
                
    //             break;

    //         } else{
    //             printf("X ");
    //         }
    //         count += 1;
    //     } 
    // }
    
}