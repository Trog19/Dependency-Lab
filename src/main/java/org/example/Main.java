package org.example;

public class Main {
    public static void main(String[] args) {


    Lightsaber lightsaber = new Lightsaber();
    Shot_Gun shot_gun = new Shot_Gun();
    Bow bow = new Bow();
    ClapTrap clapTrap = new ClapTrap(bow);
        Robot robot_one = new ClapTrap(bow);
        System.out.println(robot_one.name);
        robot_one.Attack();

        Attacker wolf_one = new Werewolf(bow);

        wolf_one.Attack();

//        Robot robot_two = new Robot(shot_gun);
//        System.out.println(robot_two.name);
//        robot_two.Attack();
    }
}