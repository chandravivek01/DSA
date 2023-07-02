package recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

    static List<String> result = new ArrayList<>();
    public static void main(String[] args) {

        int n = 4;

        backtrack("(", new ArrayList<>(), n, 1, 0);
        System.out.println(result);
     }
     public static void backtrack(String string, List<String> list, int n, int open, int close) {

        if (string.length()==2*n) {
            list.add(string);
            result = list;
            return;
        }

        if (open<n)
            backtrack(string + "(", list, n, open+1, close);
        if (close<open)
            backtrack(string + ")", list, n, open, close+1);
     }
}
