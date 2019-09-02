package com.example.roomwordssample.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")

public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")

    private String word;

    public Word(@NonNull String words) {
        this.word = words;
    }

    public String getWord() {
        return this.word;
    }
}
