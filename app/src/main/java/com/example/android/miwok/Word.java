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

    private int mAudioResourceId;


    /**
     * Constructor for Array List with only miwok word, english word and audio file
     *  example: Phrases Activity
     * @param defaultTranslation
     * @param miwoktranslation
     * @param audioResource
     */
    public Word(String defaultTranslation, String miwoktranslation, int audioResource){
        mMiwokTranslation = miwoktranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResource;
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

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    public Word(String defaultTranslation, String miwoktranslation, int resourceId,
                int audioResource){
        mMiwokTranslation = miwoktranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId  = resourceId;
        mAudioResourceId = audioResource;
    }
}
