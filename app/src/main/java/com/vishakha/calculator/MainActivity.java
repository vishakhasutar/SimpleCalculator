package com.vishakha.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //region viewvariables
    EditText et_num1, et_num2;
    Button btn_add, btn_sub, btn_mul, btn_div,btn_clr;
    TextView tv_data;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpView();
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addition();
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                substraction();
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiplication();
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                division();
            }
        });
        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetValue();
            }

        });

    }

    //region localmethods
    private void setUpView() {
        et_num1 = (EditText) findViewById(R.id.et_num1);
        et_num2 = (EditText) findViewById(R.id.et_num2);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_clr = (Button) findViewById(R.id.btn_clr);
        tv_data = (TextView) findViewById(R.id.tv_result);
    }

    private void resetValue() {
        et_num1.setText("");
        et_num2.setText("");
        tv_data.setText("*");
    }

    private void addition() {
        String num1 = (et_num1.getText().toString());
        String num2 = (et_num2.getText().toString());
        if (num1 != null && !num1.equalsIgnoreCase("") &&
                num2 != null && !num2.equalsIgnoreCase("")) {
            int x = Integer.parseInt(num1);
            int y = Integer.parseInt(num2);
            tv_data.setText(String.valueOf(x + y));

        } else {
            Toast.makeText(MainActivity.this, "Please enter number correctly", Toast.LENGTH_SHORT).show();
        }
    }

    private void substraction() {
        String num1 = (et_num1.getText().toString());
        String num2 = (et_num2.getText().toString());
        if (num1 != null && !num1.equalsIgnoreCase("") &&
                num2 != null && !num2.equalsIgnoreCase("")) {
            int x = Integer.parseInt(num1);
            int y = Integer.parseInt(num2);


            tv_data.setText(String.valueOf(x - y));

        } else {
            Toast.makeText(MainActivity.this, "Please enter number correctly", Toast.LENGTH_SHORT).show();
        }
    }

    private void multiplication() {
        String num1 = (et_num1.getText().toString());
        String num2 = (et_num2.getText().toString());
        if (num1 != null && !num1.equalsIgnoreCase("") &&
                num2 != null && !num2.equalsIgnoreCase("")) {
            int x = Integer.parseInt(num1);
            int y = Integer.parseInt(num2);


            tv_data.setText(String.valueOf(x * y));

        } else {
            Toast.makeText(MainActivity.this, "Please enter number correctly", Toast.LENGTH_SHORT).show();
        }
    }

    private void division() {
        String num1 = (et_num1.getText().toString());
        String num2 = (et_num2.getText().toString());
        if (num1 != null && !num1.equalsIgnoreCase("") &&
                num2 != null && !num2.equalsIgnoreCase("")) {
            float x = Float.parseFloat(num1);
            float y = Float.parseFloat(num2);
            float z = x / y;


            tv_data.setText(String.valueOf(z));

        } else {
            Toast.makeText(MainActivity.this, "Please enter number correctly", Toast.LENGTH_SHORT).show();
        }
    }

    //endregion
}