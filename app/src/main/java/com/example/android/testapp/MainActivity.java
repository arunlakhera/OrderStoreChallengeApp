package com.example.android.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // Variables for Americano order
    int americanoQuantity = 0;
    int americanoPrice = 50;
    int americanoTotal = 0;

    // Variables for Espresso order
    int espressoQuantity = 0;
    int espressoPrice = 50;
    int espressoTotal = 0;

    // Variables for Capuccino order
    int capuccinoQuantity = 0;
    int capuccinoPrice = 77;
    int capuccinoTotal = 0;

    // Variables for Frapuccino order
    int frapuccinoQuantity = 0;
    int frapuccinoPrice = 72;
    int frapuccinoTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // AMERICANO ORDER

    // Method to Display quantity in the Americano Quantity Textview
    public void displayAmericanoQuantity(int quantity) {

        TextView americanoQuantity_TextView = (TextView) findViewById(R.id.americano_quantity);
        americanoQuantity_TextView.setText(String.valueOf(quantity));

    }

    // Method to Display Price for the selected quantity in the Americano Total Price Textview
    public void displayAmericanoPrice(int quantity) {

        americanoTotal = quantity * americanoPrice;
        TextView americanoTotal_TextView = (TextView) findViewById(R.id.americano_total);
        americanoTotal_TextView.setText("Rs. " + americanoTotal);
    }

    // Method to Increment the Quantity of Americano Order by 1 in Quantity text view and updating the price in the Textview
    public void americanoIncrement(View view) {
        americanoQuantity = americanoQuantity + 1;
        displayAmericanoQuantity(americanoQuantity);
        displayAmericanoPrice(americanoQuantity);
        displayTotalOrder();
    }

    // Method to Decrement the Quantity of Americano Order by 1 in Quantity text view and updating the price in the Textview
    public void americanoDecrement(View view) {

        if (americanoQuantity > 0){
            americanoQuantity = americanoQuantity - 1;
        }

        displayAmericanoQuantity(americanoQuantity);
        displayAmericanoPrice(americanoQuantity);
        displayTotalOrder();
    }


    // ESPRESSO ORDER

    // Method to Display quantity in the ESPRESSO Quantity Textview

    public void displayEspressoQuantity(int quantity) {

        TextView espressoQuantity_TextView = (TextView) findViewById(R.id.espresso_quantity);
        espressoQuantity_TextView.setText(String.valueOf(quantity));

    }

    // Method to Display Price for the selected quantity in the ESPRESSO Total Price Textview

    public void displayEspressoPrice(int quantity) {

        espressoTotal = quantity * espressoPrice;
        TextView espressoTotal_TextView = (TextView) findViewById(R.id.espresso_total);
        espressoTotal_TextView.setText("Rs. " + espressoTotal);
    }

    // Method to Increment the Quantity of ESPRESSO Order by 1 in Quantity text view and updating the price in the Textview

    public void espressoIncrement(View view) {
        espressoQuantity = espressoQuantity + 1;
        displayEspressoQuantity(espressoQuantity);
        displayEspressoPrice(espressoQuantity);
        displayTotalOrder();
    }
    // Method to Decrement the Quantity of ESPRESSO Order by 1 in Quantity text view and updating the price in the Textview

    public void espressoDecrement(View view) {

        if (espressoQuantity > 0){
            espressoQuantity = espressoQuantity - 1;
        }

        displayEspressoQuantity(espressoQuantity);
        displayEspressoPrice(espressoQuantity);
        displayTotalOrder();
    }


    // CAPUCCINO ORDER

    // Method to Display quantity in the CAPUCCINO Quantity Textview
    public void displayCapuccinoQuantity(int quantity) {

        TextView capuccinoQuantity_TextView = (TextView) findViewById(R.id.capuccino_quantity);
        capuccinoQuantity_TextView.setText(String.valueOf(quantity));

    }

    // Method to Display Price for the selected quantity in the CAPUCCINO Total Price Textview
    public void displayCapuccinoPrice(int quantity) {

        capuccinoTotal = quantity * capuccinoPrice;
        TextView capuccinoTotal_TextView = (TextView) findViewById(R.id.capuccino_total);
        capuccinoTotal_TextView.setText("Rs. " + capuccinoTotal);
    }

    // Method to Increment the Quantity of CAPUCCINO Order by 1 in Quantity text view and updating the price in the Textview
    public void capuccinoIncrement(View view) {
        capuccinoQuantity = capuccinoQuantity + 1;
        displayCapuccinoQuantity(capuccinoQuantity);
        displayCapuccinoPrice(capuccinoQuantity);
        displayTotalOrder();
    }

    // Method to Decrement the Quantity of CAPUCCINO Order by 1 in Quantity text view and updating the price in the Textview
    public void capuccinoDecrement(View view) {

        if (capuccinoQuantity > 0){
            capuccinoQuantity = capuccinoQuantity - 1;
        }

        displayCapuccinoQuantity(capuccinoQuantity);
        displayCapuccinoPrice(capuccinoQuantity);
        displayTotalOrder();
    }

    // FRAPUCCINO ORDER
    // Method to Display quantity in the Frapuccino Quantity Textview

    public void displayFrapuccinoQuantity(int quantity) {

        TextView FrapuccinoQuantity_TextView = (TextView) findViewById(R.id.frapuccino_quantity);
        FrapuccinoQuantity_TextView.setText(String.valueOf(quantity));

    }

    // Method to Display Price for the selected quantity in the Frapuccino Total Price Textview

    public void displayFrapuccinoPrice(int quantity) {

        frapuccinoTotal = quantity * frapuccinoPrice;
        TextView FrapuccinoTotal_TextView = (TextView) findViewById(R.id.frapuccino_total);
        FrapuccinoTotal_TextView.setText("Rs. " + frapuccinoTotal);
    }

    // Method to Increment the Quantity of Frapuccino Order by 1 in Quantity text view and updating the price in the Textview

    public void frapuccinoIncrement(View view) {
        frapuccinoQuantity = frapuccinoQuantity + 1;
        displayFrapuccinoQuantity(frapuccinoQuantity);
        displayFrapuccinoPrice(frapuccinoQuantity);
        displayTotalOrder();
    }

    // Method to Decrement the Quantity of Frapuccino Order by 1 in Quantity text view and updating the price in the Textview

    public void frapuccinoDecrement(View view) {

        if (frapuccinoQuantity > 0){
            frapuccinoQuantity = frapuccinoQuantity - 1;
        }

        displayFrapuccinoQuantity(frapuccinoQuantity);
        displayFrapuccinoPrice(frapuccinoQuantity);
        displayTotalOrder();
    }

    // Method to Display Total Order Price

    public void displayTotalOrder() {

        int totalOrderAmount = americanoTotal + espressoTotal + capuccinoTotal + frapuccinoTotal;
        TextView totalOrderAmount_TextView = (TextView) findViewById(R.id.total_order_amount);
        totalOrderAmount_TextView.setText("Payable Amount: Rs. "+ totalOrderAmount);
    }

}
