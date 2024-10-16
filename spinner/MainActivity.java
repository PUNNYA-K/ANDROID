package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner fruitSpinner = findViewById(R.id.fruit_spinner);
        TextView selectedFruit = findViewById(R.id.selected_fruit);

        // Define the fruit options directly in code
        String[] fruits = {"Apple", "Banana", "Cherry", "Grape", "Orange"};

        // Create an ArrayAdapter using the fruit array
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, fruits);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fruitSpinner.setAdapter(adapter);

        // Set an item selected listener
        fruitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String fruit = parent.getItemAtPosition(position).toString();
                selectedFruit.setText("Selected Fruit: " + fruit);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedFruit.setText("No selection");
            }
        });
    }
}
