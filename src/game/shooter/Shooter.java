package game;

import object.Object;

public class Shooter implements Game, Object {
    private int yearOfReleaze;
    private float rating;
    private String os;
    private String name;
    private String type;
    private int levels;
    private String weapon;
    public Shooter(){
        yearOfReleaze = 0;
        rating=0;
        os="unknown OS";
        levels =0;
        weapon="unknown weapon";
        setType();
        setName("Uncknown");
    }
    public Shooter( int levels, float rating, String os, int year, String weapon, String name){
        this.yearOfReleaze=year;
        this.os=os;
        this.rating=rating;
        setName(name);
        setType();
        this.levels =levels;
        this.weapon=weapon;
    }
    public void setLevels(int levels){
        this.levels = levels;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public int getLevels() {
        return levels;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setYearOfReleaze(int yearOfReleaze) {
        this.yearOfReleaze = yearOfReleaze;
    }

    public float getRating() {
        return rating;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getOs() {
        return os;
    }

    public int getYearOfReleaze() {
        return yearOfReleaze;
    }


    @Override
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void setType(){
        type = "Shooter";
    }
    @Override
    public void print() {
        String str;
        str = "Игра " + getType() +" под названием "+ getName()+" год релиза "+ getYearOfReleaze()+
                " на платформе " + getOs() + " имеющееся оружие " + getWeapon()+ " количеством уровней "
                +getLevels()+ "и рейтингом "+ getRating();
        System.out.println(str);
    }

    public void setOs(String os) {
        this.os=os;
    }
}
