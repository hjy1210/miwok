package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE;
    private int mSoundResourceId;
    private static final int NO_IMAGE = -1;

    /**
     * Get default translation of the word
     * @return String
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
    public int getSoundResourceId(){
        return mSoundResourceId;
    }
    public Word(String miwokTranslation, String defaultTranslation,int soundResourceId){
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
        mSoundResourceId=soundResourceId;
    }
    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int soundResourceId){
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
        mImageResourceId=imageResourceId;
        mSoundResourceId=soundResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;
    }
}
