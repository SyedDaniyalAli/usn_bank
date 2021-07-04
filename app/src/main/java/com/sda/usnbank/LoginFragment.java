package com.sda.usnbank;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    EditText et_email;
    TextInputLayout et_password;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        et_email = container.findViewById(R.id.et_email);
        et_password = container.findViewById(R.id.et_password);

        et_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_email.getText().equals("admin") && et_password.equals("123"))
                {

                }
            }
        });

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

}
