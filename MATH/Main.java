import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double X,Y,Z;
        System.out.println("\033[H\033[2J");
        System.out.print("ENTER VALUE FOR PERPENDICULAR: ");
        X = sc.nextDouble();
        System.out.print("ENTER VALUE FOR BASE : ");
        Y = sc.nextDouble();
        Z = Math.sqrt(X*X+Y*Y);
        System.out.print("VALUE OF HYPOTENUSE : "+Z); 
}
}
