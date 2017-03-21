package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "aaa"));
        words.add(new Word("two", "bbb"));
        words.add(new Word("three", "ccc"));
        words.add(new Word("four", "ddd"));
        words.add(new Word("five", "eee"));
        words.add(new Word("six", "fff"));
        words.add(new Word("seven", "ggg"));
        words.add(new Word("eight", "hhh"));
        words.add(new Word("nine", "iii"));
        words.add(new Word("ten", "jjj"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
