package com.example.apphandin.ui.garbage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.apphandin.R;

public class GarbageFragment extends Fragment {

    private GarbageViewModel garbageViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        garbageViewModel =
                new ViewModelProvider(this).get(GarbageViewModel.class);
        View root = inflater.inflate(R.layout.fragment_garbage, container, false);
        final TextView textView = root.findViewById(R.id.text_garbage);
        garbageViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
