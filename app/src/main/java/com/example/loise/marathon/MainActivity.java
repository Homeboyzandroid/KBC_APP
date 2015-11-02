package com.example.loise.marathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.loise.marathon.Adapter.CustomAdapter;
import com.example.loise.marathon.Adapter.CustomGrid;
import com.github.clans.fab.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    GridView gridview;
    CustomAdapter lviewAdapter;
    ArrayList<HashMap<String, String>> oslist = new ArrayList<HashMap<String, String>>();

    private final static String web[] = {"About",
            "Challange",
            "Register",
            "News",
            "Fitness",
            "Calender",
            "Social",
            "Media",
            "Statistics",};
    private final static int []imageId =
            {R.drawable.about,
            R.drawable.chalenge,
            R.drawable.register,
            R.drawable.news,
            R.drawable.fitness,
            R.drawable.events,
            R.drawable.sociali,
            R.drawable.audio,
            R.drawable.statistics,};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.logo);

        //initalizing the adapter
        CustomGrid adapter = new CustomGrid(getApplicationContext(), web, imageId);

        gridview = (GridView)findViewById(R.id.gridView);
        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(getActivity(),"welcome to"+web,Toast.LENGTH_SHORT).show();ra

                switch (position) {
                    case 0:
                        startActivity(new Intent(getApplicationContext(), About.class));
                        break;
                    case 1:
<<<<<<< HEAD
                        startActivity(new Intent(getApplicationContext(), Calender.class));
=======
                        startActivity(new Intent(getApplicationContext(), About.class));
>>>>>>> 9b3ac21bd8fb06836bbfad8150d82ac8729627fa
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
                        break;

                    case 3:
                        startActivity(new Intent(getApplicationContext(), Social.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(), Map.class));
                        break;
                    case 5:
                        startActivity(new Intent(getApplicationContext(), Social.class));
                        break;
                }

            }
        });
        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.menu_item);
      //  FloatingActionButton fab1=(FloatingActionButton)findViewById(R.id.menu_item2);

        fab.setOnClickListener( this);
        //fab1.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menu_item:
                startActivity(new Intent(getApplicationContext(),twitter.class));
               break;

           /* case R.id.menu_item2:
                startActivity(new Intent(getApplicationContext(),twitter.class));
               break;*/
        }

    }
}
