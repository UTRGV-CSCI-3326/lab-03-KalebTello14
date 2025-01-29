public class BankAccount {
    public static void main(String[] args){

        double checkingacct = 2175.37;
        checkingacct -= 302.50;
        checkingacct += 50.03;
        checkingacct /= 2;
        checkingacct += 20;
        checkingacct -= 1;
        checkingacct *= 2;
        checkingacct += 1;
        System.out.println("Your New Balance is: " + String.format("%.2f", checkingacct));
    }
}