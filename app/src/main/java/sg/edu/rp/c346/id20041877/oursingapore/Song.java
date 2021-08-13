package sg.edu.rp.c346.id20041877.oursingapore;

import java.io.Serializable;

public class Song implements Serializable {

    private int id;
    private String name;
    private String description;
    private int square;
    private int stars;

    public Song(String name, String description, int square, int stars) {
        this.name = name;
        this.description = description;
        this.square = square;
        this.stars = stars;
    }

    public Song(int id, String name, String description, int square, int stars) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.square = square;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public Song setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Song setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Song setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getSquare() {
        return square;
    }

    public Song setSquare(int square) {
        this.square = square;
        return this;
    }

    public int getStars() {
        return stars;
    }

    public Song setStars(int stars) {
        this.stars = stars;
        return this;
    }


}
