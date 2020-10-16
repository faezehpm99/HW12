package com.example.hw12.module;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "words")


public class Word {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "superWord")
    public String superWord;

    @ColumnInfo(name = "meaning")
    public String meaning;



    public Word(int id, String superWord, String meaning) {
        this.id = id;
        this.superWord = superWord;
        this.meaning = meaning;
    }
    private List<Word> words=new ArrayList<Word>();


}
