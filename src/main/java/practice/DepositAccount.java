package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private static final int TAKE_RESTRICTION_MONTH = 1;
    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }

    @Override
    public void take(double amountToTake) {
        if (lastIncome.plusMonths(TAKE_RESTRICTION_MONTH)
                .isBefore(LocalDate.now())) {
            super.take(amountToTake);
        }
    }
}
