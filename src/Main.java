public class Main {
    public static void main(String[] args) {
        double startCCBalance = 5000;
        double monthlyInterest = 0;

        monthlyInterest = startCCBalance * 0.17;
        System.out.println("The interest due after one month is " + monthlyInterest);
        System.out.println("The interest due after two months is " + (monthlyInterest * 2));

    }
}