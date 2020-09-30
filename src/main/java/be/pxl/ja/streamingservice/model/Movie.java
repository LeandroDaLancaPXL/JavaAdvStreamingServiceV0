package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable{
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;

    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating rating) {
        super(title, rating);
    }

    public String getDirector () {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate () {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

     public int getDuration () {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = Math.abs(duration);
    }

    public boolean isLongPlayingTime() {
        return duration >= LONG_PLAYING_TIME;
    }

    public String getPlayingTime() {
        if (duration == 0) {
            return "?";
        } else if (duration % 60 == 0) {
            return duration / 60 + " h";
        } else if(duration >= 60) {
            int uur = duration / 60;
            int minuten = duration % 60;

            return uur + " h " + minuten + " min";
        } else {
            return duration + " min";
        }
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Genre getGenre() {return genre;}

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    @Override
        public String toString () {

        if (releaseDate != null) {
            return this.getTitle() + " (" + releaseDate.getYear() + ")";
        } else {
            return this.getTitle();
        }
    }
}