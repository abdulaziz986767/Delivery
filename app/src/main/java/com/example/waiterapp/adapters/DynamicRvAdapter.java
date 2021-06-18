package com.example.waiterapp.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.waiterapp.R;
import com.example.waiterapp.models.DynamicModel;

import java.util.ArrayList;
import java.util.List;

public class DynamicRvAdapter extends RecyclerView.Adapter<DynamicRvAdapter.DynamicViewHolder> {

    @NonNull
    @Override
    public DynamicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dynamic_rv_item, parent, false);
        return new DynamicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DynamicViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    static class DynamicViewHolder extends RecyclerView.ViewHolder{

        private final ImageView iconIv;
        private final TextView nameTv;
        private final TextView priceTv;
        private final EditText numberEt;

        private DynamicModel model;

        public DynamicViewHolder(@NonNull View itemView) {
            super(itemView);

            iconIv = itemView.findViewById(R.id.dynamicIv);
            ImageButton addBtn = itemView.findViewById(R.id.btnAdd);
            ImageButton minusBtn = itemView.findViewById(R.id.btnDeduction);
            nameTv = itemView.findViewById(R.id.dynamicNameTv);
            priceTv = itemView.findViewById(R.id.dynamicPriceTv);
            numberEt = itemView.findViewById(R.id.numberEt);

        }

    }
}
