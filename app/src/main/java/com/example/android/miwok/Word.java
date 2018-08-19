package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    /**
     * Get default translation of the word
     * @return
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    /**
    * Get Miwok translation of the word
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public Word(String miwokTranslation, String defaultTranslation){
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
    }
}
