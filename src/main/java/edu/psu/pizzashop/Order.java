package edu.psu.pizzashop;

public class Order
{
    String pizza;
    int soda;
    int wing;

    String creditNumber;

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public int getSoda() {
        return soda;
    }

    public void setSoda(int soda) {
        this.soda = soda;
    }

    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }
}
