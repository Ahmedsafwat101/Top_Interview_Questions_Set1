package Others;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        if (numRows == 0) return new ArrayList<>();
        answer.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = answer.get(i - 1);
            List<Integer> current = new ArrayList<>();

            current.add(1);

            for (int j = 1; j < i; i++) {
                current.add(prev.get(j - 1) + prev.get(j));
            }
            current.add(1);
            answer.add(current);
        }

        return answer;
    }
}
