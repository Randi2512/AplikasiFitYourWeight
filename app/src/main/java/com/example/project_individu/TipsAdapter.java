package com.example.project_individu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TipsAdapter extends RecyclerView.Adapter<TipsAdapter.CardViewHolder> {

    private List<Pojo> pojodata;
    public TipsAdapter (Context context, List<Pojo> pojodata) {
        this.pojodata =pojodata;

    }

    @NonNull
    @Override
    public TipsAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new TipsAdapter.CardViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull TipsAdapter.CardViewHolder holder, int position) {

        holder.name.setText(pojodata.get(position).getItemNama());
        holder.itemImg.setImageResource(pojodata.get(position).getItemImage());
        holder.ket.setText(pojodata.get(position).getItemKet());
    }

    @Override
    public int getItemCount() {
        return pojodata.size();
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

