package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Expense {
    
    @Id
    private long id;

    private double amount;
    private long date;

    @ManyToOne
    private Friend friend;

    public Expense(double amount, long date, Friend friend) {
        this.amount = amount;
        this.date = date;
        this.friend = friend;
    }

    public Expense() {

    }

    public boolean getAmountClass() {
        if (this.amount > 90) {
            return true;
        }
        return false;
    }

    public Friend getFriend() {
        return this.friend;
    }

    public double getAmount() {
        return amount;
    }

    public long getDate() {
        return date;
    }

    public long getId() {
        return id;
    }

}
