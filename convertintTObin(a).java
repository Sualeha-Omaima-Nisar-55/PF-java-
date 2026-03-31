import java.util.Scanner;
public class conversionInttoBin {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = sc.nextInt();

    int inpnum = num;
    int binary = 0;
    int place = 1;

    while (num > 0) {
        int remainder = num % 2;
        binary = binary + (remainder * place);
        num = num / 2;
        place = place * 10;
    }
    System.out.println(binary + " is binary conversion of  : " + inpnum);
}
}
