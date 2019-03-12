package Y2019_3_4;

import sun.nio.cs.ext.IBM037;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Administrator
 */
public class Longest_Substring_Without_Repeating_Characters {
    /**
     * 找到最大的不重复的字符串
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        Set<Integer> set = new TreeSet<>();
        StringBuilder string = new StringBuilder("");
        //首先包含第一个元素
        string.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            //查看是否包含此元素
            int pos = string.toString().indexOf(s.charAt(i));
            //此时说明存在该元素
            if(pos>=0){
                set.add(string.length());
                string.delete(0,pos+1);
            }
            string.append(s.charAt(i));
            set.add(string.length());
        }
        return ((TreeSet<Integer>) set).last();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
