package com.beyondzero.loise.marathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

<<<<<<< HEAD
=======
import android.view.Menu;
import android.view.MenuItem;
>>>>>>> 5ec40288a5f508d29b1acf158823f5ec79013756

import android.view.View;
import android.widget.AdapterView;

<<<<<<< HEAD
=======

>>>>>>> 5ec40288a5f508d29b1acf158823f5ec79013756
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.beyondzero.loise.marathon.Adapter.CardViewDataAdapter;

public class FAQsActivity extends AppCompatActivity {


<<<<<<< HEAD
    //    //declaration of values
//    private RecyclerView mRecyclerView;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager mLayoutManager;
//

//
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_faqs);
//
            String[] myDataset = {"How to Donate", "How to Register", "Marathon Date", "Marathon venue",};

            ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myDataset);

            ListView myList = (ListView) findViewById(R.id.listView);
            myList.setAdapter(myAdapter);

            myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            startActivity(new Intent(getApplicationContext(), DonationInfo.class));
                            break;
                        case 1:
                            startActivity(new Intent(getApplicationContext(), RegistrationInfo.class));
                            break;
                        case 2:
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            break;
                        case 3:
                            startActivity(new Intent(getApplicationContext(), RoutesActivity.class));
                            break;
                    }
                }
            });


        }
    }
=======



  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_faqs);
//
      String[] myDataset = {"How to Donate", "How to Register", "Marathon Date", "Marathon venue",};

      ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myDataset);

      ListView myList= (ListView)findViewById(R.id.listView);
      myList.setAdapter(myAdapter);

      myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              switch (position){
                  case 0:
                      startActivity(new Intent(getApplicationContext(),DonationInfo.class));
                      break;
                  case 1:
                      startActivity(new Intent(getApplicationContext(),RegistrationInfo.class));
                      break;
                  case 2:
                      startActivity(new Intent(getApplicationContext(),MainActivity.class));
                      break;
                  case 3:
                      startActivity(new Intent(getApplicationContext(),RoutesActivity.class));
                      break;
              }
          }
      });


  }
}
>>>>>>> 5ec40288a5f508d29b1acf158823f5ec79013756
