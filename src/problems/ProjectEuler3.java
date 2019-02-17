package problems;

import java.util.Set;
import java.util.TreeSet;

/**
 * Problem 3:
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */

public class ProjectEuler3 {



    public ProjectEuler3 () {

    }

    public int largestPrimeFactor(double number) {
        Set<Integer> PrimeFactors = new TreeSet<>();
        int i = 2;
        while (number > 1){
            if (number % i == 0) {
                PrimeFactors.add(i);
                number = number / i;
            } else {
                i++;
            }

        }
        return ((TreeSet<Integer>) PrimeFactors).last();
    }

}
