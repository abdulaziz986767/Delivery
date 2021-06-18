package com.example.waiterapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.waiterapp.R;
import com.example.waiterapp.adapters.CategoryAdapter;
import com.example.waiterapp.adapters.DynamicRvAdapter;
import com.example.waiterapp.adapters.StaticRvAdapter;

public class DashboardFragment extends Fragment{

    private RecyclerView rvHorizontal;
    private RecyclerView rvVertical;
    private RecyclerView rv3;

    private DynamicRvAdapter dynamicAdapter;
    private StaticRvAdapter staticAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        rvHorizontal = view.findViewById(R.id.recycler1);
        rvVertical = view.findViewById(R.id.recycler2);
        rv3 = view.findViewById(R.id.recycler3);

        dynamicAdapter = new DynamicRvAdapter();

        staticAdapter = new StaticRvAdapter();

        initRecyclerView();


        return view;
    }

    private void initRecyclerView() {
        LinearLayoutManager horizontalLayout = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager verticalLayout = new LinearLayoutManager(getContext());

        rvHorizontal.setLayoutManager(horizontalLayout);
        rvHorizontal.setAdapter(staticAdapter);

        rvVertical.setLayoutManager(verticalLayout);
        rvVertical.setAdapter(dynamicAdapter);

        rv3.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        rv3.setAdapter(new CategoryAdapter());
    }
}