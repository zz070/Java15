package Test30;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

    public class SortInt {
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String s;
            while ((s = bf.readLine()) != null) {
                int N = Integer.parseInt(s);
                String[] mat = new String[N];
                for (int i = 0; i < N; i++) {
                    mat[i] = bf.readLine();
                }
                Arrays.sort(mat, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        if (o1.length() < o2.length()) {
                            return -1;
                        }
                        if (o1.length() > o2.length()) {
                            return 1;
                        }
                        return o1.compareTo(o2);
                    }
                });
                for (String item : mat) {
                    System.out.println(item);
                }
            }
        }
    }
