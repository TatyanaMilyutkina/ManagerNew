package ru.netology.FilmManager.domain;

public class FilmManager {
    private int maxCountFilm;
    private String[] films = new String[0];

    public FilmManager(){
        this.maxCountFilm = 10;

    }
    public FilmManager(int maxCountFilm){
        this.maxCountFilm = maxCountFilm;

    }

    public void add (String film){

        String[] tmp = new String [films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll(){
        return films;
    }

    public String[] findLast() {

        String[] exit;
        if (maxCountFilm < films.length) {
            exit = new String[maxCountFilm];
        } else { exit = new String[films.length];
        }
        for (int i = 0; i < exit.length; i++) {
            exit[i] = films[films.length - i - 1];
        }
        return exit;
    }

}