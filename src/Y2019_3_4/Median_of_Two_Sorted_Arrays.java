package Y2019_3_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Median_of_Two_Sorted_Arrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //集合两个数组之后排序
        List<Integer> list = new ArrayList();
        if(nums1.length!=0){
            for(int i=0;i< nums1.length;i++){
                list.add(nums1[i]);
            }
        }
        if(nums2.length!=0){
            for(int i=0;i< nums2.length;i++){
                list.add(nums2[i]);
            }
        }
        Collections.sort(list);
        //偶数个
        if(list.size()%2==0){
            return (double)(list.get(list.size()/2)+list.get(list.size()/2-1))/2;
        }
        else{
            return (double)list.get(list.size()/2);
        }
    }

    public static void main(String[] args) {
        int [] a1 = new int[]{1,3};
        int [] b1 = new int[]{2,4};
        findMedianSortedArrays(a1,b1);

    }
}
