package Test15;

public class Add {
    public int addAB(int A, int B) {
        // write code here
        while(B != 0){
            int c = A^B;
            int cur = (A&B)<<1;
            A = c;
            B = cur;
        }
        return A;
    }
}}
