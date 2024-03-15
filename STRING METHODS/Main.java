public class Main {
    public static void main(String[] args){
        // string methods
        // concatenate -combines two or more strings
        String First_name ="Divjot";
        String Last_name  ="Sharma";
        String Full_name =First_name +" "+ Last_name;
        System.out.println(Full_name);
        // charAt() - show character at  demanded position  
        // Java is 0 index based language
        System.out.println(First_name.charAt(0));
        System.out.println(First_name.charAt(1));
        System.out.println(First_name.charAt(2));
        System.out.println(First_name.charAt(3));
        System.out.println(First_name.charAt(4));
        System.out.println(First_name.charAt(5));
        //length() - show length of string
        System.out.println(First_name.length());
        // replace() -replace a cerrtain character 
        String food = new String("pasta");
        System.out.println(food.replace('p','P'));
        // substring 
        System.out.println(Full_name.substring(0, 6));

    }
}
