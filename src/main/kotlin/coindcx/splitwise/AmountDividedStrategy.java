package coindcx.splitwise;

import java.util.HashMap;

public interface AmountDividedStrategy {


    public HashMap<User, Double> getAmountDivided(Expense expense);

}
