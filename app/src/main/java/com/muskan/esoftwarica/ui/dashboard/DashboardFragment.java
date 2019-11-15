package com.muskan.esoftwarica.ui.dashboard;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.muskan.esoftwarica.R;
import com.muskan.esoftwarica.model.StudentSet;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {
    private EditText etName;
    private EditText etAddress;
    private EditText etAge;
    private RadioGroup rgGender;
    private Button btAdd;
    String name = "",age="",address="",gender="";
    List<StudentSet> studentSetList = new ArrayList<>();


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
       etName = root.findViewById(R.id.etName);
       etAddress = root.findViewById(R.id.etAddress);
       etAge = root.findViewById(R.id.etAge);
       rgGender = root.findViewById(R.id.rgGender);
       btAdd = root.findViewById(R.id.btAdd);
       btAdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(TextUtils.isEmpty(etName.getText().toString())){
                   etName.setError("please enter name");
                   return;
               } else if(TextUtils.isEmpty(etAddress.getText().toString())){
                   etAddress.setError("please enter address");
                   return;
               }else if(TextUtils.isEmpty((etAge.getText().toString()))){
                   etAge.setError("please enter Age");
                   return;
               }else{
                   name = etName.getText().toString();
                   age = etAge.getText().toString();
                   address = etAddress.getText().toString();
               }
               int select =  rgGender.getCheckedRadioButtonId();
               if(select >0){
                   RadioButton radiob = getView().findViewById(select);
                   gender = radiob.getText().toString();
                   StudentSet stu = new StudentSet(name,address,age,gender);
                   studentSetList = stu.getStudentSetsList();
                   studentSetList.add(stu);
                   stu.setStudentSetsList(studentSetList);
                   etName.setText("");
                   etAddress.setText("");
                   etAge.setText("");
                   radiob.setChecked(false);
               }else{
                   Toast.makeText(getContext(), "Please select gender", Toast.LENGTH_SHORT).show();
               }
           }
       });
        return root;
    }
}