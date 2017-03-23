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

        words.add(new Word("one", "aaa", R.drawable.number_one));
        words.add(new Word("two", "bbb", R.drawable.number_two));
        words.add(new Word("three", "ccc", R.drawable.number_three));
        words.add(new Word("four", "ddd", R.drawable.number_four));
        words.add(new Word("five", "eee", R.drawable.number_five));
        words.add(new Word("six", "fff", R.drawable.number_six));
        words.add(new Word("seven", "ggg", R.drawable.number_seven));
        words.add(new Word("eight", "hhh", R.drawable.number_eight));
        words.add(new Word("nine", "iii", R.drawable.number_nine));
        words.add(new Word("ten", "jjj", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
