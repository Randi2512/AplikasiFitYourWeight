package com.example.project_individu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;


public class PenyakitAdapter extends RecyclerView.Adapter<PenyakitAdapter.CardViewHolder>{
    private List<StoredData> data;
    public PenyakitAdapter (Context context, List<StoredData> data) {
        this.data =data;

    }

    @NonNull
    @Override
    public PenyakitAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdata,parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {

        holder.name.setText(data.get(position).getItemNama());
        holder.itemImg.setImageResource(data.get(position).getItemImage());
        holder.ket.setText(data.get(position).getItemKet());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView itemImg;
        TextView ket;
        CardView cardView;
        public  CardViewHolder(View itemView){
            super(itemView);
            name = itemView.findViewById(R.id.detail_Nama);
            itemImg = itemView.findViewById(R.id.imageV);
            ket = itemView.findViewById(R.id.detail_keterangan);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
