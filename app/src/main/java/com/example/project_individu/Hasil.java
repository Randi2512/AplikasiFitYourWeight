package com.example.project_individu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    private int id;
    private FrameLayout frame1;
    private FrameLayout frame2;
    private TextView hasile;
    private TextView saran;
    private Button but_penyakit;
    private Button but_tips;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        frame1=(FrameLayout) findViewById(R.id.abang1);
        frame2=(FrameLayout) findViewById(R.id.abang2);
        but_penyakit=(Button)findViewById(R.id.buttonPenyakit);
        but_tips=(Button)findViewById(R.id.buttonTips);
        hasile=(TextView) findViewById(R.id.hasilakhir);
        saran=(TextView) findViewById(R.id.keterangan);
        Bundle oleh=getIntent().getExtras();
        id=oleh.getInt(Pria.statusnya);

        if(id==1){
            frame1.setBackgroundResource(R.color.birumuda);
            frame2.setBackgroundResource(R.color.birumuda);
            hasile.setText(R.string.satu);
            saran.setText("Badan kamu kurus, Disarankan kamu untuk banyak makan makanan bergizi dan olahraga ,\nSilahkan lihat Tips dan Penyakit Lebih detail dibawah ini. ");

        }else if(id==2){
            frame1.setBackgroundResource(R.color.hijau);
            frame2.setBackgroundResource(R.color.hijau);
            hasile.setText(R.string.dua);
            saran.setText("Badan kamu ideal, tetapi tetap jaga pola makan dan olahraga secukupnya,\nSilahkan lihat Tips dan Penyakit Lebih detail dibawah ini.");
        }else if(id==3){
            frame1.setBackgroundResource(R.color.Kuning);
            frame2.setBackgroundResource(R.color.Kuning);
            hasile.setText(R.string.tiga);
            saran.setText("Berat badan kamu masih tergolong normal-ideal mendekati obesitas, kamu perlu memperbaiki pola makan dan perbanyak olahraga,\nSilahkan lihat Tips dan Penyakit Lebih detail dibawah ini.");
        }else if(id==4){
            frame1.setBackgroundResource(R.color.MerahOrange);
            frame2.setBackgroundResource(R.color.MerahOrange);
            hasile.setText(R.string.empat);
            saran.setText("Berat badan anda diambang batas obesitas, kondisi bahaya, segera ubah kebiasaan makan kembali ke gaya hidup sehat,\nSilahkan lihat Tips dan Penyakit Lebih detail dibawah ini.");
        }else if(id==5){
            frame1.setBackgroundResource(R.color.merah);
            frame2.setBackgroundResource(R.color.merah);
            hasile.setText(R.string.lime);
            saran.setText("Berat badan anda Melebihi Obesitas , Kondisi sangat berbahaya karna akan menimbulkan banyak penyakit,\nSilahkan lihat Tips dan Penyakit Lebih detail dibawah ini.");
        }else{
            frame1.setBackgroundResource(R.color.putih);
            frame2.setBackgroundResource(R.color.putih);
            hasile.setText("error");
        }
        but_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hasil.this, Tips.class);
                startActivity(intent);
            }
        });
        but_penyakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hasil.this, Penyakit.class);
                startActivity(intent);
            }
        });
    }
}
