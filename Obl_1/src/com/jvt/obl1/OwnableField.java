
package com.jvt.obl1;

/**
 *
 * @author erso
 */
public abstract class OwnableField implements FieldInterface{
    private String name;
    private int number;
    int price;
    private int rent;
    private Player owner;

    protected OwnableField(String name, int number, int price, int rent)
    {
        this.name = name;
        this.number = number;
        this.price = price;
        this.rent = rent;
    }

    public int getRent() {
        return rent;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getNumber()
    {
        return number;
    }

    public int getPrice()
    {
        return price;
    }

    public Player getOwner()
    {
        return owner;
    }

    public void setOwner(Player owner)
    {
        this.owner = owner;
    }

}
