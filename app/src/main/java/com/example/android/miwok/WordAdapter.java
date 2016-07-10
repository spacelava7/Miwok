package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yadia on 7/10/16.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Constructor for WordAapter
     * @param context  --Activity context
     * @param words -- ArrayList<Word> from Word object
     *              0 - gets inflated in the getView
     */
    public WordAdapter (Activity context, ArrayList<Word> words){
        //(Activity context, int resource, ArrayList<T>
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.number_list_layout, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        TextView miwokText = (TextView) listItemView.findViewById(R.id.numberList_txt1);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        miwokText.setText(currentWord.getMiwokTranslation());

        TextView defaultText = (TextView) listItemView.findViewById(R.id.numberList_txt2);
        defaultText.setText(currentWord.getDefaultTranslation());

        return  listItemView;
    }

}
