package com.choirul.noteapp.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {
    private static List<User> users;
    private static List<Note> notes;

    static {
        users = new ArrayList<>();
        users.add(new User("adi", "rahasia"));
        users.add(new User("beni", "rahasia"));
        users.add(new User("cindy", "rahasia"));

        notes = new ArrayList<>();
        notes.add(new Note("Note 1", new Date(), "Setan diusir dari surga karena sombong"));
        notes.add(new Note("Note 2", new Date(), "Kalo kamu ?"));
        notes.add(new Note("Note 3", new Date(), "Belum masuk surga udah sombong!!"));
        notes.add(new Note("Note 4", new Date(), "Ngacalah!!"));
    }


    public static List<User> getUsers() { return users; }

    public static List<Note> getNotes() {
        return notes;
    }
}
