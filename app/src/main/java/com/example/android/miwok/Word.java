package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

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

    public int getImageResourceId(){
        return mImageResourceId;
    }
    public Word(String miwokTranslation, String defaultTranslation){
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
    }
    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId){
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
        mImageResourceId=imageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }
}
