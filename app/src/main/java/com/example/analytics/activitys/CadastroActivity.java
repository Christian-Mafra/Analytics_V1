package com.example.analytics.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.analytics.R;
import com.example.analytics.configFirebase.ConfiguracaoFirebase;
import com.example.analytics.model.CadastroModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.FirebaseUser;

public class CadastroActivity extends AppCompatActivity {
    private Button btnJatenhoConta, btnCadastrar;
    private EditText txtNome, txtEmail, txtSenha, txtConfirmeSenha;
    String[] mensagens = {"Informe todos os campos","Confirme sua senha"};
    private FirebaseAuth autenticacao;
    private CadastroModel novoCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        if(Build.VERSION.SDK_INT>=19 && Build.VERSION.SDK_INT<2){
            setWindowsFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true);
        }
        if(Build.VERSION.SDK_INT>=19){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        if(Build.VERSION.SDK_INT<2){
            setWindowsFlag(this,WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.transparente));
        getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(),R.color.cor_tema_escuro));

        inicializacao();

        btnJatenhoConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(getApplicationContext(), FragmentsActivity.class);
                intent.putExtra("fragments",3);
                startActivity(intent);
            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = txtNome.getText().toString();
                String email = txtEmail.getText().toString();
                String senha = txtSenha.getText().toString();
                String confirmeSenha = txtConfirmeSenha.getText().toString();

                if(!nome.isEmpty()){
                    if(!email.isEmpty()){
                        if(!senha.isEmpty()){
                            if(!confirmeSenha.isEmpty()){
                                if(senha.equals(confirmeSenha)){
                                    novoCadastro = new CadastroModel(nome,email,senha);
                                    cadastrarUsuario();
                                }else{
                                    Toast.makeText(getApplicationContext(), "Senhas incompatíveis", Toast.LENGTH_SHORT).show();
                                }
                            }else{
                                Toast.makeText(getApplicationContext(), "Confirme sua senha", Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(getApplicationContext(), "Informe uma senha", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(getApplicationContext(), "Informe seu email", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Informe seu nome", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void inicializacao(){
        btnJatenhoConta = findViewById(R.id.btnJatenhoConta);
        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        txtConfirmeSenha = findViewById(R.id.txtConfirmeSenha);
    }

    public void cadastrarUsuario(){
        autenticacao = ConfiguracaoFirebase.getFirebaseAutentificacao();
        autenticacao.createUserWithEmailAndPassword(novoCadastro.getEmail(),novoCadastro.getSenha())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(), "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
                }else{
                    String excecao = "";
                    try{
                        throw task.getException();
                    }catch (FirebaseAuthWeakPasswordException e){
                        excecao = "Digite uma senha mais forte";
                    }catch (FirebaseAuthInvalidCredentialsException e){
                        excecao = "Digite um email válido";
                    }catch (FirebaseAuthUserCollisionException e){
                        excecao = "Esta conta já foi cadastrada";
                    } catch (Exception e) {
                        e.getMessage();
                        e.printStackTrace();
                    }
                    Toast.makeText(getApplicationContext(), excecao, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private static void setWindowsFlag(Activity activity, final int Bits, Boolean on) {
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParms = win.getAttributes();
        if(on){
            winParms.flags |= Bits;
        }else{
            winParms.flags &= ~Bits;
        }
        win.setAttributes(winParms);
    }
}