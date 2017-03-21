package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by voigt on 20.03.2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.text_view_english);
        englishTextView.setText(currentWord.getmEnglish());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.text_view_miwok);
        miwokTextView.setText(currentWord.getmMiwok());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view_miwok);
        imageView.setImageResource(R.mipmap.ic_launcher);

        return listItemView;
    }
}
