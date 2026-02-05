public class LCM_GCD {
    public static void main(String[] args) {
        int num1 = 24;  // First number
        int num2 = 36;  // Second number

        // --- GCD (HCF) calculation using simple loop ---
        int a = num1;
        int b = num2;
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        int gcd = a;  // Now a == b, so this is GCD

        // --- LCM calculation without using GCD formula ---
        // We will start from the larger number and find the first multiple common to both
        int bigger = (num1 > num2) ? num1 : num2;
        int lcm = bigger;
        while (!(lcm % num1 == 0 && lcm % num2 == 0)) {
            lcm += bigger;
        }

        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("GCD (HCF) = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
