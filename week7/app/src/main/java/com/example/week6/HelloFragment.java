package com.example.week6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HelloFragment extends Fragment {
    private String message = "No initial state";
    private Listener listener;
    private View button;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listener = (Listener) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hello_fragment,container,false);
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        if(getArguments() != null)
        {
            message = getArguments().getString("message");
        }
        button = view.findViewById(R.id.hello_fragment_buuton);
        view.findViewById(R.id.hello_fragment_buuton).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Toast.makeText(v.getContext(),message, Toast.LENGTH_LONG).show();

                if(listener != null)
                {
                    listener.onButtonPressed();
                }
            }

        });
    }
    public void hideYourButton()
    {
        if(button != null)
        {
            button.setVisibility(View.INVISIBLE);
        }
    }
}