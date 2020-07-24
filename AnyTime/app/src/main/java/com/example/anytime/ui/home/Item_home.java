package com.example.anytime.ui.home;

public class Item_home {
    private String name;
    private String number;
    public Item_home(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String getItemName(){
        return this.name;
    }
    public String getItemNumber(){
        return this.number;
    }
    public void setItemName(String name){ this.name = name; }
    public void setItemNumber(String number){ this.number = number; }
}
