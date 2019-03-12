package Y2019_3_5;

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        if(stringBuilder.toString().compareTo(stringBuilder.reverse().toString())==0){
            return true;
        }else{
            return false;
        }
    }
}
