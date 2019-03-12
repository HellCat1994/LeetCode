package Y2019_3_4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> tree = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    tree.add(i);
                    tree.add(j);
                }
            }
        }
        int []ret = new int[tree.size()];
        int i=0;
        Iterator<Integer> iterator = tree.iterator();
        while (iterator.hasNext()){
            int buf = iterator.next();
            ret[i++] = buf;
        }
        return ret;
    }

    public static void main(String[] args) {

    }

}
