package Basics.com.Nithin;

public class PalindromeCheck {
    public static boolean palindrome(String s,int i,int n){
        if (i>=s.length()/2){
            return true;
        }
        else if(s.charAt(i) != s.charAt(n-i-1)) {
            return false;
        }
        return palindrome(s,i+1,n);
    }

    public static void main(String[] args){
        String s = "NITHIN";
        System.out.println(palindrome(s,0,s.length()));
    }
}
