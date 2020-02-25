import java.util.Arrays;

public class interview {
    public static void main(String[] args) {
       duplicates();
    }

    /* Reverse string algorithm */
    public static String reverse(String source) {
        /* source is the string */
        if (source == null || source.isEmpty()) {
            return source; /* check if source is empty */
        } else {
            String reverse = "";
            for (int i =  source.length() -1; i >= 0; i--) { /* checks source string len */
                reverse = reverse + source.charAt(i); /* add charAt(index) to reverse */
            }
            System.out.println(reverse);
            return reverse; /* print and return */
        }
    }

    /* Fibonacci series: a series of numbers
    where next number is equivalent to the sum of previous two numbers
    fn = fn - 1 + fn - 2
    */
    static void fibonacci() {
        int number = 10;
        System.out.println("# Series: " + number);

        for (int i = 1; i <= number; i++) { /* loop through series */
            System.out.println(fib(i));
        }
    }

    public static int fib(int number) { /* static int takes int number index of above loop */
        if (number == 1 || number == 2) {
            return 1; /* if 1 or 2 return 1; */
        } else {
            return fib(number - 1) + fib(number - 2); /* fn = (fn - 1) + (fn - 2) */
        }
    }

    /* prime number */
    static void prime() {
        int num = 28;
        System.out.println("Prime or Not?: " + num);

        if (num == 0) {
            System.exit(0);
        } else {
            System.out.println(isPrime(num));
        }
    }

    public static boolean isPrime(int num) {
        int sqrt = (int) Math.sqrt(num) + 1; /* square root of number */
        for (int i = 2; i < sqrt; i++) { /* loop to sqrt */
            if (num % i == 0) { /* number is perfectly divisible (no prime = false) */
                return false;
            }
        }
        return true;
    }

    /* String Palindrome */
    static void strPalindrome() {
        String text = "aaa";
        System.out.println("Is " + text + " A Palindrome: " + isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        String reverse = flip(text); /* call flip method below */
        if (text.equals(reverse)) { /* if equals reverse: true */
            return true;
        } else {
            return false; /* else false */
        }
    }

    public static String flip(String text) {
        if (text == null || text.isEmpty()) { /* if empty string return text */
            return text;
        } else {
            return text.charAt(text.length() - 1) + flip(text.substring(0, text.length() - 1)); /* recursive flip using substring */
        }
    }

    /* Int Palindrome */
    static void intPalindrome() {
        int pal = 10;
        System.out.println(isIntPalindrome(pal));
    }

    public static boolean isIntPalindrome(int pal) {
        int palindrome = pal;
        int reverse = 0;

        while (palindrome != 0) { /* while not 0 */
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder; /* find reverse from remainder */
            palindrome = palindrome / 10;
        }

        if (pal == reverse) { /* if int = reverse */
            return true; /* true */
        }
        return false; /* else false */
    }

    /* Factorials  n * (n - 1) till zero */
    static void factorials() {
        int f = 5;
        System.out.println("The Factorial Of " + f + " Is: " + factorial(f));
    }

    public static int factorial(int f) {
        if (f == 0) { /* if f = 0 return 1 */
            return 1;
        }
        return f * factorial(f - 1); /* recurse factorial n * (n - 1) */
    }

    /* rm dupes */
    static void duplicates() {
        int[] arr = {5, 3, 1, 1, 5, 66, 7, 10, 66, 7};
        int n = arr.length;
        Arrays.sort(arr);
        
        n = removeDuplicates(arr, n); /* call removeDuplicates method */

        /* print updated array */
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    static int removeDuplicates(int arr[], int n) { /* pass array and array.length */
        if (n == 0 || n == 1) { /* if 0 or 1 return n; */
            return n;
        } else {
            int[] temp = new int[n]; /* create new instance of n; */
            int j = 0;

            return dupes(arr, n, temp, j); /* return dupes method (it returns an int) */
        }
    }

    public static int dupes(int arr[], int n, int temp[], int j) {
        for (int i = 0; i < n - 1; i++) { /* if current != to next store current element */
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1]; /* store last element as unique or repeated */

        for (int i = 0; i < j; i++) { /* modify original array */
            arr[i] = temp[i];
        }
        return j;
    }
}

