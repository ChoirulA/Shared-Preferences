package com.choirul.noteapp.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Note {
    public String title;
    public Date date;
    public String content;

    public Note(String title, Date date, String content) {
        this.title = title;
        this.date = date;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFormattedDate(){
        //Tampilan tanggal yang dicetak menjadi:01 Mar 2019;
        DateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        return formatter.format(date);
    }
}
