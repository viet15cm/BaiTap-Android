package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public boolean temps = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txb =  (EditText)findViewById(R.id.txb);
        final EditText txb1 =  (EditText)findViewById(R.id.txb2);
        final TextView ketQua = (TextView)findViewById(R.id.KetQua);
        final boolean temp = false;
        Button mot =  (Button)findViewById(R.id.button1);
        Button hai = (Button) findViewById(R.id.button2);
        Button ba =  (Button)findViewById(R.id.button3);
        Button bon = (Button) findViewById(R.id.button4);
        Button nam =  (Button)findViewById(R.id.button5);
        Button sau = (Button) findViewById(R.id.button6);
        Button bay =  (Button)findViewById(R.id.button7);
        Button tam = (Button) findViewById(R.id.button8);
        Button chin =  (Button)findViewById(R.id.button9);
        Button khong =  (Button)findViewById(R.id.button0);
        Button Thoat =  (Button)findViewById(R.id.Thoat);
        Button Xoa =  (Button)findViewById(R.id.Xoa);
        Button Tinh =  (Button)findViewById(R.id.Tinh);
        final RadioButton cong =  (RadioButton) findViewById(R.id.RCong);
        final RadioButton tru =  (RadioButton) findViewById(R.id.RTru);
        final RadioButton nhan =  (RadioButton) findViewById(R.id.RNhan);
        final RadioButton chia =  (RadioButton) findViewById(R.id.RChia);

        txb.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                temps= false;
            }
        });

        txb.setOnFocusChangeListener(new View.OnFocusChangeListener(){

            @Override
            public void onFocusChange(View view, boolean b) {
                if(b)
                temps= true;
            }
        } );

        txb1.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                temps= true;
            }
        });

        txb1.setOnFocusChangeListener(new View.OnFocusChangeListener(){

            @Override
            public void onFocusChange(View view, boolean b) {
                if(b)
                temps= false;
            }
        } );

        Xoa.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                if(temps)
                    txb.setText("");
                else{
                    txb1.setText("");
                }
            }
        });

        Tinh.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                double a =Double.parseDouble(txb.getText().toString());
                double b =Double.parseDouble(txb1.getText().toString());
                double s = 0;
                if(cong.isChecked()){
                    s = a + b;
                }
                if(tru.isChecked()){
                    s = a - b;
                }
                if(nhan.isChecked()){
                    s = a * b;
                }
                if(chia.isChecked()){
                    s = a / b;
                }

               String t = String.valueOf(s);
                ketQua.setText(t);
            }
        });

        Thoat.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                cancel(v);
            }
        });
        mot.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                if(temps)
                    txb.setText(txb.getText() + "1");
                else{
                    txb1.setText(txb1.getText() + "1");
                }
            }
        });
        hai.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                if(temps)
                txb.setText(txb.getText() + "2");
                else{
                    txb1.setText(txb1.getText() + "2");
                }
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                if(temps)
                    txb.setText(txb.getText() + "3");
                else{
                    txb1.setText(txb1.getText() + "3");
                }
            }
        });
        bon.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                if(temps)
                    txb.setText(txb.getText() + "4");
                else{
                    txb1.setText(txb1.getText() + "4");
                }
            }
        });
        nam.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                if(temps)
                    txb.setText(txb.getText() + "5");
                else{
                    txb1.setText(txb1.getText() + "5");
                }
            }
        });
        sau.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                if(temps)
                    txb.setText(txb.getText() + "6");
                else{
                    txb1.setText(txb1.getText() + "6");
                }
            }
        });
        bay.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                if(temps)
                    txb.setText(txb.getText() + "7");
                else{
                    txb1.setText(txb1.getText() + "7");
                }
            }
        });
        tam.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                if(temps)
                    txb.setText(txb.getText() + "8");
                else{
                    txb1.setText(txb1.getText() + "8");
                }
            }
        });

        chin.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                if(temps)
                    txb.setText(txb.getText() + "9");
                else{
                    txb1.setText(txb1.getText() + "9");
                }
            }
        });
        khong.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                if(temps)
                    txb.setText(txb.getText() + "0");
                else{
                    txb1.setText(txb1.getText() + "0");
                }
            }
        });

    }

    public void cancel (View v){
        System.exit(0);
    }

    public void info(View v, String s){


    }
}