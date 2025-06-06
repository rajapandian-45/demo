package DSA;

public class d1task3_1 {

    public static int factorial(int n) {
        if (n == 0) {
            return 1; 
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 4;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}

