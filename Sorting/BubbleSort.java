package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {22,43,-23,1,64,21};

        //Ascending order
        // for(int i=array.length-1;i>=0;i--){

        //     for(int j = 0 ; j <= i-1;j++){
        //         if(array[j]>array[j+1]){
        //             swap(array,j,j+1);
        //         }
        //     }
        // }
        

        // Descending order
        for(int i=0;i<array.length;i++){

            for(int j = array.length-1;j>=i+1;j--){
                if(array[j-1]<array[j]){
                    swap(array,j-1,j);
                }
            }
        }
        

        for(int i = 0;i < array.length; i++){
            System.out.println(array[i]);
        }
        
    }

    public static void swap(int[] arr,int i,int j){
        
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}