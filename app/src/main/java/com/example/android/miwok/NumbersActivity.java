package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words=new ArrayList<>();
        words.add(new Word("lutti","一"));
        words.add(new Word("otiiko","二"));
        words.add(new Word("tolookosu","三"));
        words.add(new Word("oyyisa","四"));
        words.add(new Word("massokka","五"));
        words.add(new Word("temmokka","六"));
        words.add(new Word("kenekaku","七"));
        words.add(new Word("kawinta","八"));
        words.add(new Word("wo’e","九"));
        words.add(new Word("na’aacha","十"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        /* LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        for (int i=0;i<words.size();i++){
            //Log.i("NumbersActivity", "Word at index "+i+": "+words.get(i));
            TextView v=new TextView(this);
            v.setText(words.get(i));
            rootView.addView(v);    // addView is a method of ViewGroup
        }*/



        /*String[] words={"one","two","three","four","five","six","seven","eight","nine","ten"};
        for (int i=0;i<words.length;i++){
            Log.i("NumbersActivity", "Word at index "+i+": "+words[i]);
        }*/
        /*String[] words = new String[10];
        words[0]="one";
        words[1]="two";
        words[2]="three";
        words[3]="four";
        words[4]="five";
        words[5]="six";
        words[6]= "seven";
        words[7]="eight";
        words[8]="nine";
        words[9]="ten";*/
    }
}
