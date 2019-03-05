package com.hp.hp.studentdatabasedesigns.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.hp.hp.studentdatabasedesigns.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudViewResult extends Fragment {


    public StudViewResult() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_stud_view_result, container, false);



        // Spinner element
        final Spinner spinner = (Spinner)view.findViewById(R.id.spinner);

        // Spinner click listener
       // spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) getContext());

        // Spinner Drop down elements
        List<String> semList = new ArrayList<String>();
        semList.add("S1");
        semList.add("S2");
        semList.add("S3");
        semList.add("S4");
        semList.add("S5");
        semList.add("S6");
        semList.add("S7");
        semList.add("S8");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, semList);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
// On selecting a spinner item
        String item = adapterView.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
});
    return view;
    }


}
