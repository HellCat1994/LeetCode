package Y2019_3_5;


public class Reverse_Integer {
    public static int reverse(int x) {
        long retNum;
        String num = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(num);
        if(stringBuilder.charAt(0)=='-'){
            stringBuilder.delete(0,1);
            retNum = Long.valueOf("-"+stringBuilder.reverse().toString());
        }else {
            retNum = Long.valueOf(stringBuilder.reverse().toString());
        }
        if(retNum>Integer.MAX_VALUE || retNum < Integer.MIN_VALUE){
            return 0;
        }else{
            return (int) retNum;
        }
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
    }
}
