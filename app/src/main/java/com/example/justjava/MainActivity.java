/**
 * The package in this file has to match the AndroidManifest.xml package found in the manifests
 * folder and if this files package is different then change this files package not the
 * AndroidManifest package
 */

package com.example.justjava;

import java.text.NumberFormat;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int coffeesOrdered = 3;
        display(coffeesOrdered);
        displayPrice(coffeesOrdered * 5);
    }

    public void increment(View view) {
        int quantity = 3;
        display(quantity);
    }

    public void decrement(View view) {
        int quantity = 1;
        display(quantity);
        displayPrice(quantity - 1);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}

