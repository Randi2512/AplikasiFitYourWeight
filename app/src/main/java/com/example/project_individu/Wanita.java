package com.example.project_individu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Wanita extends AppCompatActivity {

    EditText edtBB;
    TextView output;
    private Spinner spinner1;
    Button cek;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wanita);
     output=(TextView)findViewById(R.id.output);
        edtBB = (EditText)findViewById(R.id.edtbb);
        cek=(Button)findViewById(R.id.button);
        spinner1 = (Spinner) findViewById(R.id.spinner);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id){
                String kelamin = String.valueOf(parentView.getSelectedItem());
                Toast.makeText(getApplication(), "Jenis Kelamin Anda " + kelamin, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView){
            }
        });

        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungan();


            }
        });
                }


                private void hitungan(){
                    double bb = Double.parseDouble(edtBB.getText().toString());
                    final double tb = (bb / 0.9 ) + 100;

                    output.setText("Berat Anda :"+edtBB.getText().toString()+
                            "\nJenis Kelamin :"+spinner1.getSelectedItem().toString()+
                            "\nTinggi Badan Ideal Anda Adalah: "+String.format("%0f",tb));

                }


}

