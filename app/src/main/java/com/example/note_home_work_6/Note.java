package com.example.note_home_work_6;

public class Note {
    private String name;
    private String date;
    private String description;

    public Note(String name, String date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
