import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("\033[H\033[2J");
        System.out.println("ENTER RANGE FOR RANDOM :");
        a = sc.nextInt();
        System.out.println("\033[H\033[2J");
        int b = (int)(Math.random()* a);
        System.out.println("RANDOM NUMBER : "+b);


    }
    
}
