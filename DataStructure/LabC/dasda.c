#include <stdio.h>
void readData(float *, float *) ;
void calRecArea(float , float , float *) ;
void printData(float *) ;
void main(){
    float width, length, area ;
    readData(&width, &length) ;
    calRecArea(width, length, &area) ;
    printData(&area) ;

}
void calRecArea(float w, float l, float *pArea){
    *pArea = w * l ;
}
void readData(float *width, float *length){
    printf("Enter width : ") ;
    scanf("%f", width) ;
    printf("Enter length : ") ;
    scanf("%f", length) ;

}
void printData(float *pArea){
    printf("Rectangle area is %.2f", *pArea) ;
}