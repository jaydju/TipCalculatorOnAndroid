package com.example.android.takehomelesson06_juand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        Intent main = getIntent();
        double total = main.getDoubleExtra("a", 1);
        TextView totalView = findViewById(R.id.total);
        totalView.setText("Total: " + String.valueOf(total));

        double salesTax = main.getDoubleExtra("tx", 1);
        TextView salesTaxView = findViewById(R.id.sales_tax);
        salesTaxView.setText("Sales Tax: " + String.valueOf(salesTax));

        double tip = main.getDoubleExtra("tp", 1);
        TextView tipView = findViewById(R.id.tip);
        tipView.setText("Tip: " + String.valueOf(tip));

        double grandTotal = total + (total * (salesTax/100)) + tip;
        TextView grandTotalView = findViewById(R.id.grand_total);
        grandTotalView.setText("Grand Total: " + String.valueOf(grandTotal));


//        Intent main = getIntent();
//        String amount = main.getStringExtra("a");
//        double amountInt = Integer.parseInt(amount);
//
//        String tax = main.getStringExtra("tx");
//        double taxInt = Integer.parseInt(tax);
//
//        String tip = main.getStringExtra("tp");
//        double tipInt = Integer.parseInt(tip);
//
//        TextView totalView = findViewById(R.id.total);
//        String totalString = Double.toString(amount);
//        totalView.setText("Total: " + totalString);
//
//        TextView salesTaxView = findViewById(R.id.sales_tax);
//        String taxString = Double.toString(tax);
//        salesTaxView.setText("Sales Tax: " + taxString);
//
//        TextView tipTaxView = findViewById(R.id.tip);
//
//        String tipString = Double.toString(tip);
//        tipTaxView.setText("Tip: " + tipString);
//
//        TextView grandTotal = findViewById(R.id.grand_total);
//        double total = amount + (amount * (tax/100)) + tip;
//        String grandTotalString = Double.toString(total);
//        grandTotal.setText("Grand Total: " + grandTotalString);
    }

}
