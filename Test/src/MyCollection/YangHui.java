package MyCollection;

import java.util.ArrayList;
import java.util.List;

public class YangHui {
    public List<List<Integer>> generate(int numRows){
        if(numRows<1){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        //第一行
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        if(numRows == 1){
            return result;
        }
        //第二行
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        result.add(second);
        if(numRows == 2){
            return result;
        }
        //第n行
        for(int row=3;row<=numRows;row++){
            List<Integer> prev = result.get(row-1-1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for(int col =2;col<row;col++){
                int curNum = prev.get(col-1-1)+prev.get(col-1);
                cur .add(curNum);
            }
            cur.add(1);
            result.add(cur);
        }
        return result;
    }
}
