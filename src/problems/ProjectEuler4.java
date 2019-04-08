package problems;

/**
 * Problem 4:
 *
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class ProjectEuler4 {

    public ProjectEuler4() {}

    public int theLargesPalindromeFrom3Digits () {
        int theLargestPalindrome = 0;

        for (int i = 1; i < 999; i++){
            for(int j = 1; j < 999; j++){
                int newNumber = i*j;
                if(isPalindrome(newNumber)){
                    if(theLargestPalindrome < (i*j)) theLargestPalindrome = (i*j);
                }
            }
        }
        return theLargestPalindrome;
    }

    public boolean isPalindrome(int number) {
        String [] digits = String.valueOf(number).split("");
        int iterator = 0;
        while(digits[iterator].equals(digits[digits.length-iterator-1]) && iterator < digits.length / 2){
            iterator++;
        }
        return iterator == digits.length / 2;
    }
}
