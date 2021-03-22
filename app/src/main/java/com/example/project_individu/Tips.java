package com.example.project_individu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Tips extends AppCompatActivity {

    RecyclerView recyclerview;
    List<Pojo> pojodata;
    Pojo pojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        recyclerview = findViewById(R.id.recyclerviiew);
        pojodata = new ArrayList<>();


        pojo = new Pojo("1. Pilih makanan sehat yang kaya akan nutrisi",R.drawable.makan,"Untuk menambah berat badan, Anda tidak diwajibkan untuk mengonsumsi makanan tinggi kalori, makanan cepat saji, makanan berlemak, dan makanan atau minuman dengan kadar gula tinggi. Agar bisa menambah berat badan dengan lebih sehat, Anda tetap perlu mengonsumsi makanan bergizi seimbang, misalnya buah dan sayuran, kacang-kacangan, daging tanpa kulit atau lemak, tahu, tempe, telur, dan ikan. Jika perlu, Anda juga bisa mengonsumsi suplemen nutrisi tambahan sesuai anjuran dokter untuk mencukupi kebutuhan nutrisi dan menambah berat badan." );
        pojodata.add(pojo);

        pojo = new Pojo("2. Makan lebih sering dengan porsi kecil",R.drawable.porsi,"Seseorang yang kekurangan berat badan sering merasa cepat kenyang. Daripada makan 2–3 kali sehari dalam porsi besar, lebih baik makan dalam porsi lebih kecil tetapi sering.");
        pojodata.add(pojo);

        pojo = new Pojo("3. Konsumsi minuman padat kalori dan nutrisi",R.drawable.makanan,"Tak hanya dari makanan, asupan nutrisi juga dapat diperoleh dari minuman padat kalori, seperti smoothies, susu, yoghurt, dan jus segar di sela waktu makan. Selain memenuhi kebutuhan cairan tubuh, Anda pun dapat terhindar dari dehidrasi.");
        pojodata.add(pojo);

        pojo= new Pojo("4. Pilih Cemilan sehat",R.drawable.cemilan,"Camilan bisa menjadi sumber kalori tambahan yang dapat membantu Anda menambah berat badan. Namun, Anda disarankan untuk memilih camilan sehat yang kaya nutrisi, seperti yoghurt, cokelat hitam, buah-buahan, atau roti gandum.Hindari konsumsi camilan tidak sehat, seperti gorengan, karena makanan tersebut mengandung minyak dan kolesterol tinggi. Jika dikonsumsi berlebihan, makanan tidak sehat ini bisa meningkatkan risiko terjadinya penyakit, seperti penyakit jantung, diabetes, hingga kanker.");
                pojodata.add(pojo);

        pojo= new Pojo("5. Tambah asupan kalori",R.drawable.kalori,"Untuk menambah berat badan, Anda perlu tambahan asupan kalori dalam menu makan sehari-hari. Pilihlah sumber kalori tambahan yang sehat, misalnya dengan taburan keju parut pada roti, mentega pada tumisan, atau krim dan susu pada sup.Meski demikian, Anda perlu berhati-hati dalam memilih makanan penambah kalori agar tidak mengakibatkan kelebihan gula darah, garam, dan kolesterol, yang dapat mengganggu kesehatan tubuh." );
                pojodata.add(pojo);

        pojo= new Pojo("6.Rutin berolahraga",R.drawable.olahraga,"Olahraga secara rutin tidak hanya dilakukan untuk menurunkan berat badan, tetapi juga menambah berat badan. Dengan rutin berolahraga, tubuh akan membentuk lebih banyak jaringan otot dan memangkas kelebihan lemak.Jika diikuti dengan pola makan sehat, rutin berolahraga bisa membantu Anda mencapai berat badan yang lebih ideal. Selain itu, olahraga juga bisa menambah nafsu makan, sehingga asupan nutrisi dan kalori bisa meningkat.");
                pojodata.add(pojo);

         pojo= new Pojo("7. Makan banyak protein",R.drawable.protein,"Nutrisi tunggal yang paling penting untuk mendapatkan berat badan yang sehat adalah protein. Otot terbentuk dari kontribusi protein dan tanpa nutrisi ini sebagian besar kalori mungkin berakhir sebagai lemak tubuh. Studi menunjukkan bahwa selama periode makan berlebih, diet tinggi protein menyebabkan banyak kalori ekstra diubah menjadi otot. Namun, perlu diingat bahwa protein adalah pedang bermata dua. Protein juga sangat mengenyangkan, yang dapat mengurangi rasa lapar dan nafsu makan secara signifikan, sehingga menjadikan tubuh lebih sulit mendapatkan kalori.Jika Anda mencoba menambah berat badan, targetkan dapat mengasup 1,5–2,2 gram protein per kilogram berat badan. Anda bahkan dapat melakukannya jika asupan kalori Anda sangat tinggi. Sementara itu, makanan yang mengandung protein tinggi di antaranya yakni daging, ikan, telur, susu, produk susu, dan kacang-kacangan");

    pojodata.add(pojo);

         pojo = new Pojo("8. Perhatikan waktu minum",R.drawable.airminum,"Minum banyak air sebelum makan dapat membuat Anda merasa kenyang, sehingga lebih sulit untuk mendapatkan asupan kalori yang cukup. Jadi, jangan minum air sebelum makan. Akan lebih baik, jika Anda minum minuman tinggi kalori bersamaan dengan makan atau sebelum makan sebagai cara untuk menambah berat badan secara alami.");
          pojodata.add(pojo);

          pojo = new Pojo("9. Jangan Merokok",R.drawable.rokok,"Perokok cenderung memiliki berat badan lebih sedikit daripada yang bukan perokok. Hal ini dikarenakan, merokok pada dasarnya bisa memengaruhi kesehatan tubuh secara keseluruhan. Jadi, Anda lebih baik tidak merokok jika ingin menambah berat badan." );
            pojodata.add(pojo);

         pojo = new Pojo("10. Cobalah smoothies",R.drawable.smoot,"Melansir Mayo Clinic, jangan minum soda, kopi, teh atau minuman lain dengan sedikit kalori dan sedikit gizi jika Anda sedang mengupayakan penambahan berat badan. Sebagai gantinya, minumlah smoothie atau milk shake yang dibuat dengan susu dan buah segar atau beku, dan taburkan sedikit biji rami. Dalam beberapa kasus, penggantian makanan cair mungkin disarankan untuk menambah berat badan.");
         pojodata.add(pojo);

         pojo = new Pojo("11. Lakukan HIT",R.drawable.hit,"Pelatihan interval intensitas tinggi (HIIT) adalah dasar sebagian kelas olahraga .Jenis latihan ini meminta kamu untuk memberikan energi penuh dalam waktu singkat dengan selingan istirahat yang aktif untuk memungkinkan pemulihan. Kamu cukup berjalan, kemudian setiap tiga menit kamu bisa berlari sebentar, lalu berjalan lagi selama tiga menit lagi untuk mengatur napas, kemudian lari sebentar lagi. Tidak hanya efektif untuk membakar lemak dan kalori, HIIT juga membuat metabolisme pulih selama berjam-jam setelah selesai. \"Untuk mendapatkan sepenuhnya manfaat dari pelatihan ini, siklus ini harus berlangsung berulang kali selama 20-50 menit.\" \"Tubuh tidak hanya akan membakar kalori selama latihan, tapi juga akan membakar lemak setelah berolahraga karena konsumsi oksigen setelah berolahraga." );
         pojodata.add(pojo);

         pojo = new Pojo("12. Latihan Kardio",R.drawable.kardio,"Latihan interval bagus, namun jangan melupakan kardio. Latihan ini membantu membangun daya tahan dan dapat membuat tubuh istirahat, entah berjalan di atas treadmill atau bersepeda selama satu jam. \"Bentuk olahraga ini menjaga detak jantung moderat dan akan membakar beberapa ekstra kalori,\" katanya. \"Ini memungkinkan kamu untuk latihan keras pada hari berikutnya di gym, plus tidak akan membuat kesulitan tidur karena latihan tersebut.");
        pojodata.add(pojo);

        pojo = new Pojo("13. Lewatkan Makanan Penutup yang Tinggi Gula",R.drawable.gula,"udah berhasil mengurangi jumlah kalori dalam makanan utama, langkah selanjutnya adalah menahan diri dari godaan makanan penutup yang manis.Mengurangi asupan gula adalah langkah besar dalam usaha mencapai berat badan ideal. Asupan gula ini bisa berasal dari minuman kaleng (soda), minuman kekinian (boba atau kopi susu), ataupun camilan manis dan cokelat.");
        pojodata.add(pojo);

        pojo = new Pojo("14. Tidur Cukup",R.drawable.tidur,"Kurang tidur ternyata bisa menggagalkan diet Anda, lo! Saat tubuh kekurangan tidur maka produksi hormon ghrelin akan meningkat. Ini adalah hormon lapar sehingga akan  merangsang peningkatan nafsu makan. Karena itu, jangan heran saat Anda susah tidur, pasti bawaannya lapar dan ingin makan terus.");
        pojodata.add(pojo);

        pojo = new Pojo("15.Konsumsi Teh Hijau",R.drawable.teh,"Terdapat penelitian yang menunjukkan bahwa kandungan flavonoid yang disebut katekin dalam teh hijau dapat mempercepat metabolisme. Selain itu, antioksidan ini juga dapat membantu mencegah kelebihan lemak. Konsumsi teh hijau secara rutin baik untuk tubuh, tapi sayangnya efeknya tidak begitu berpengaruh bagi mereka yang sudah kelebihan berat badan atau obesitas. Bagi mereka yang alami obesitas, tentu konsumsi teh hijau harus dibarengi usaha lain yang lebih signifikan.");
        pojodata.add(pojo);




        GridLayoutManager layoutManager =  new GridLayoutManager(Tips.this,1);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setHasFixedSize(true);

        RecyclerView.Adapter adapter = new TipsAdapter(Tips.this,pojodata);
        recyclerview.setAdapter(adapter);
    }
}

