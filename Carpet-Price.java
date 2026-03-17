import java.util.Scanner;
public class CARpetPrice{
  public static void main(String[] args) {
     Scanner keyb= new Scanner(System.in);
        System.out.print("Enter length in inches:");
        int length= keyb.nextInt();
        while(length<0){
            System.out.println("ERROR: length can't be negative");
        System.out.println("Enter length again!");
        System.out.print("Enter length in inches:");
        length=keyb.nextInt();
        }
        System.out.print("Enter breadth in inches:");
        int breadth= keyb.nextInt();
        while(breadth<0){
            System.out.println("BREADTH Can not be negative");
            System.out.println("Enter breadth again!");
            System.out.print("Enter breadth in inches:");
            breadth=keyb.nextInt();
          }
         double lengthft= length/12;
         double breadthft= breadth/12;
         double area= lengthft*breadthft;
         System.out.print("TOTAL AREA:");
         System.out.println(area);
         System.out.println("Enter price of carpet in sq ft:");
         double price= keyb.nextDouble();
         System.out.print("Enter discount percentage:");
         double DP= keyb.nextDouble();
         double discountamount=price*DP/100;
         System.out.print("Discount amount is:");
        System.out.println(discountamount);

        System.out.print("Discounted price: " + (price-discountamount));
       System.out.println();
  }
}
