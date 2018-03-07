package com.example.kartik.newsapp;

/**
 * Created by KARTIK on 3/6/2018.
 */

public class News {
    String mTitle;
    String mAuthor;
    String mDate;
    String mSection;
    String mURL;

    public News(String title,String author,String date,String section,String URL){
            mTitle=title;
            mAuthor=author;
            mDate=date;
            mSection=section;
            mURL=URL;
    }

    public String getTitle(){return mTitle;}

    public String getAuthor(){return mAuthor;}

    public String getDate(){return mDate;}

    public String getSection(){return mSection;}

    public String getURL(){return mURL;}

    @Override
    public String toString() {
        return "News{" +
                "title='" + mTitle + '\'' +
                ", author='" + mAuthor + '\'' +
                ", url='" + mURL + '\'' +
                ", date='" + mDate + '\'' +
                ", section='" + mSection + '\'' +
                '}';
    }
}
