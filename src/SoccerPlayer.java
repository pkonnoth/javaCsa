/*
Pettrus Konnoth
AP CSA
9 Jan 2024
Assignments:Container class
Soccer Player class
 */

public abstract class SoccerPlayer {

    //instance variables

    private String name;
    private int age;
    private String position;
    private int jerseyNumber;

    //constructor 1
    public SoccerPlayer(String name, int age, String position, int jerseyNumber) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    //constructor 2
    public SoccerPlayer(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.jerseyNumber = 0;
    }

    //constructor 3
    public SoccerPlayer(String name, int age) {
        this.name = name;
        this.age = age;
        this.position = "unknown";
        this.jerseyNumber = 0;
    }

    public abstract void play();


    //getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }



    //toString method
    @Override
    public String toString() {
        return "\n"+"Name: " + name + "\nAge: " + age + "\nPosition: " + position + "\nJersey Number: " + jerseyNumber + "\n";
    }
}

