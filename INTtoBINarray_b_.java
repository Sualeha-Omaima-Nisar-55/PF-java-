import java.util.Scanner;
public class INTtoBIN_b_{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        
        int[] binaryArray = convertToBinary(num);
        
        System.out.print("Binary representation: ");
        for (int bit : binaryArray) {
            System.out.print(bit);
        }
        sc.close();
    }
    
    public static int[] convertToBinary(int num) {
        StringBuilder binaryString = new StringBuilder();
        
        while (num > 0) {
            int remainder = num % 2;
            binaryString.insert(0, remainder);
            num /= 2;
        }
        
        int[] binaryArray = new int[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            binaryArray[i] = Character.getNumericValue(binaryString.charAt(i));
        }
        
        return binaryArray;
    }
}
