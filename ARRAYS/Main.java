import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int Ramu_age = 40 ;
        int kaku_age = 30 ;
        //int[] ages= new int[2];
        // ages[0]=Ramu_age;
        //ages[1]=kaku_age;
        // Or
        int[] ages={40,30};
       
        System.out.println(ages[1]);
        System.out.println(ages.length);
        Arrays.sort(ages);
        System.out.println(ages[1]);

 
    }
}  