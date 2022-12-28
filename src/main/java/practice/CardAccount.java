package practice;

public class CardAccount extends BankAccount {

    private static final double COMMISSION = 0.01;

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake + (amountToTake * COMMISSION));
    }
}
