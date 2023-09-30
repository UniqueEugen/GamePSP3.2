package game.strategy;

import game.Game;
import object.Object;

public class Quest implements Object, Game {
    private int yearOfReleaze;
    private float rating;
    private String os;
    private String name;
    private String type;
    private int age;
    public Quest(){
        yearOfReleaze = 0;
        rating=0;
        os="unknown OS";
        age=0;
    }
    public Quest(int age, float rating, String os, int year, String name){
        this.yearOfReleaze=year;
        this.os=os;
        this.rating=rating;
        setName(name);
        setType();
        this.age=age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
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
        type = "Quest";
    }
    @Override
    public void print() {
        String str;
        str = "Игра " + getType() +" под названием "+ getName()+" год релиза "+ getYearOfReleaze()+
                " на платформе " + getOs() + " для возраста " + getAge()+ " и рейтингом "+ getRating();
        System.out.println(str);
    }
}
