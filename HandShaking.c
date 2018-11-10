#include <stdio.h>

void HandShaking(int N);

int main(){
    //DEKLARASI
    int N;
    
    printf("Masukkan jumlah baris = ");
    scanf("%d", &N);
    printf("\n");
    HandShaking(N);
}

void HandShaking(int N){
    int i,j;
    for (i = 1 ; i < N; i++){
            j=j+i;
        } 
    printf("%d ",j);
}
