package problems;

import java.util.ArrayList;

/**
 * Problem 2:
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class ProjectEuler2 {

    ArrayList<Integer> array = new ArrayList<>();

    public ProjectEuler2() { }

    public int sumTermsFibonacci(){
        array.add(1);
        array.add(2);
        int sum = 2;
        int i = 2;

        while (array.get(i-2) + array.get(i-1) <= 4000000){
            int num = array.get(i-2) + array.get(i-1);
            array.add(num);
            i++;
            if ((num % 2) == 0) sum += num;
        }

        return sum;
    }
}
