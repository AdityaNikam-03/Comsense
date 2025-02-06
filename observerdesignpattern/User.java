package com.tbc.observerdesignpattern;

class User implements Observer{
    int ID;
    User(int ID){
        this.ID=ID;
    }
    public void notifyObserver(String msg){
        System.out.println(msg+" "+ID);
    }
}
