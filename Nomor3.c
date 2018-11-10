#include <stdio.h>

int main(){
    //DEKLARASI
    int i,j,N,k;
    
    printf("Masukkan jumlah baris = ");
    scanf("%d", &N);
    printf("\n");
    
    if(N > 10){
        printf("Masukkan anda lebih dari 10");
    }
    else{
    for (i = 1 ; i <= 10; i++){
        for(k= 1; k<=i; k++){
            printf("%d, ",k);
        }
        printf("\n");   
    }
    }
}
