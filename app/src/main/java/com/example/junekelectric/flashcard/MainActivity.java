package com.example.junekelectric.flashcard;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    Word apple;
    Word banana;
    Word orange;
    Word strawberry;

    English apple2;
    English banana2;
    English orange2;
    English strawberry2;

    LinearLayout container;
    //TextView nameTextView1;
    //TextView nameTextView2;
    //TextView nameTextView3;
    //TextView nameTextView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = (LinearLayout) findViewById(R.id.container);

        apple2 = new English(R.drawable.apple_icon, "Apple", "林檎");
        banana2 = new English(R.drawable.banana_icon, "Banana", "バナナ");
        orange2 = new English(R.drawable.orange_icon, "Orange", "オレンジ");
        strawberry2 = new English(R.drawable.strawberry_icon, "Strawberry", "苺");

        addEnglish(apple2);
        addEnglish(banana2);
        addEnglish(orange2);
        addEnglish(strawberry2);

//        addWord(apple);
//        addWord(banana);
//        addWord(orange);
//        addWord(strawberry);
//        LinearLayout layout1 = new LinearLayout(this.getApplicationContext());
//        LinearLayout layout2 = new LinearLayout(this.getApplicationContext());
//        LinearLayout layout3 = new LinearLayout(this.getApplicationContext());
//        LinearLayout layout4 = new LinearLayout(this.getApplicationContext());
//        layout1.setOrientation(LinearLayout.HORIZONTAL);
//        layout2.setOrientation(LinearLayout.HORIZONTAL);
//        layout3.setOrientation(LinearLayout.HORIZONTAL);
//        layout4.setOrientation(LinearLayout.HORIZONTAL);
//        TextView nameTextView1 = new TextView(getApplicationContext());
//        TextView nameTextView2 = new TextView(getApplicationContext());
//        TextView nameTextView3 = new TextView(getApplicationContext());
//        TextView nameTextView4 = new TextView(getApplicationContext());
//        TextView nameTextView5 = new TextView(getApplicationContext());
//        TextView nameTextView6 = new TextView(getApplicationContext());
//        TextView nameTextView7 = new TextView(getApplicationContext());
//        TextView nameTextView8 = new TextView(getApplicationContext());
//        nameTextView1.setText(apple.name);
//        nameTextView2.setText(banana.name);
//        nameTextView3.setText(orange.name);
//        nameTextView4.setText(strawberry.name);
//        nameTextView5.setText(apple2.name);
//        nameTextView6.setText(banana2.name);
//        nameTextView7.setText(orange2.name);
//        nameTextView8.setText(strawberry2.name);
//        nameTextView1.setTextColor(Color.BLACK);
//        nameTextView2.setTextColor(Color.BLACK);
//        nameTextView3.setTextColor(Color.BLACK);
//        nameTextView4.setTextColor(Color.BLACK);
        //container.addView(nameTextView);
//        ImageView imageView1 = new ImageView(this);
//        ImageView imageView2 = new ImageView(this);
//        ImageView imageView3 = new ImageView(this);
//        ImageView imageView4 = new ImageView(this);
//        imageView1.setImageResource(apple.resId);
//        imageView2.setImageResource(banana.resId);
//        imageView3.setImageResource(orange.resId);
//        imageView4.setImageResource(strawberry.resId);
//        layout1.addView(imageView1);
//        layout2.addView(imageView2);
//        layout3.addView(imageView3);
//        layout4.addView(imageView4);
//        layout1.addView(nameTextView1);
//        layout2.addView(nameTextView2);
//        layout3.addView(nameTextView3);
//        layout4.addView(nameTextView4);
//        container.addView(layout1);
//        container.addView(layout2);
//        container.addView(layout3);
//        container.addView(layout4);
    }

    public void addWord(Word word) {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        TextView nameTextView = new TextView(this);
        nameTextView.setText(word.name);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(word.resId);

        layout.addView(imageView);
        layout.addView(nameTextView);

        container.addView(layout);
    }

    public void addEnglish(English word) {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        TextView nameTextView = new TextView(this);
        nameTextView.setText(word.name);

        TextView nameTextView2 = new TextView(this);
        nameTextView2.setText(word.name2);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(word.resId);

        layout.addView(imageView);
        layout.addView(nameTextView);
        layout.addView(nameTextView2);

        container.addView(layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
