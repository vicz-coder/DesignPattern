package org.self.learn.prototype;

import java.util.ArrayList;
import java.util.List;

public class ProtoMainApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Zombie masterZombie = new Zombie("Zoomi",100);

        Zombie z1 = masterZombie.clone();
        z1.getAbilities().add("Run");
        System.out.println(z1);

        Zombie z2 = masterZombie.clone();
        z2.getAbilities().add("Fly");
        System.out.println(z2);


    }
}
