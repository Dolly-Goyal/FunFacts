package com.app.funfacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {
    // make the object outside define class
    private FactBook mfactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our View Variable and assign views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        //On Click Button events generate
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   String fact = mfactBook.getFact();
                   // Update the label with our dynamic facts
                   factLabel.setText(fact);
                   int color = mColorWheel.getColor();
                   relativeLayout.setBackgroundColor(color);
                   showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
        Toast.makeText(this, "Hello We create a FunFact App!", Toast.LENGTH_LONG).show();
           }
}
