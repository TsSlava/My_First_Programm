package org.lesson30;

public class Discount {

    private int count;
    private double cost;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void calcDiscount () {
        if (getCount() >= 3 && getCount() <= 6){
            setCost(getCost() * 0.9);
        }
        if (getCount() > 6) {
            setCost(getCost() * 0.8);
        }
        System.out.println("Сумма вашего заказа " + getCost() + " рубля");
    }
}
