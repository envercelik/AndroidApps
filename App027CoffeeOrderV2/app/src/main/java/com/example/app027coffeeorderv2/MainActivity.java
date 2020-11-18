package com.example.app027coffeeorderv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This activity displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    TextView textViewQuantity;
    TextView textViewOrderSummary;
    EditText editTextName;
    CheckBox checkBoxWhippedCream;
    CheckBox checkBoxChocolate;

    int numberOfCoffees = 1;
    double pricePerCup = 5;
    double pricePerChocolate = 2;
    double pricePerWhippedCream = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializes();

    }







    public void initializes() {
        textViewQuantity = findViewById(R.id.text_view_quantity);
        textViewOrderSummary = findViewById(R.id.text_view_order_summary);
        editTextName = findViewById(R.id.edit_text_name);
        checkBoxWhippedCream = findViewById(R.id.checkbox_whipped_cream);
        checkBoxChocolate = findViewById(R.id.checkbox_chocolate);
    }




    /**
     * this method is called when the order button is clicked.
     * Calculate the coffee price and displays order summary.
     */
    public void submitOrder(View view) {


        boolean hasWhippedCream = checkBoxWhippedCream.isChecked();
        boolean hasChocolate = checkBoxChocolate.isChecked();

        double price = calculatePrice(hasChocolate,hasWhippedCream);


        String name = editTextName.getText().toString();

        String orderSummary = createOrderSummary(name , price, hasWhippedCream , hasChocolate);


        sendEmailForOrder(orderSummary);



    }


    public void sendEmailForOrder(String orderSummary) {

        String[] emails = {"cofeeservice@gmail.com"};

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, emails );
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.coffee_order));
        intent.putExtra(Intent.EXTRA_TEXT,orderSummary);


        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            displayOrderSummary(orderSummary);
        }
    }



    /**
     * Create summary of the order
     *
     * @param price of the order
     * @param addWhippedCream is whether or not the user wants whipped cream toppings.
     * @param addChocolate is whether or not the user wants chocolate toppings.
     *
     * @return order summary text
     */

    private String createOrderSummary(String name, double price , boolean addWhippedCream , boolean addChocolate) {

        String whippedCream;
        String chocolate;

        if (addWhippedCream) {
             whippedCream = getString(R.string.Yes);
        } else {
             whippedCream = getString(R.string.No);
        }

        if (addChocolate) {
            chocolate = getString(R.string.Yes);
        } else {
            chocolate = getString(R.string.No);
        }




        String orderMessage = getString(R.string.order_summary_name) + name +  "\n";
        orderMessage += getString(R.string.has_whipped_cream) + whippedCream + "\n";
        orderMessage += getString(R.string.has_chocolate) + chocolate + "\n";
        orderMessage += getString(R.string.number_off_coffee) + numberOfCoffees + "\n";
        orderMessage += getString(R.string.total) + NumberFormat.getCurrencyInstance().format(price) + "\n" ;
        orderMessage += getString(R.string.thank_you);

        return orderMessage;
    }


    /**
     * Calculates the price of the order
     *
     * @return total price
     */
    private double calculatePrice(boolean hasChocolate , boolean hasWhippedCream) {

        double totalPrice = numberOfCoffees*pricePerCup;

        if (hasChocolate) {
            totalPrice += numberOfCoffees*pricePerChocolate;
        }

        if (hasWhippedCream) {
            totalPrice += numberOfCoffees*pricePerWhippedCream;
        }

        return totalPrice;

    }




    /**
     * this method displays the given quantity value on the screen
     */
    public void displayQuantity(int number) {
        textViewQuantity.setText(""+number);
    }


    /**
     * This method displays order summary on the screen
     */
    private void displayOrderSummary(String orderSummary) {
        textViewOrderSummary.setText(orderSummary);
    }


    /**
     * this method is called when the plus button is clicked and increase coffee number and displays
     */
    public void increment(View view) {

        if (numberOfCoffees == 20) {
            Toast.makeText(this , "You cannot have more than 20 coffee",Toast.LENGTH_SHORT).show();
            return;
        }
        numberOfCoffees++;

        displayQuantity(numberOfCoffees);
    }


    /**
     * this method is called when the minus button is clicked and decrease coffee number and displays
     */
    public void decrement(View view) {

        if (numberOfCoffees == 1) {
            Toast.makeText(this , "You cannot have less than 1 coffee",Toast.LENGTH_SHORT).show();
            return;
        }


        numberOfCoffees--;

        displayQuantity(numberOfCoffees);
    }





}
