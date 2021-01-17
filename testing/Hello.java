import java.util.Scanner;


class Hello {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double n, sum = 0;
        System.out.print("Enter no. of elements you want in array:");
        n = read.nextDouble();
        // double[] myList = {7.5, 1.9, 2.9, 3.4, 3.5, 5.6};
        double a[] = new double[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextDouble();
            sum = sum + a[i];
        }


      // Print all the array elements
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
     
      // Summing all elements
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
      System.out.println("Total is " + total);
      
      // Finding the largest element
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);  
      // find min
      double min = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] < min) min = myList[i];
      }
      System.out.println("min is " + min);

    }
}