import java.util.Scanner;
import java.util.Arrays;
public class Array
{

    public static void main(String[] args) {
        int len;
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter no. of elements you want in array:");
        len = read.nextInt();

        //allocating array
        String[] names = new String[len];
        for (int x=0; x < len; ++x ){
            System.out.println("Enter info how much do u want to add "+ (x+1));
            names[x] = read.next();
        }
        read.close();
        //printing outoput
        System.out.println("Your data are ! ");
        for(int x=0; x < len; ++x){
            System.out.println(names[x]);
        }
    }





 /*        
    public static void main(String[] args) 
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        String a[] = new String[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            Arrays.toString(a[i]) = s.next();
            // String str = System.out.println
            System.out.println(a + " th index is " + i );
            // sum = sum + a[i];
        }
        // System.out.println("Sum:"+sum);
    }
    */
}