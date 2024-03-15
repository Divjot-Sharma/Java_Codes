import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        while (num<=0) {
            System.out.println("Enter Value corectly ");
            num = sc.nextInt();
        }
        if (num % 2 == 0) {
            even(num);
        } else {
            odd(num);
        }

    }

    public static void odd(int num) {
        int[] earr = new int[Math.floorDiv(num, 2)];
        int[] oarr = new int[Math.floorDiv(num, 2)+1];
        int n1=0;
        int n2=0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                earr[n1] = i;
                n1++;
            }else if(i%2==1){
                oarr[n2] = i;
                n2++;
            }
            
        }
        System.out.print("Even numbers:");
        for (int inndex = 0; inndex < earr.length; inndex++) {
            System.out.print(earr[inndex] + ",");
        }
        System.out.println();
        System.out.print("Odd numbers:");
        for (int index = 0; index < oarr.length; index++) {
            System.out.print(oarr[index] + ",");
        }
    }
    

    public static void even(int num) {
        int[] earr = new int[num / 2];
        int[] oarr = new int[num / 2];
        int n1=0;
        int n2=0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                earr[n1] = i;
                n1++;
            }else if(i%2==1){
                oarr[n2] = i;
                n2++;
            } 
        }
        System.out.print("Even numbers:");
        for (int inndex = 0; inndex < earr.length; inndex++) {
            System.out.print(earr[inndex] + ",");
        }
        System.out.println();
        System.out.print("Odd numbers:");
        for (int index = 0; index < oarr.length; index++) {
            System.out.print(oarr[index] + ",");
        }

    }

}
