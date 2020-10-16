package com.example.hw12.Room;

import android.content.Context;

import androidx.room.Room;

import com.example.hw12.module.Word;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private Context mContext;
    private static Repository sInstance;
    private WordDao wordDao;
    private List<Word> words=new ArrayList<Word>();



    public static Repository getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new Repository(context);
        }
        return sInstance;
    }

    private Repository(Context context) {
        mContext = context.getApplicationContext();
        DataBase mDataBase = Room.databaseBuilder(mContext, DataBase.class, "words").allowMainThreadQueries().
                build();
        wordDao = mDataBase.wordDao();
        words.add(new Word(1,"apple","sib"));
        words.add(new Word(2,"book","ketab"));
        words.add(new Word(3,"watch","saat"));
        words.add(new Word(4,"monkey","mimon"));
        words.add(new Word(3,"donkey","khar"));
    }


    public void Insert(Word word) {
        wordDao.insert(word);
    }

    public void Delete(Word word) { wordDao.delete(word);
    }
    public void search(Word word) {
        wordDao.search(word);}



}
