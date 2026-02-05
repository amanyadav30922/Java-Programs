
public class EvenSumFibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        int evenSum = 0;

        while (true) {
            c = a + b;
            if (c > 25)
                break;

            if (c % 2 == 0) {
                evenSum += c;
            }

            a = b;
            b = c;
        }

        System.out.println("The even sum of Fibonacci series up to 25 is: " + evenSum);
    }
}
