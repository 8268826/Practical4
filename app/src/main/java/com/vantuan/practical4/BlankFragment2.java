package com.vantuan.practical4;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class BlankFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);

        ListView listView = view.findViewById(R.id.list_view);
        String[] items = getItems();
        CustomAdapterListView adapter = new CustomAdapterListView(getContext(), items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(view.getContext(), "Clicked on " + items[position], Toast.LENGTH_SHORT).show();
                Log.d("LISTVIEW", "Clicked on " + items[position]);
            }
        });

        Button btn_back = view.findViewById(R.id.back2);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }


    private static final int ITEMS_COUNT = 200;

    private String[] getItems() {
        String[] items = new String[ITEMS_COUNT];
        for (int i = 0; i < ITEMS_COUNT; i++) {
            items[i] = "Item " + i;
        }
        return items;
    }

}