package StringAddCalculator;

import java.util.List;

class Adder {
    static int add(List<Integer> input) {
        int sum = 0;
        for (Integer num : input) {
            sum += num;
        }
        return sum;
    }
}
