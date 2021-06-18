package com.example.waiterapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.waiterapp.R;
import com.example.waiterapp.models.StaticModel;

import java.util.List;

public class StaticRvAdapter extends RecyclerView.Adapter<StaticRvAdapter.StaticRvHolder>{

    @NonNull
    @Override
    public StaticRvHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.static_rv_item, parent, false);
        return new StaticRvHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StaticRvHolder holder, int position) {

    }



    @Override
    public int getItemCount() {
        return 10;
    }

    static class StaticRvHolder extends RecyclerView.ViewHolder{

        private final CardView view;
        private final ImageView imageIv;
        private final TextView nameTv;
        private final Context context;
        private boolean b = true;

        public StaticRvHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();

            view = itemView.findViewById(R.id.static_view);
            imageIv = itemView.findViewById(R.id.staticIv);
            nameTv = itemView.findViewById(R.id.staticNameTv);

        }
    }
}
