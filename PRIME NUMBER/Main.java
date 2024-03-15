import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int option = 0;
        int num;
        int factnum = 0;
        while (option > 2 || option <= 0) {
            System.out.println("Enter (1) for Prime and Composite Checker ");
            System.out.println("Enter (2) for Prime and Composite Checker BUT TAB TAK");
            option = Sc.nextInt();
        }
        if (option == 1) {
            System.out.print("Enter Number:");
            num = Sc.nextInt();
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factnum++;
                }
            }
            if (factnum == 1) {
                System.out.println("The Number is 1");
            } else if (factnum == 2) {
                System.out.println("The Number is Prime");
            } else {
                System.out.println("The Number is Composite");
            }
        } else {
            System.out.print("Enter Number:");
            num = Sc.nextInt();
            ArrayList<Integer> arr1= new ArrayList<Integer>();
            ArrayList<Integer> arr2= new ArrayList<Integer>();
            if (num == 1) {
                System.out.println("Unique Number:1\nPrime Number:Nothing\nComposite Number:Nothing");
            } else {
                for (int i = 1; i <= num; i++) {
                    for (int j = 1; j <= num; j++) {
                        if (i % j == 0) {
                            factnum++;
                        }

                    }if(factnum==1){
                        System.out.println("Unique Number : [1]");
                    }
                    else if (factnum == 2) {
                       arr1.add(i);
                    } else {
                       arr2.add(i);
                    }
                    factnum=0;
                }

                    System.out.println("Prime Numbers "+arr1);
                    System.out.println("Composite Numbers "+arr2);
            }
        }
    }
}
