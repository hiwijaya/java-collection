package com.hiwijaya.collection.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author Happy Indra Wijaya
 */
public class Player implements Comparable<Player>{

    private int number;
    private String name;

    private List<String> skills;

    public Player(int number, String name) {
        this.number = number;
        this.name = name;
        this.skills = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return Collections.unmodifiableList(this.skills);   // return Immutable list
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    @Override
    public String toString() {
        return "#" + number + "-" + name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public boolean equals(Object o) {

        if(o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;
        return number == player.number;
    }

    @Override
    public int compareTo(Player other) {
        return this.name.compareTo(other.name);     // sorted asc
    }
}
