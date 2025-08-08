//Check Armstrong Number

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int original = n, sum = 0;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, digits);
            n /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println("Is Armstrong: " + isArmstrong(153));
    }
}
