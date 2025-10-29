package com.mycompany.prog6112poe;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author RC_Student_lab
 */
public class SeriesModel {

    private String SeriesId;
    private String SeriesName;
    private int SeriesAge;
    private int SeriesNumberOfEpisodes;

    //constructor
    public SeriesModel(String SeriesId, String SeriesName, int SeriesAge, int SeriesNumberOfEpisodes) {
        this.SeriesId = SeriesId;
        this.SeriesName = SeriesName;
        this.SeriesAge = SeriesAge;
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }

    //getters and setters
    public String getSeriesId() {
        return SeriesId;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public int getSeriesAge() {
        return SeriesAge;
    }

    public int getSeriesNumberOfEpisodes() {
        return SeriesNumberOfEpisodes;
    }

    public void setSeriesName(String SeriesName) {
        this.SeriesName = SeriesName;
    }

    public void setSeriesAge(int SeriesAge) {
        this.SeriesAge = SeriesAge;
    }

    public void setSeriesNumberOfEpisodes(int SeriesNumberOfEpisodes) {
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }
}
