package edu.psu.pizzashop;

public class OrderDTO
{
    String pizza;
    int soda;
    int wing;

    public OrderDTO(Order order)
    {
        this.pizza = order.pizza;
        this.soda = order.soda;
        this.wing = order.wing;
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
