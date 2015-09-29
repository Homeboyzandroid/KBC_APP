package loise.liveo.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.clans.fab.FloatingActionMenu;

import loise.liveo.navigationviewpagerliveo.R;
import loise.liveo.ui.activity.MainActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactsFragment extends android.support.v4.app.Fragment {
    private FloatingActionMenu fab1;
    private FloatingActionMenu fab2;
    private FloatingActionMenu fab3;


    public ContactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_contacts, container, false);
      /* fab1=(FloatingActionMenu)v.findViewById(R.id.menu_item);
        fab1.setOnMenuButtonClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactsFragment.this, NewsFragment.class));
            }
        });*/
        v.findViewById(R.id.menu_item).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MainActivity.class));
            }
        });
        v.findViewById(R.id.menu_item2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MainActivity.class));
            }
        });
        v.findViewById(R.id.menu_item3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),MainActivity.class));
            }
        });



        return v;


    }


}
