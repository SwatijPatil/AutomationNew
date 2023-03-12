package string.com.assignment;

public class MyWordOccurance {
    public static void main(String[]args){
        String s="my name id deepak my name ";
      String s2[]=s.split(" ");
      int L=s2.length;
      System.out.println(L);
      String rev="";
      for(int i=L-1;i>=0;i++){

          rev=rev+s.charAt(i);
      }

    }
}
