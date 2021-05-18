package com.example.apphandin.ui.tips;

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

public class TipsFragment extends Fragment {

    private TipsViewModel tipsViewModel;
    private EditText editText;
    private TextView textView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tips,container,false);
    }

    @Override
    public void onStart() {
        super.onStart();
        tipsViewModel = new ViewModelProvider(this).get(TipsViewModel.class);
        EditText editText = getView().findViewById(R.id.editText);
        TextView textView = getView().findViewById(R.id.textView);
        Button button = getView().findViewById(R.id.button);
        tipsViewModel.getAllTips().observe(this, tips -> {
            if (!tips.isEmpty()) {
                textView.setText("");
                for (Tip t : tips) {
                    textView.append(t.getTitle() + "\t");
                }
            } else {
                textView.setText("Empty");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipsViewModel.insert(new Tip(editText.getText().toString(), "description", 1));
            }
        });
}}