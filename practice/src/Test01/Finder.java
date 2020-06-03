package Test01;

public class Finder {
    public int findKth(int[] a, int n, int K) {
        return find(a,0,n-1,K);
    }

    private int find(int[] array, int left, int right, int k) {
        int index = partation(array,left,right);
        if( k == index - left + 1){
            return array[index];
        }else if(k < index -left +1){
            return find(array,0,index -1,k);
        }else{
            return find(array,index+1,right,k -index + left -1);
        }
    }

    private int partation(int[] array, int left, int right) {
        int begin = left;
        int end = right;
        int base = array[left];
        while(begin < end){
            while(begin < end && array[end] >= base){
                end--;
            }while(begin < end && array[begin] <= base ){
                begin++;
            }
            swap(array,begin,end);
        }
        swap(array,left,begin);
        return begin;
    }

    private static void swap(int[] array,int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}