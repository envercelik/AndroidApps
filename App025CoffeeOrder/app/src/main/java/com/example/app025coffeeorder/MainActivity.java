package com.example.app025coffeeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This activity displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    TextView textViewQuantity;
    TextView textViewPrice;
    int numberOfCoffees = 0;
    int coffeePrice = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializes();

    }


    /**
     * this method is called when the order button is clicked. Calculate the coffee price and displays
     */
    public void submitOrder(View view) {

        displayPrice(numberOfCoffees*coffeePrice); //coffee is 5 tl.
    }


    /**
     * this method displays the given quantity value on the screen
     */
    public void displayQuantity(int number) {
        textViewQuantity.setText(""+number);
    }



    /**
     * This method displays the coffee price value on the screen
     */
    private void displayPrice(int number) {
        String priceMessage = "Total: " + NumberFormat.getCurrencyInstance().format(number)+"\n"+"Thank You!";
        textViewPrice.setText(priceMessage);
    }


    /**
     * this method is called when the plus button is clicked and increase coffee number and displays
     */
    public void increment(View view) {
        numberOfCoffees++;
        displayQuantity(numberOfCoffees);
    }


    /**
     * this method is called when the minus button is clicked and decrease coffee number and displays
     */
    public void decrement(View view) {

        numberOfCoffees--;

        if (numberOfCoffees == -1) {
            numberOfCoffees = 0;
        }

        displayQuantity(numberOfCoffees);
    }



    public void initializes() {
        textViewQuantity = findViewById(R.id.text_view_quantity);
        textViewPrice = findViewById(R.id.text_view_price);
    }

}

/*

-An activity represents a single focus thing that the user can do. Essentially an activity is how
you can display your layout and interact with the user.


-onClick="submitOrder" xml attribute :

this means when the view is clicked on , then it try to perform or execute
as we say in java a set of instructions that have been named submitOrder.



*/