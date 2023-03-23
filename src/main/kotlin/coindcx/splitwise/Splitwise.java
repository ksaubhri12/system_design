package coindcx.splitwise;

import java.util.ArrayList;
import java.util.HashMap;

public class Splitwise {

    public static void main(String[] args) {
        User user1 = new User(1, "kalpesh");
        User user2 = new User(2, "Vikram");
        User use3 = new User(3, "Tausif");
        User user4 = new User(4, "Vedant");
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(use3);
        userArrayList.add(user4);

        Groups groups = new Groups(userArrayList, 1, "Office");
        GroupExpenseManager groupExpenseManager = new GroupExpenseManager(groups);


        Expense expense = new Expense(new ExactSplitStrategy(),1, "Lunch", 1000.0, groups, user1);

        HashMap<User, Double> userAmountSplit = expense.getUserAmountSplit();





        groupExpenseManager.addExpense(expense, userAmountSplit);

        Expense expense1 = new Expense(new ExactSplitStrategy(), 2, "Dinner", 1000.0, groups, user4);
        groupExpenseManager.addExpense(expense1, expense1.getUserAmountSplit());

        groupExpenseManager.showBalanceForAll();

//        groupExpenseManager.getAmountPendingValue(user2);

//        Payment payment = new Payment(groups, user2, 200.0);

//        groupExpenseManager.addPayment(payment);

//        groupExpenseManager.showBalanceForAll();




    }

}
