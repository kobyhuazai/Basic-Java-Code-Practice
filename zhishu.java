public  class zhishu{
     public static void main(String[] args){
           int count=0;
           for(int i=101;i<=200;i++){
                 for(int j=2;j<=i;j++){
                      if(j==i){
                         System.out.println(j);
                         count++;
                     
                       }
                       else if(i%j == 0){
                       break;

                       }                  
                      
                 }               
           }
           System.out.println("We have " + count +" zhishu");

     

    
  
      }




}