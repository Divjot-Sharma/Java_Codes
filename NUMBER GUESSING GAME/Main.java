import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h_or_e;   
        System.out.println("ENTER 1 FOR GUESSING NUMBER IN RANGE BETWEEN 0 - 100");
        System.out.println("ENTER 2 FOR GUESSING NUMBER IN CUSTOM RANGE ");
        int chice = sc.nextInt();
        sc.nextLine();
        System.out.println("ENTER (H) FOR HARD MODE AND (E) FOR EASY MODE");
        h_or_e = sc.nextLine() ;
    }
}