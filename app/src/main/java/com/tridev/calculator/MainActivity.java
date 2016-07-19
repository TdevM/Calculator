package com.tridev.calculator;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonDot, buttonC, buttonEqual, buttonoff;

    EditText edt1;

    float mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



      //  requestWindowFeature(Window.FEATURE_NO_TITLE);
        // hide the status bar and other OS-level chrome
       // getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        button0 = (Button) findViewById(R.id.button17);
        button1 = (Button) findViewById(R.id.button13);
        button2 = (Button) findViewById(R.id.button14);
        button3 = (Button) findViewById(R.id.button15);
        button4 = (Button) findViewById(R.id.button9);
        button5 = (Button) findViewById(R.id.button10);
        button6 = (Button) findViewById(R.id.button11);
        button7 = (Button) findViewById(R.id.button5);
        button8 = (Button) findViewById(R.id.button6);
        button9 = (Button) findViewById(R.id.button7);
        buttonDot = (Button) findViewById(R.id.button16);
        buttonAdd = (Button) findViewById(R.id.button2);
        buttonSub = (Button) findViewById(R.id.button3);
        buttonMul = (Button) findViewById(R.id.button4);
        buttonDivision = (Button) findViewById(R.id.button);
        buttonC = (Button) findViewById(R.id.button12);
        buttonEqual = (Button) findViewById(R.id.button18);
        edt1 = (EditText) findViewById(R.id.textView);
        buttonoff = (Button) findViewById(R.id.button8);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                edt1.setText(edt1.getText() + "1");
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                edt1.setText(edt1.getText() + "2");
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                edt1.setText(edt1.getText() + "3");
            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                edt1.setText(edt1.getText() + "4");
            }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                edt1.setText(edt1.getText() + "5");
            }

        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                edt1.setText(edt1.getText() + "6");
            }

        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                edt1.setText(edt1.getText() + "7");
            }

        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                edt1.setText(edt1.getText() + "8");
            }

        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                edt1.setText(edt1.getText() + "9");
            }

        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                edt1.setText(edt1.getText() + "0");
            }
        });


        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                int length = edt1.getText().length();
                if (length > 0) {
                    edt1.getText().delete(length - 1, length);
                }
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                edt1.setText(edt1.getText() + ".");
            }
        });


        buttonoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edt1.getText() + "");
                mAddition = true;
                edt1.setText(null);

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edt1.getText() + "");
                mSubtract = true;
                edt1.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edt1.getText() + "");
                mMultiplication = true;
                edt1.setText(null);

            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueOne = Float.parseFloat(edt1.getText() + "");
                mDivision = true;
                edt1.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueTwo = Float.parseFloat(edt1.getText() + "");

                if (mAddition == true) {

                    edt1.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }


                if (mSubtract == true) {
                    edt1.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    edt1.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    edt1.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }


        });

    }

}