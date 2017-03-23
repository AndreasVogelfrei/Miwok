package com.example.android.miwok;

/**
 * Created by voigt on 20.03.2017.
 */

public class Word {

    private String mEnglish;
    private String mMiwok;
    private int mRessourceId;

    // constructor
    public Word(String english, String miwok) {
        mEnglish = english;
        mMiwok = miwok;
    }

    // Alternative constructor
    public Word(String english, String miwok, int ressourceId) {
        mEnglish = english;
        mMiwok = miwok;
        mRessourceId = ressourceId;
    }

    public String getmEnglish(){
        return mEnglish;
    }

    public String getmMiwok(){
        return mMiwok;
    }

    public int getmRessourceId() { return mRessourceId; }
}
