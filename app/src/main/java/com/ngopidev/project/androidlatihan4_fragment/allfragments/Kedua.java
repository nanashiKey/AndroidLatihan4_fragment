package com.ngopidev.project.androidlatihan4_fragment.allfragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ngopidev.project.androidlatihan4_fragment.R;


/**
 * created by Irfan Assidiq on 2019-05-19
 * email : assidiq.irfan@gmail.com
 **/
public class Kedua extends Fragment {
    public static Kedua newInstance(int id){
        Kedua fr = new Kedua();
        Bundle b = new Bundle();
        fr.setArguments(b);
        return fr;
    }

    EditText et_nama;
    Button button;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View views = inflater.inflate(R.layout.fr_dua,
                container, false);
        return views;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        et_nama = view.findViewById(R.id.editText);
        button = view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_nama.getText().toString().equals("")){
                    Toast.makeText(getActivity(),
                    "please input correct name",
                            Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getActivity(),
                            "Hello "+et_nama.getText().toString(),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
