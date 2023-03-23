package coindcx.splitwise;

import java.util.HashMap;
import java.util.Map;

public class GroupExpenseManager {

    public Groups groups;

    public GroupExpenseManager(Groups groups) {
        this.groups = groups;
        this.usersFinalAmountDataMap = new HashMap<>();
    }

    public HashMap<User, Double> usersFinalAmountDataMap;


    public void addExpense(Expense expense, HashMap<User , Double> usersAmountData){

        User userPaying = expense.user;
        Double paidUserAmount = usersAmountData.get(userPaying);
        Double totalExpense = expense.amount;
        Double potOwned = totalExpense - paidUserAmount;
        if (usersFinalAmountDataMap.containsKey(userPaying)){
            Double existingPotOwned = usersFinalAmountDataMap.get(userPaying);
            Double newAmount = existingPotOwned - potOwned;
            usersFinalAmountDataMap.put(userPaying, newAmount);
        }
        else {
            usersFinalAmountDataMap.put(userPaying, -potOwned);
        }

        usersAmountData.remove(userPaying);
        for (Map.Entry<User, Double> userDoubleEntry:usersAmountData.entrySet()){
            User user = userDoubleEntry.getKey();
            Double amount = userDoubleEntry.getValue();


            if (usersFinalAmountDataMap.containsKey(user)){
                Double existingAmount = usersFinalAmountDataMap.get(user);
                Double totalAmount = existingAmount + amount;
                usersFinalAmountDataMap.put(user, totalAmount);
            }
            else {
                usersFinalAmountDataMap.put(user, amount);
            }

        }




    }



    public void getAmountPendingValue(User user){
        System.out.println(usersFinalAmountDataMap.getOrDefault(user, 0.0));
    }


    public void showBalanceForAll(){
        for (Map.Entry<User, Double> usersAmountDataMapEntry: usersFinalAmountDataMap.entrySet()){
            User user = usersAmountDataMapEntry.getKey();
            Double amount = usersAmountDataMapEntry.getValue();
            System.out.println(user.name);
            System.out.println(amount);
        }
    }



    public void addPayment(Payment payment){
        Double amount = payment.amount;
        User user = payment.user;

        if (usersFinalAmountDataMap.containsKey(user)){
            Double existingAmount = usersFinalAmountDataMap.get(user);
            Double newPayment = existingAmount - amount;
            usersFinalAmountDataMap.put(user, newPayment);
        }

    }





}
