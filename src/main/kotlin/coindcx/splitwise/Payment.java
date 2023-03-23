package coindcx.splitwise;

public class Payment {

    public Groups groups;

    public User user;

    public Double amount;

    public Payment(Groups groups, User user, Double amount) {
        this.groups = groups;
        this.user = user;
        this.amount = amount;
    }
}
