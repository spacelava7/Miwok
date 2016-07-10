package com.example.android.miwok;

import android.widget.ImageView;

/**
 * Created by yadia on 7/10/16.
 */
public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    final static int NO_IMAGE_PROVIDED = -1; //represents img was not provided

    public Word(String defaultTranslation, String miwoktranslation){
        mMiwokTranslation = miwoktranslation;
        mDefaultTranslation = defaultTranslation;
    }


    /**
     * Returns string of the default word to be translated
     * @return mDefaultTranslation
     */

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public Word(String miwoktranslation, String defaultTranslation, int resourceId){
        mMiwokTranslation = miwoktranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId  =resourceId;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
