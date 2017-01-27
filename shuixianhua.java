public class shuixianhua{
    
   public static void main(String[] args){

        int i ,j,k;
        System.out.println("shuixianhua num are");
        for(int a=100;a<=999;a++){
           i = a/100;
           j = (a-i*100)/10;
           k = a%10;
           
           if(i*i*i+j*j*j+k*k*k == a ){
                 
                 System.out.println(a);
}


}

}    






}