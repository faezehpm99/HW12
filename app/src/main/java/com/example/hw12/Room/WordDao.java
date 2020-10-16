package com.example.hw12.Room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.hw12.module.Word;

@Dao
public interface WordDao {

    @Insert
    public void insert(Word word);

    @Delete
    public void delete(Word word);

    @Update
    public void update(Word word);

   @Query("SELECT meaning From words where superword =:word")
    public Word search(Word word);

}
