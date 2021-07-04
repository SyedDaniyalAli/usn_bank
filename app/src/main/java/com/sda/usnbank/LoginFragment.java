package com.sda.usnbank;


import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    EditText et_email;
    TextInputLayout et_password;

    Button btn_login;
    TextView forgetPass;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewInflater=inflater.inflate(R.layout.fragment_login, container, false);


        et_email = viewInflater.findViewById(R.id.et_email);
        et_password = viewInflater.findViewById(R.id.et_password);
        btn_login = viewInflater.findViewById(R.id.btn_login);
        forgetPass = viewInflater.findViewById(R.id.forgetPass);

        btn_login.setOnClickListener(v -> {
            if(et_email.getText().toString().equals("admin") && et_password.getEditText().getText().toString().equals("123"))
            {
                startActivity(new Intent(getContext(), BankAppActivity.class));
            }else {
                Toast.makeText(getContext(), "admin 123", Toast.LENGTH_SHORT).show();
            }
        });

        forgetPass.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), ForgetPass.class));
        });

        // Inflate the layout for this fragment
        return viewInflater;
    }

}
