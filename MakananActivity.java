package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MakananActivity extends AppCompatActivity {

    ListView listView;
    Spinner combo;

    public String Menu_Makanan [] = {" ","Taman Mini", "Taman Kencana", "Taman Pahlawan", "Taman Merdeka", "Monumen Nasional","Museum Nasional", "Museum Pahlawan","Pantai pasir Putih", "Pantai Ujung Genteng","Pantai Karang Bolong", "Pantai Karang Kritis"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        listView = (ListView) findViewById(R.id.listmakanan);
        combo = (Spinner) findViewById(R.id.combomakanan);

        ArrayAdapter adapter = new ArrayAdapter(MakananActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Menu_Makanan);
        listView.setAdapter(adapter);
        combo.setAdapter(adapter);
    }
}