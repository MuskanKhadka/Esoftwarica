package com.muskan.esoftwarica.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.muskan.esoftwarica.R;
import com.muskan.esoftwarica.model.StudentSet;


import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentsClass>  {
    Context context;
    List<StudentSet> studentSetList;

    public StudentAdapter(Context context, List<StudentSet> studentSetList) {
        this.context = context;
        this.studentSetList = studentSetList;
    }

    @NonNull
    @Override
    public StudentAdapter.StudentsClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new StudentsClass(view);
         }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.StudentsClass holder, final int position) {
StudentSet studentSet= studentSetList.get(position);
if(studentSet.getGender().equalsIgnoreCase("male")){
    holder.imageView.setImageResource(R.drawable.male);

}else{holder.imageView.setImageResource(R.drawable.female);

}
holder.etName.setText(studentSet.getStudentName());
holder.etGender.setText(studentSet.getGender());
holder.etAddress.setText(studentSet.getAddress());
holder.etAge.setText(studentSet.getAge());
holder.btndelete.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        studentSetList.remove(position);
        notifyDataSetChanged();
    }
});
    }

    @Override
    public int getItemCount() {
        return studentSetList.size();
    }



    public class StudentsClass extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView etName,etAddress,etGender,etAge;
        Button btndelete;
        public StudentsClass(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            etName = itemView.findViewById(R.id.etName);
            etAddress = itemView.findViewById(R.id.etAddress);
            etGender = itemView.findViewById(R.id.etgender);
            etAge = itemView.findViewById(R.id.etAge);
            btndelete = itemView.findViewById(R.id.btndelete);

        }
    }
}
