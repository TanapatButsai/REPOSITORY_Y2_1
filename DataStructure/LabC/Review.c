#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
int main(){
    int total_review, idKeep;
    scanf("%d", &total_review);
    if (total_review < 0)
    {
        printf("ERROR");
        exit(0);
    }else if (total_review == 0)
    {
        printf("No reviews found");
        exit(0);
    }
    char namestr[total_review][100], strHold[100];
    double score[total_review], scoreKeep;
    int id[total_review];
    for (int i = 0; i < total_review ;i++)
    {
        scanf("%lf %s", &score[i], namestr[i]);
        id[i]=i+1;
    }
    double total = 0;
    for(int x=0;x<total_review;x++)
    {
        total += score[x];
    }
    printf("Average Score: %.2lf\n", (total/total_review));

    for (int i = 0; i < total_review; ++i) 
        {
            for (int j = i + 1; j < total_review; ++j) 
            {
                if (score[i] < score[j]) 
                {
                    scoreKeep = score[i];
                    strcpy(strHold,namestr[i]);
                    idKeep = id[i];
                    score[i] = score[j];
                    strcpy(namestr[i],namestr[j]);
                    id[i] = id[j];
                    score[j] = scoreKeep;
                    strcpy(namestr[j],strHold);
                    id[j] = idKeep;
                }
            }
        }
    for (int i = 0; i < total_review; i++)
    {
        printf("%.2lf %s (id: %d)\n",score[i],namestr[i],id[i]);
    }
    
}
            
            
            
            


        
        
        
        