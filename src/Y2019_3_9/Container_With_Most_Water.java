package Y2019_3_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Container_With_Most_Water {
    private static List<Integer> list = new ArrayList<>();
    private static final int maxLenght = Integer.MIN_VALUE;
    private static int a[] = new int[maxLenght];
    private static void selectK(int n,int k,int b,int l,int [] height){//从n个数中找出k个数的排序组合
        --k;
        for(int i=b;i<n;i++){
            a[k]=i;
            if(k>0){
                selectK(n,k,i+1,l,height);
            }
            else{
                String str=" ";
                for(int dis=l-1;dis>=0;dis--){

                    str = str + String.valueOf(a[dis]);
                    if(dis == 0){
                        continue;
                    }
                    str = str +",";
                }
                String [] strings = str.trim().split(",");
                int left = Integer.valueOf(strings[0]);
                int right = Integer.valueOf(strings[1]);
                list.add((right-left)*Math.min(height[left-1],height[right-1]));
            }
        }
    }
    public static void sort(int n,int k,int [] height){
        selectK(n+1,k,1,k,height);
    }

    public static int maxArea(int[] height) {
        sort(height.length,2,height);
        Collections.sort(list, (o1, o2) -> o2-o1);
        return list.get(0);
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
