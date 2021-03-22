package com.example.project_individu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Pria extends Activity {
    public static final String statusnya="";
    private EditText tinggi_e;
    private EditText berat_e;
    private EditText hasil_e;
    private Button but_hit;
    private Button but_has;
    private double BMI;
    private double tinggi;
    private double berat;
    private int status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pria);
        tinggi_e=(EditText) findViewById(R.id.tinggi_id);
        berat_e=(EditText) findViewById(R.id.berat_id);
        hasil_e=(EditText) findViewById(R.id.hasil_id);
        but_hit=(Button) findViewById(R.id.btn_hitung);
        but_has=(Button) findViewById(R.id.btn_lihathasil);

        but_hit.setOnClickListener(hitung);

        but_has.setOnClickListener(hasile);
    }
    View.OnClickListener hitung=new View.OnClickListener() {

        public void onClick(View v) {
            if(tinggi_e.getText().length()==0 && berat_e.getText().length()==0){
                AlertDialog.Builder alert = new AlertDialog.Builder(Pria.this);
                alert.setTitle(R.string.errorTitle_hitung);
                alert.setMessage(R.string.errorMessage_hitung);
                alert.setPositiveButton(R.string.errorButton_hitung, null);
                alert.show();
            }else{
                tinggi=Double.parseDouble(tinggi_e.getText().toString())/100;
                berat=Double.parseDouble(berat_e.getText().toString());
                BMI = (berat / (tinggi * tinggi));
                hasil_e.setText(String.valueOf(BMI));

                if(BMI >= 30){
                    status=5;
                }else if(BMI >= 25 &&BMI <=29.9){
                    status=4;
                }else if(BMI >= 23 && BMI <=24.9){
                    status=3;
                }else if(BMI >= 18.5 && BMI <=22.9){
                    status=2;
                }else if(BMI < 18.5){
                    status=1;
                }else{
                    status=0;
                } }}};

    View.OnClickListener hasile=new View.OnClickListener() {

        public void onClick(View v) {
            if(hasil_e.getText().length()==0){
                AlertDialog.Builder alert = new AlertDialog.Builder(Pria.this);
                alert.setTitle(R.string.errorTitle_hasil);
                alert.setMessage(R.string.errorMessage_hasil);
                alert.setPositiveButton(R.string.errorButton_hasil, null);
                alert.show();
            }else{
                Intent viewCon = new Intent(Pria.this, Hasil.class);
                viewCon.putExtra(statusnya, status);
                startActivity(viewCon);
            }
        }
    };
}

