package com.example.android.miwok;

/**
 * Created by yadia on 7/10/16.
 */
public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;

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
}
