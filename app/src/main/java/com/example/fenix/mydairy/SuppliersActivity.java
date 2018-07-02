package com.example.fenix.mydairy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SuppliersActivity extends AppCompatActivity {
    String[] suppliers = {"DAVID", "JAMES", "ISAIAH", "JOSHUA", "JOHN", "JOEL", "JOACHIM", "NICK", "RONNIE", "YOU", "GWE", "NAWE", "GUNDI", "Nansikombi"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suppliers);
        ListView listview = (ListView) findViewById(R.id.suppliers_list_view);

        ArrayAdapter adapter = new ArrayAdapter(SuppliersActivity.this, android.R.layout.simple_list_item_1, suppliers);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "position" + position + suppliers[position], Toast.LENGTH_LONG).show();
            }
        });

    }

    public void addSupplier(View view) {
        Intent addSupplierIntent = new Intent(SuppliersActivity.this, AddSupplierActivity.class);
        startActivity(addSupplierIntent);
    }
}
