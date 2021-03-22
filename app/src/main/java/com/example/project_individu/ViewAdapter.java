package com.example.project_individu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class ViewAdapter extends PagerAdapter {

    String nama[];
    int itemImage;
    String keterangan[];
    Penyakit context;
    LayoutInflater inflater;


    public ViewAdapter(Penyakit penyakit, String[] nama, int itemiImage, String[] keterangan) {
        this.context = penyakit;
        this.nama = nama;
        this.itemImage = itemiImage;
        this.keterangan = keterangan;
    }


    @Override
    public int getCount() {
        return nama.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.itemdata, container, false);
        TextView name = view.findViewById(R.id.detail_Nama);
        ImageView itemImg = view.findViewById(R.id.imageV);
        TextView ket = view.findViewById(R.id.detail_keterangan);

        name.setText(nama[position]);
        itemImg.setImageResource(itemImage);
        ket.setText(keterangan[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

    public interface OnDaftarCLickListener {
        void onClick(View view, int position);
    }

}
