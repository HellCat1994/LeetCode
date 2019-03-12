package Y2019_3_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression_Matching {
    /**
     *
     * @param s 原字符串
     * @param p 匹配模式
     * @return
     * tips: .匹配任意字符
     *       *匹配前面字符的0次或者多次
     */
    public boolean isMatch(String s, String p) {
        Pattern p1 = Pattern.compile("^"+p+"$");
        Matcher matcher = p1.matcher(s);
        if(matcher.find()){
            return true;
        }else{
            return false;
        }
    }
}
