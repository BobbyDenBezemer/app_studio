package com.example.bobby.calc_app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    // declaring the objects
    EditText operand1;
    EditText operand2;
    Button plusButton;
    Button minusButton;
    Button multButton;
    Button divButton;
    TextView result;
    Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // the numbers entered by the user
        operand1 = (EditText) findViewById(R.id.first_number);
        operand2 = (EditText) findViewById(R.id.second_number);

        // calculation and clear button(s)
        plusButton = (Button) findViewById(R.id.plusButton);
        minusButton = (Button) findViewById(R.id.minusButton);
        multButton = (Button) findViewById(R.id.multButton);
        divButton = (Button) findViewById(R.id.divButton);
        clearButton = (Button) findViewById(R.id.clearButton);

        // get the textview to put the result in
        result = (TextView) findViewById(R.id.resultBox);

        // Making the plus button
        plusButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                // parse the first 2 operands to floats
                float oper1 = Float.parseFloat(operand1.getText().toString());
                float oper2 = Float.parseFloat(operand2.getText().toString());

                // add the first field by the second and set the finalResult field to this
                float finalResult = oper1 + oper2;
                result.setText(Float.toString(finalResult));

            }
        });

        // making the minus button
        minusButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                // parse the first 2 operands to floats
                float oper1 = Float.parseFloat(operand1.getText().toString());
                float oper2 = Float.parseFloat(operand2.getText().toString());

                // substract the first field by the second and set the finalResult field to this
                float finalResult = oper1 - oper2;
                result.setText(Float.toString(finalResult));

            }
        });

        // adding an event listener to the multiplication button
        multButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                // parse the first and second operands to floats
                float oper1 = Float.parseFloat(operand1.getText().toString());
                float oper2 = Float.parseFloat(operand2.getText().toString());

                // multiply the first field by the second and set the finalResult field to this
                float finalResult = oper1 * oper2;
                result.setText(Float.toString(finalResult));

            }
        });

        // adding an event listener to the division button
        divButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                // on click parse both text inputs to float
                float oper1 = Float.parseFloat(operand1.getText().toString());
                float oper2 = Float.parseFloat(operand2.getText().toString());

                // divide the first field by the second and set the finalResult field to this
                float finalResult = oper1 / oper2;
                result.setText(Float.toString(finalResult))

            }
        });

        // adding an event listener to the clear button
        clearButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                // set the operands empty and the result to 00.00
                operand1.setText("");
                operand2.setText("");
                result.setText("00.00");

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
