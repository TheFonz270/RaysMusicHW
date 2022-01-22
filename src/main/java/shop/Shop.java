package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private String location;
    private ArrayList<ISell> stock;

    public Shop(String name, String location) {
        this.name = name;
        this.location = location;
        this.stock = new ArrayList<ISell>();
    }


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell item){
        stock.add(item);
    }

    public void removeStock(ISell item){
        stock.remove(item);
    }
}
