package org.self.learn.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Zombie implements Cloneable{
    private String name;
    private int health;
    private byte[] image;
    private List<String> abilities;

    public Zombie(String name, int health) {
        this.name = name;
        this.health = health;

        this.abilities = new ArrayList<>();
        this.abilities.add("Walk");
        this.abilities.add("Swim");

        //Expensive Task to load image
    }

    @Override
    public Zombie clone() throws CloneNotSupportedException {
        Zombie cloned = (Zombie) super.clone();
        cloned.setAbilities(new ArrayList<>(this.abilities)); //Deep Copy
        return cloned;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    @Override
    public String toString() {
        return "Zombie{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", abilities=" + abilities +
                '}';
    }
}
