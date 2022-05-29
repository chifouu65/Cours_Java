package fr.chifouu.OBJECT;

public class Player {
    private String player_name;
    private double health_level; //event.getPlayer.getHealth
    private double food_level;
    private double attack;


    public Player(String player_name, double attack, double health_level, double food_level) {
        this.player_name = player_name;
        this.health_level = health_level;
        this.food_level = food_level;
        this.attack = attack;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public double getHealth_level() {
        return health_level;
    }

    public void setHealth_level(double health_level) {
        this.health_level = health_level;
    }

    public double getFood_level() {
        return food_level;
    }

    public void setFood_level(double food_level) {
        this.food_level = food_level;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }
}
