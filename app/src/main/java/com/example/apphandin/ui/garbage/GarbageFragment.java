package com.example.apphandin.ui.garbage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.apphandin.R;

public class GarbageFragment extends Fragment {

    private GarbageViewModel garbageViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_garbage, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        garbageViewModel = new ViewModelProvider(this).get(GarbageViewModel.class);
        EditText nameEditText = getView().findViewById(R.id.name_editText);
        EditText addressEditText = getView().findViewById(R.id.address_editText);
        EditText cityEditText = getView().findViewById(R.id.city_editText);
        EditText itemDescriptionEditText = getView().findViewById(R.id.itemDescription_editText);

        Button button = getView().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                garbageViewModel.saveOrder(nameEditText.getText().toString(), addressEditText.getText().toString(), cityEditText.getText().toString(), itemDescriptionEditText.getText().toString());
                Toast.makeText(getContext(),"Garbage Collector ordered", Toast.LENGTH_LONG).show();
            }
        });
    }


}
