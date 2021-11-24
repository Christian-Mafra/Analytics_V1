package com.example.analytics.fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.analytics.R;
import com.example.analytics.activitys.FragmentsActivity;
import com.example.analytics.model.CadastroModel;


public class CadastroFragment extends Fragment {
    private Button button4, btnCadastrar;
    private EditText txtNome, txtEmail, txtSenha, txtConfirmeSenha;
    private String nome, sobreNome, email, senha, confirmeSenha;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cadastro, container, false);

        button4 = view.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
                Intent intent = new Intent(getContext(), FragmentsActivity.class);
                intent.putExtra("fragments",3);
                startActivity(intent);
            }
        });

        txtNome = view.findViewById(R.id.txtNome);
        txtEmail = view.findViewById(R.id.txtEmail);
        txtSenha = view.findViewById(R.id.txtSenha);
        txtConfirmeSenha = view.findViewById(R.id.txtConfirmeSenha);
        
        nome = txtNome.getText().toString();
        email = txtEmail.getText().toString();
        senha = txtSenha.getText().toString();
        confirmeSenha = txtConfirmeSenha.getText().toString();
        
        btnCadastrar = view. findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!nome.isEmpty()){
                    if(!email.isEmpty()){
                        if(!senha.isEmpty()){
                            if(!confirmeSenha.isEmpty()){
                                CadastroModel novoCadastro = new CadastroModel(email, senha);

                            }else{
                                Toast.makeText(getContext(), "Confirme sua senha", Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(getContext(), "Informe uma senha", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(getContext(), "Informe um email", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getContext(), "Informe seu nome", Toast.LENGTH_SHORT).show();
                }
            }
        });


        return view;
    }
}