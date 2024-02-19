package com.cydeo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Team <T> { //with <> we made Team generics

    private String name;

    private List<T> members = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println((( Player)player).getName() + " is already on the team"); //we have to cast player to Player
            return false;
        } else{
            members.add(player);
            System.out.println(((Player)player).getName() + " picked for a team " + this.name);
            return true;
        }

    }


}
