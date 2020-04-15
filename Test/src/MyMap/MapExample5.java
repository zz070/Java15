package MyMap;

import java.util.*;

public class MapExample5 {
    //前K个高频词

    /*
    题目描述：
            给一非空的单词列表，返回前 k 个出现次数最多的单词。

     注意：
            返回的答案应该按单词出现频率由高到低排序。
            如果不同的单词有相同出现频率，按字母顺序排序。

     思路：
            1、用一个map保存所有单词，key表示单词，value表示该单词出现的次数；
            2、将统计的单词放到ArrayList中；
            3、对ArrayList进行排序；
            4、返回前k个单词
     */

    public List<String> topKFrequent(String[] words, int k){
        //1、用一个map保存所有单词
        Map<String,Integer> map = new HashMap<>();
        for(String s : words){
            int count = map.getOrDefault(s,0);
            map.put(s,count+1);
        }
        //2、将统计的单词放到ArrayList中；
        ArrayList<String> arrayList = new ArrayList(map.keySet());
        //3、排序
        Collections.sort(arrayList,(o1,o2)->{
            int count1 = map.get(o1);
            int count2 = map.get(o2);
            if(count1 == count2){
                return o1.compareTo(o2);
            }
            return count2-count1;
        });
        //4、返回前k个单词
        return arrayList.subList(0,k);
    }
}
