import javax.swing.JOptionPane;
public class Main{
     public static void main(String[] args){
        String name =JOptionPane.showInputDialog("ENTER YOUR NAME");
        int age  =Integer.parseInt(JOptionPane.showInputDialog("ENTER YOUR AGE"));
        int clasS =Integer.parseInt(JOptionPane.showInputDialog("ENTER YOUR CLASS"));
        JOptionPane.showMessageDialog(null,"HI "+name+",\nYOU ARE "+age+" YEARS OLD.\nYOU ARE STUDYING IN CLASS "+clasS+".");

        

     }
}