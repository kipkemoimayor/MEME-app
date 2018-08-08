package com.example.collok.meme;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Top extends Fragment
{
    private  EditText topTextInput;
    private  EditText bottomTextInput;
    TopListener activitycollo;
    public interface TopListener{
        public void createMeme(String top,String bottom);


    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activitycollo=(TopListener) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.top_fragment,container,false);
        topTextInput=(EditText)view.findViewById(R.id.topTextInput);
        bottomTextInput=(EditText)view.findViewById(R.id.bottomTextInput);
        final Button okButton=(Button)view.findViewById(R.id.okButton);
        okButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        activitycollo.createMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
                        topTextInput.setText("");
                    }
                }
        );
                return  view;

    }
    public void buttonClicked(View view){
        activitycollo.createMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());

    }
}
