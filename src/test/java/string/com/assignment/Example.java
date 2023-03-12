package string.com.assignment;

public class Example {
    public static void main(String[]args) {
       String s=new String("my name is deepak");
      String rev="";
//        int l=s.length();
//        for(int i=l-1;i>=0;i--){
//            rev=rev+s.charAt(i);
//        }
//        System.out.println(rev);
//    }

        //___________________________________
        String s11=new String("My name is deepak my name");
        int  L= s11.length();
        int count=0;
        for(int i=0;i<L;i++) {

           char c = s11.charAt(i);
           if(c=='e'){
               count++;
           }
       }
        System.out.print(count);
    }
}
