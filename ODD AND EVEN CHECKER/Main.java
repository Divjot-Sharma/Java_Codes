import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num= sc.nextInt();
        if (num % 2==0) {
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
