public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000; 
        double rate = 5;
        int timesCompounded = 4; 
        int years = 10; 

        double amount = principal * Math.pow(1 + (rate / (timesCompounded * 100)), timesCompounded * years);
        double compoundInterest = amount - principal;

        System.out.printf("The compound interest after %d years is: %.2f\n", years, compoundInterest);
    }
}
