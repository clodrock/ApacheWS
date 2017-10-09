package com.jaxws.series.td.spring.hibernate.model;

public class Music {
 
    private int musicId;
    private String movieName;
    private String director;
    private String yearOfRelease;
    private String comments;
 
   
    public int getMusicId() {
        return musicId;
    }
 
    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }
 
    public String getMovieName() {
        return movieName;
    }
 
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
 
    public String getDirector() {
        return director;
    }
 
    public void setDirector(String director) {
        this.director = director;
    }
 
    public String getYearOfRelease() {
        return yearOfRelease;
    }
 
    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
 
    public String getComments() {
        return comments;
    }
 
    public void setComments(String comments) {
        this.comments = comments;
    }
}