package game;

import object.Object;

public abstract class Strategy implements Object, Game {
    protected int yearOfReleaze;
    protected float rating;
    protected String os;
    protected String name;
    protected String type;
    private int maxUnits;
    private int maps;
    private boolean canCreateMap;
    public Strategy(){
        yearOfReleaze = 0;
        rating=0;
        os="unknown OS";
        maxUnits=0;
        maps=0;
        canCreateMap=false;
    }
    public Strategy(int maps, int maxUnits, boolean canCreateMap, float rating, String os, int year, String name){
        this.yearOfReleaze=year;
        this.os=os;
        this.rating=rating;
        this.maps =maps;
        this.canCreateMap=canCreateMap;
        this.maxUnits=maxUnits;
    }
}
