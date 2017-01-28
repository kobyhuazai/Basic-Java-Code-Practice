import java.io.*;
public class  Copyfilebyte
{
      public static void main(String[] args){
            try{
                FileInputStream in = new FileInputStream("input.txt");
                FileOutputStream out = new FileOutputStream("output.txt");
                int a ;
                while ((a=in.read()) != -1){
                   out.write(a); 
                 }
               





                }catch(IOException e)  
                {  
                  e.printStackTrace();  
                 }  

}




}



