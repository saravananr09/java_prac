import java.util.Scanner;


public class Test {
    public static void main(String[] args)
    {  
        Scanner read = new Scanner(System.in);
        int row, totalrow ,spaces, symbol;

        System.out.print("Enter the no.of row want to print : ");
        totalrow = read.nextInt();

        for(row = 1; row <= totalrow; row++){
            //spaces
            for(spaces = 1; spaces <= (totalrow-row); spaces++)
                System.out.print(" ");
                //printing symbol
                for(symbol = 1; symbol <= ((2*row)-1); symbol++)
                    System.out.print("$");
                
                System.out.print("\n");
                
            }
        

        // System.out.println("Enter the no.of row want to print : ");
        // row = read.nextInt();



        System.out.println("from saravanan !");
    }
}