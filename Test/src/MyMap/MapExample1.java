package MyMap;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    //数组中只出现一次的数字
    /*
    1、使用按位异或
    2、使用Map
     */
    //按位异或
    // 数组中只有一个数字出现了一次，其他数字都出现两次
    //进行二进制异或运算，相同为0，不同为1，最后剩下的数字就是只出现一次的数字
    public static int singleNumber(int[] array){
        int ret = 0;
        for(int x:array){
            ret ^= x;
        }
        return ret;
    }

    //1、创建一个Map来统计数组中元素的个数，Key表示元素，Value表示出现次数；
    //2、遍历数组，完成统计；
    //3、遍历map，找到出现次数为1的数字
    public static int singleNumber2(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:array){
            Integer value = map.get(x);
            if(value == null){  //若当前数字不存在，新建一个键值对；
                map.put(x,1);
            }else{      //若当前数字存在，value+1；
                map.put(x,value+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue().equals(1)){
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,6,5,4,3,2,1};
        System.out.print("按位异或后的结果：");
        System.out.println(singleNumber(array));
        System.out.print("使用Map的结果：");
        System.out.println(singleNumber2(array));
    }
}
