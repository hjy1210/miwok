package com.example.android.miwok;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> words=new ArrayList<>();
        words.add(new Word("lutti","一",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("otiiko","二",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("tolookosu","三",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("oyyisa","四",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("massokka","五",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("temmokka","六",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("kenekaku","七",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("kawinta","八",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("wo’e","九",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("na’aacha","十",R.drawable.number_ten,R.raw.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // When clicked, show a toast with the TextView text or do whatever you need.
                //LinearLayout layout=(LinearLayout)view;
                //TextView v=(TextView)layout.findViewById(R.id.miwok_text_view);
                //Toast.makeText(NumbersActivity.this, v.getText(), Toast.LENGTH_SHORT).show();
                Word currentWord = words.get(position);
                //Toast.makeText(NumbersActivity.this, currentWord.getDefaultTranslation(), Toast.LENGTH_SHORT).show();
                //if (mMediaPlayer!=null) mMediaPlayer.release();
                mMediaPlayer=MediaPlayer.create(NumbersActivity.this,currentWord.getSoundResourceId());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });

            }
        });

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
