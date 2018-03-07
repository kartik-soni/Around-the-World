package com.example.kartik.newsapp;

/**
 * Created by KARTIK on 3/6/2018.
 */

public class News {
    String headline;
    String author;
    String date;
    String genre;
    String URL;

    public News(String newsHeadline, String newsAuthor, String newsDate, String newsGenre, String newsURL) {
        headline = newsHeadline;
        author = newsAuthor;
        date = newsDate;
        genre = newsGenre;
        URL = newsURL;
    }

    public String getTitle() {
        return headline;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getSection() {
        return genre;
    }

    public String getURL() {
        return URL;
    }

}