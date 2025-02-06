package com.tbc.observerdesignpattern;

import java.util.List;
import java.util.ArrayList;

class Group{
    List<Observer> users;

    Group(){
        users=new ArrayList<>();
    }

    void subscribe(Observer u){
        users.add(u);
    }

    void unsubscribe(Observer u){
        users.remove(u);
    }

    void update(String msg){
        for(int i=0;i<users.size();i++){
            users.get(i).notifyObserver(msg);
        }
    }
}
