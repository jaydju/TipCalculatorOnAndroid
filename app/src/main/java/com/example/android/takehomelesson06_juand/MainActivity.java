package com.example.android.takehomelesson06_juand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitClick(View view){
        EditText amountView = (EditText) findViewById(R.id.amount);
        EditText taxView = (EditText) findViewById(R.id.tax_percentage);
        EditText tipView = (EditText) findViewById(R.id.tip_percentage);

        String amount = amountView.getText().toString();
        String taxPercentage = taxView.getText().toString();
        String tipPercentage = tipView.getText().toString();

        double amountDouble = Double.parseDouble(amount);
        double taxPercentageDouble = Double.parseDouble(taxPercentage);
        double tipPercentageDouble = Double.parseDouble(tipPercentage);

        Intent receipt = new Intent(this, ReceiptActivity.class);
        receipt.putExtra("a", amountDouble);
        receipt.putExtra("tx", taxPercentageDouble);
        receipt.putExtra("tp", tipPercentageDouble);

        startActivity(receipt);
    }
}
