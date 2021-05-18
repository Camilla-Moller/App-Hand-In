package com.example.apphandin.ui.wasteBin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.apphandin.R;

public class WasteBinFragment extends Fragment {

    private WasteBinViewModel wasteBinViewModel;
    private EditText editText;
    private ListView listView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_wastebin,container,false);
    }

    @Override
    public void onStart() {
        super.onStart();
       wasteBinViewModel = new ViewModelProvider(this).get(WasteBinViewModel.class);
       wasteBinViewModel.getSearchedWasteBin().observe(this, wasteBin -> Toast.makeText(getContext(), wasteBin.getAddress(), Toast.LENGTH_SHORT).show());
        Button button = getView().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wasteBinViewModel.searchForWasteBin("address");
            }
        });

    }

}
