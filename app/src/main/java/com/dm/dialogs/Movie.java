package com.dm.dialogs;

public class Movie {

    private String title;
    private int duration = 120;
    private int year = 1994;
    private String director = "Guy Richie";

    private int criticScore = 5;

    private Movie() {

    }

    public void setCriticScore(int criticScore) {
        this.criticScore = criticScore;
    }

    public int getCriticScore() {
        return criticScore;
    }

    public static class Builder {
        private Movie movie;

        public Builder(String name) {
            movie = new Movie();
            movie.title = name;
        }

        public Builder setDuration(int duration) {
            movie.duration = duration;
            return this;
        }

        public Builder setYear(int year) {
            movie.year = year;
            return this;
        }

        public Builder setDirector(String director) {
            movie.director = director;
            return this;
        }

        public Builder setScore(int score) {
            movie.criticScore = score;
            return this;
        }

        public Movie create() {
            return movie;
        }
    }
}
