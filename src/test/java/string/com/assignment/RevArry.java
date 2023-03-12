package string.com.assignment;

public class RevArry {
    public static void main(String[]args){
        String s="My name is Deepak";
        String[] s2=s.split(" ");
        int L=s2.length;
        System.out.println(s2.length);
        for(int i=L-1;i>=0;i--){
            System.out.println(s2[i]);
        }
    }
}
