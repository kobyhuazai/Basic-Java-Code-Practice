public class Selectsort{
     public static void swap(int[] data, int a, int b) {  
        int t = data[a];  
        data[a] = data[b];  
        data[b] = t;  
         }  
     public static void Selectsort(int arr[]){

         int min;
         for(int i = 0;i<(arr.length-1);i++){
               min=i;
               for(int j= i+1;j<(arr.length);j++){
                     if(arr[j]<arr[min]){

                    min=j;

                      }
                  
                }
               swap(arr,i,min);


          }

     }


     public static void main(String[] args){
           int arr[]={1,5,8,6,10,43,55,233,54};
           Selectsort(arr);
         
            for(int i = 0;i<arr.length;i++){
                   System.out.print(arr[i]+" ");
                
           }

      }

}