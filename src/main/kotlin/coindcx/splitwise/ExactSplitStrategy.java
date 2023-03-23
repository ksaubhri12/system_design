package coindcx.splitwise;

import java.util.ArrayList;
import java.util.HashMap;

public class ExactSplitStrategy implements AmountDividedStrategy{
    @Override
    public HashMap<User, Double> getAmountDivided(Expense expense) {
        Groups groups = expense.groups;
        ArrayList<User> userArrayList = groups.userArrayList;

        HashMap<User, Double> amountMap = new HashMap<>();
        Double splitAmount = expense.amount / userArrayList.size();


        for (User user: userArrayList){
            amountMap.put(user, splitAmount);
        }

        return amountMap;


    }
}
