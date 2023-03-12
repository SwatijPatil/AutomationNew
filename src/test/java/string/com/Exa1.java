package string.com;

public class Exa1 {
    public static void main(String[]args){
        String s="Hi";
        String s2="Hi";
        if(s==s2){
            System.out.println("same");
        }
        else{
            System.out.println("different");
        }

        String s11=new String("HELLO");
        String s12=new String("HELLO");//Case sensitive
        if(s11==s12){
            System.out.println("same");
        }
        else{
            System.out.println("different");
        }


    }
}
