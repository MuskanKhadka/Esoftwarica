package com.muskan.esoftwarica.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.muskan.esoftwarica.Adapter.StudentAdapter;
import com.muskan.esoftwarica.R;
import com.muskan.esoftwarica.model.StudentSet;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView Review;

    List<StudentSet>studentSets=new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
       Review=root.findViewById(R.id.Review);
       StudentSet st=new StudentSet("Muskan", "22","Pokhara","Female");

       studentSets =st.getStudentSetsList();
       if(studentSets.isEmpty()){
           studentSets.add(st);
           studentSets.add(new StudentSet("Hari","20","Pokhara","Male"));
           st.setStudentSetsList(studentSets);
       }
        StudentAdapter student = new StudentAdapter(getActivity(),studentSets);
       Review.setAdapter(student);
       Review.setLayoutManager(new LinearLayoutManager(getActivity()));


        return root;
    }
}