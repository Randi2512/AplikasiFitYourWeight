package com.example.project_individu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Penyakit extends AppCompatActivity {
    RecyclerView recyclerview;
    List<StoredData> data;
    StoredData storedData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit);
        recyclerview = findViewById(R.id.recyclerviiew);
        data = new ArrayList<>();


        storedData = new StoredData("Diabetes Tipe 2",R.drawable.diabetes,"Berbagai studi menunjukkan, semakin tinggi berat badan seseorang maka akan berisiko juga terserang diabetes. Jika penyakit ini tidak bisa terkontrol dengan baik, dampaknya akan timbul penyakit komplikasi yang serius, seperti hipertensi, serangan jantung, stroke, kebutaan, gagal ginjal, hingga amputasi organ tubuh." );
        data.add(storedData);

        storedData = new StoredData("Serangan Jantung",R.drawable.serangan,"Berat badan yang berlebih sering dikaitkan dengan sejumlah faktor yang meningkat ke risiko penyakit kardiovaskular (serangan jantung). Abdominal obesity atau lemak perut juga diakitkan sebagai salah satu faktor risiko utama yang menyebabkannya.");
        data.add(storedData);

        storedData = new StoredData("Hipertensi",R.drawable.hipertensi,"Hipertensi adalah nama lain dari tekanan darah tinggi. Kondisi ini dapat menyebabkan komplikasi kesehatan yang parah dan meningkatkan risiko penyakit jantung, stroke, dan terkadang kematian.Tekanan darah adalah kekuatan yang diberikan oleh sirkulasi darah terhadap dinding arteri tubuh, yaitu pembuluh darah utama dalam tubuh. Tekanan ini tergantung pada resistensi pembuluh darah dan seberapa keras jantung bekerja. Semakin banyak darah yang dipompa jantung dan semakin sempit arteri, maka semakin tinggi tekanan darah.Hipertensi dapat diketahui dengan cara rajin memeriksakan tekanan darah. Untuk orang dewasa minimal memeriksakan darah setiap lima tahun sekali.Hasil tekanan darah ditulis dalam dua angka. Angka pertama (sistolik) mewakili tekanan dalam pembuluh darah ketika jantung berkontraksi atau berdetak. Angka kedua (diastolik) mewakili tekanan di dalam pembuluh darah ketika jantung beristirahat di antara detak jantung.Seseorang bisa dikatakan mengalami hipertensi bila ketika diukur pada dua hari yang berbeda, pembacaan tekanan darah sistolik pada kedua hari adalah lebih besar dari 140 mmHg dan / atau pembacaan tekanan darah diastolik pada kedua hari adalah lebih besar dari 90 mmHg.");
        data.add(storedData);

        storedData= new StoredData("GERD (Gastroesophageal Reflux Disease)",R.drawable.gerd,"Sebuah riset menunjukkan, obesitas dapat meningkatkan kadar asam refluks dalam tubuh. Hal ini terjadi karena lemak di perut yang memberikan tekanan tertentu pada cincin otot di bagian bawah esofagus atau kerongkongan. Kondisi seperti ini juga bisa menyebabkan heartburn.");
        data.add(storedData);

        storedData= new StoredData("Osteoarthritis",R.drawable.ostea,"Obesitas atau kelebihan berat badan ini tentu memberikan tekanan yang ekstra pada sendi di tubuh, seperti lutut. Akibatnya, osteoarthritis atau kondisi yang menyebabkan sendi terasa sakit, kaku, dan bengkak terjadi. Selain itu, keadaan ini juga dapat menyebabkan kerusakan pada sendi.");
                data.add(storedData);

        storedData= new StoredData("Kanker",R.drawable.kanker,"Salah satu penyakit mematikan ini juga bisa terjadi karena obesitas. Kondisi berat badan yang berlebih dapat menjadi faktor penting dalam pembentukan sel-sel kanker dan risiko yang akan berjalan seumur hidup. Penderita obesitas berpeluang tinggi untuk terserang kanker usus, payudara, dan kerongkongan.");
        data.add(storedData);

        storedData=new StoredData("Kolestrol Tinggi",R.drawable.kolestrol,"Kolesterol tinggi dapat terjadi karena penderita obesitas meningkatkan kadar trigliserida dan kolesterol jahat (LDL) dalam tubuh. Sementara kadar lemak baik (HDL) akan lebih rendah dari orang normal.Tingginya kadar LDL dan rendahnya HDL dalam tubuh, menjadi penyebab utama atherosclerosis yang dapat mengakibatkan penyempitan pembuluh darah. Akhirnya akan berujung pada serangan jantung.");
        data.add(storedData);

        storedData= new StoredData("Komplikasi Kehamilan",R.drawable.hamil,"Perempuan yang hamil dengan kelebihan berat badan lebih dapat mengalami resistansi insulin, gula darah tinggi, dan tekanan darah tinggi. Kondisi ini dapat meningkatkan komplikasi selama kehamilan seperti diabetes gestational, preeklampsia, operasi sesar gumpalan darah besar, bayi lahir prematur, keguguran, dan bahkan bayi lahir mati");
        data.add(storedData);

        storedData = new StoredData("Stroke",R.drawable.stroke,"Stroke merupakan keadaan darurat medis.Gejala stroke yaitu sulit berjalan, berbicara, dan memahami, serta kelumpuhan atau mati rasa pada wajah, lengan, atau tungkai. Penanganan dini dengan obat-obatan seperti tPA (penghancur gumpalan darah) dapat meminimalkan kerusakan otak. Pengobatan lain berfokus dalam membatasi komplikasi dan mencegah stroke lainnya.");
        data.add(storedData);

        storedData = new StoredData("Penyakit liver",R.drawable.liver,"Orang dengan obesitas lebih berisiko terkena penyakit liver atau dikenal juga dengan penyakit hati berlemak. Penyakit ini terjadi ketika lemak menumpuk di jati dan menyebabkan tumbuhnya jaringan parut.");
        data.add(storedData);

        storedData= new StoredData("Gallbladder",R.drawable.gal,"Penyakit gallbladder atau batu empedu adalah penyakit yang menyerang kantong empedu, organ yang berfungsi untuk mencerna lemak. Orang dengan obesitas lebih berisiko terkena penyakit ini lantaran lemak kerap menumpuk dan kolesterol berkembang menjadi batu empedu. Melangsingkan tubuh dengan diet yang tinggi serat dapat mencegah penyakit batu empedu.");
                data.add(storedData);

        storedData =new StoredData("Depresi",R.drawable.depresi,"Penelitian menunjukkan korelasi kuat antara obesitas dengan gangguan depresi. Orang dengan obesitas kerap merasa kurang percaya diri sehingga berkontribusi besar terhadap stres dan depresi. Perlu diketahui, bukan berarti orang dengan obesitas akan mengalami penyakit-penyakit ini. Namun, orang yang kelebihan berat badan lebih berisiko mengalami satu atau lebih penyakit-penyakit tersebut dibandingkan orang yang lebih langsing. (chs)");
        data.add(storedData);

        GridLayoutManager layoutManager =  new GridLayoutManager(Penyakit.this,1);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setHasFixedSize(true);

        PenyakitAdapter adapter = new PenyakitAdapter(Penyakit.this,data);
        recyclerview.setAdapter(adapter);
    }
}