package com.example.project_individu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_Penyakit extends AppCompatActivity {
    ActionBar toolbar;
    TextView txtDetailnama;
    TextView txt_keterangan;
    ImageView imageDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__penyakit);

        toolbar = getSupportActionBar();
        txtDetailnama = findViewById(R.id.detail_Nama);
        txt_keterangan = findViewById(R.id.detail_keterangan);
        imageDetail = findViewById(R.id.img);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            toolbar.setTitle(bundle.getString("Title"));
            txtDetailnama.setText(bundle.getString("Nama Penyakit"));
            imageDetail.setImageResource(bundle.getInt("Image"));
            txt_keterangan.setText(bundle.getString("Detail Keterangan Penyakit"));
        }
    }
}
