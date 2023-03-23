package coindcx.splitwise;

import java.util.HashMap;

public class Expense {

    public AmountDividedStrategy amountDividedStrategy;


    public Integer id;

    public String name;

    public Double amount;

    public Groups groups;

    public User user;


    public Expense(AmountDividedStrategy amountDividedStrategy, Integer id, String name, Double amount, Groups groups, User user) {
        this.amountDividedStrategy = amountDividedStrategy;
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.groups = groups;
        this.user = user;
    }


    public HashMap<User, Double> getUserAmountSplit(){
        return amountDividedStrategy.getAmountDivided(this);
    }


}
