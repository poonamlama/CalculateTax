package com.calculatetax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etSalary;
    private TextView tvResult;
    private Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSalary = findViewById(R.id.etSalary);
        tvResult = findViewById(R.id.tvResult);
        btnCalc = findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etSalary.getText().toString())){
            etSalary.setError("Please enter salary");
            etSalary.requestFocus();
            return;
        }
        float salary = Float.parseFloat(etSalary.getText().toString());

        Tax tax = new Tax();
        tax.setSalary(salary);
        tvResult.setText(Float.toString(tax.getTax()));
    }
}
