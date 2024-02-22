package com.firstapp.cardock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class CarRegistratiom extends AppCompatActivity {

    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_registratiom);

        TextView vehicalName8 = (EditText) findViewById(R.id.vehicalName8);
        TextView NumberPlate = (EditText) findViewById(R.id.NumberPlate);
        TextView FuelType = (EditText) findViewById(R.id.FuelType);
        TextView Transmission = (EditText) findViewById(R.id.Transmission);
        TextView Mileage = (EditText) findViewById(R.id.Mileage);
        TextView RegYear = (EditText) findViewById(R.id.RegYear);
        TextView OwnerDetails = (EditText) findViewById(R.id.OwnerDetails);
        TextView price = (EditText) findViewById(R.id.price);

        Button button = (Button) findViewById(R.id.button);

        String arr[]= new String[n];
        NumberPlate.setText(Arrays.toString(arr));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(NumberPlate.getText().toString().equals(arr[n])) {
                    Toast.makeText(CarRegistratiom.this, "VEHICAL ALREADY HAVE", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(CarRegistratiom.this, "SUBMITTED", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }
}