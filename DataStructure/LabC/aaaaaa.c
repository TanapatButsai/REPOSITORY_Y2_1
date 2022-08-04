#include<stdio.h>
int a(int n){
    if (n > 0){
        if (n == 1){
       return n+1;
    }
    else {
        return(a(n-1)+3);
    }
}
    }
int main(){
    printf("%d",a(5));
}