// 
import java.util.Scanner;


public class Testone {

    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        System.out.println("Enter the number : ");
        String unumber = read.next();
        int len = String.valueOf(unumber).length();

        try {
            
            if(len>=10){
            System.out.println("Your number is :  " + unumber + " and its length is " + len);
            }
            else{
                System.out.println("Your number must be in 10 digits!!!");
            }
        } 
        catch (Exception err) {
            System.out.println(err);
        }
        lenarr = new String[len];
        System.out.println(lenarr[0]);
        int i=0;
        while( i <= len){

            System.out.println(len + " out of !" +i);
            ++i;
        }
    }
}







