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
                Word currentWord = words.get(position);
                //Toast.makeText(NumbersActivity.this, currentWord.getDefaultTranslation(), Toast.LENGTH_SHORT).show();
                releaseMediaPlayer();
                mMediaPlayer=MediaPlayer.create(NumbersActivity.this,currentWord.getSoundResourceId());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        //mp.release();
                        releaseMediaPlayer();
                    }
                });

            }
        });
    }
    private void releaseMediaPlayer(){
        if (mMediaPlayer!=null){
            mMediaPlayer.release();
            mMediaPlayer=null;
        }
    }
}
