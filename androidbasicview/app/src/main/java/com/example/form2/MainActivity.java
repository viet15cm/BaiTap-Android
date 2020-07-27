package com.example.form2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //EditText pname;
    //EditText pemail;
    @Override
    //2020 Copyright by Tiendatmagic
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText pname =  (EditText)findViewById(R.id.pname);
        final EditText pemail =  (EditText)findViewById(R.id.pemail);
        final CheckBox cb1 =  (CheckBox) findViewById(R.id.cb1);
        final CheckBox cb2 =  (CheckBox) findViewById(R.id.cb2);
        final CheckBox cb3 =  (CheckBox) findViewById(R.id.cb3);
        final RadioButton rnam =  (RadioButton) findViewById(R.id.rnam);
        final RadioButton rnu =  (RadioButton) findViewById(R.id.rnu);
        final Spinner spnn =  (Spinner) findViewById(R.id.spnn);
        final Switch switchh =  (Switch) findViewById(R.id.switchh);
        Button btninfo =  (Button)findViewById(R.id.btninfo);
        Button btncancel = (Button) findViewById(R.id.btncancel);
        btncancel.setOnClickListener(new View.OnClickListener() {
            // thực thi phương thức callback onClick
            public void onClick(View v) {
                cancel(v);
            }
        });

        btninfo.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            String msg = "Tên: " + pname.getText().toString() +
                    System.getProperty("line.separator") +
                    "Email: " + pemail.getText().toString();
            msg += System.getProperty("line.separator") + "Sở thích: ";
            if(cb1.isChecked())
                msg += cb1.getText().toString()+ ", ";
            if(cb2.isChecked())
                msg += cb2.getText().toString() + ", ";
            if(cb3.isChecked())
                msg += cb3.getText().toString()+ ", ";
            msg += System.getProperty("line.separator") + "Giới tính: ";
            if(rnam.isChecked())
                msg += rnam.getText().toString();
            if(rnu.isChecked())
                msg += rnu.getText().toString();
            msg += System.getProperty("line.separator") + "Ngôn ngữ: " +
                    spnn.getSelectedItem().toString();

            msg += System.getProperty("line.separator") + "Sử dụng framework: ";
            if(switchh.isChecked())
                msg += "Yes";
            else
                msg += "No";
            info(v,msg);
        }

    });

    }

    public void cancel (View v){
        System.exit(0);
    }

    public void info(View v, String msg){
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage(msg);
        dlgAlert.setTitle("Thông báo");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();

    }

}
//2020 Copyright by Tiendatmagic