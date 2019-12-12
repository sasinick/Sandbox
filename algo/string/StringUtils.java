/* @ 18/11/2019
   Utility class methods should be static
    WHY: In a class Car you might have a method double convertMpgToKpl(double mpg)
         which would be static, because one might want to know what 35mpg converts to,
         even if nobody has ever built a Car. But void setMileage(double mpg) 
         (which sets the efficiency of one particular Car) can't be static
         since it's inconceivable to call the method before any Car has been constructed.
   On the horizon:
    1) Count Vowels
        save aeiou in a ref string
        use a for loop to convert string to char
        use contains to check with ref string
    2) Reverse String
    3) Reverse Words
    4) Rotations
    5) Remove Duplicates
    6) Most repeated char
    7) Sentence Capitalization
    8) Anagrams: Using sorting
              Using Histrogramming
    9) Pallindrome

*/

package algo.string;

public class StringUtils{

    public static int countVowels(Sting input) {

        return null;
    }
}