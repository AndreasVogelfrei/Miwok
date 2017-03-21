package com.example.android.miwok;

/**
 * Created by voigt on 20.03.2017.
 */

public class Word {

    private String mEnglish;
    private String mMiwok;

    public Word(String english, String miwok) {
        mEnglish = english;
        mMiwok = miwok;
    }

    public String getmEnglish(){
        return mEnglish;
    }

    public String getmMiwok(){
        return mMiwok;
    }
}
