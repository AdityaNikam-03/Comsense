package com.tbc.observerdesignpattern;

public class ObserverDesignPattern {

	public static void main(String[] args) {
        Group g=new Group();
        User u1=new User(1);
        User u2=new User(2);
        User u3=new User(3);

        g.subscribe(u1);
        g.subscribe(u2);
        g.subscribe(u3);
        g.update("New User");
        g.unsubscribe(u2);
        g.update("Updated User");
    }
}
