public class bubblesort{
     public static void swap(int[] data, int a, int b) {  
        int t = data[a];  
        data[a] = data[b];  
        data[b] = t;  
         }  
     public static void bubblesort(int arr[]){
           boolean swapped = true; 
           while(swapped){
              swapped = false;
              for(int i=0;i<(arr.length-1);i++){
                  if (arr[i]>arr[i+1]){
                       swap(arr,i,i+1);
                       swapped = true;
                      }  
               }

             }


      }
        
     public static void main(String[] args){
           int arr[]={1,5,8,6,9};
           bubblesort(arr);
         
            for(int i = 0;i<arr.length;i++){
                   System.out.print(arr[i]+" ");
                
           }

      }

}