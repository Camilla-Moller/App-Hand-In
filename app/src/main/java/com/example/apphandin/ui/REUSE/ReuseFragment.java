package com.example.apphandin.ui.REUSE;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.apphandin.R;

public class ReuseFragment extends Fragment {

    private ReuseViewModel reuseViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_reuse, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        reuseViewModel = new ViewModelProvider(this).get(ReuseViewModel.class);
        EditText reuseEditText = getView().findViewById(R.id.reuse_editText);
        TextView reuseTextView = getView().findViewById(R.id.reuse_textView);
        Button button = getView().findViewById(R.id.button);
        reuseViewModel.getReuse().observe(this, reuse -> {
            if (reuse != null)
                reuseTextView.setText(reuse.getBody());
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reuseViewModel.saveReuse(reuseEditText.getText().toString());

            }
        });
    }
}
