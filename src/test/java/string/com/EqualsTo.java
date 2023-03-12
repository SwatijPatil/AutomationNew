package string.com;

public class EqualsTo {
    public static void main(String[]args){
        String s="Hi";
        String s2="Hi";
        if(s.equals(s2)){
            System.out.println(" will compare the content and return the value as same");
        }
else{
            System.out.println(" will compare the content and return the value as different");
        }

//___________________________________
        String s11=new String("HELLO");
        String s12=new String("HELLO");//Case sensitive
        if(s11.equals(s12)){
            System.out.println("same");
        }
        else{
            System.out.println("different");
        }


    }

    }

