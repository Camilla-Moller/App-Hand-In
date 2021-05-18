package com.example.apphandin.ui.garbage;

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
        EditText messageEditText = getView().findViewById(R.id.message_editText);
        TextView messageTextView = getView().findViewById(R.id.message_textView);
        Button button = getView().findViewById(R.id.button);
        garbageViewModel.getMessage().observe(this, message -> {
            if (message != null)
                messageTextView.setText(message.getBody());
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                garbageViewModel.saveMessage(messageEditText.getText().toString());

            }
        });
    }


}
