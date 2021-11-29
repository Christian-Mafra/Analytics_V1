package com.example.analytics.configFirebase;


import com.google.firebase.auth.FirebaseAuth;

public class ConfiguracaoFirebase {
    private static FirebaseAuth auth;

    public static FirebaseAuth getFirebaseAutentificacao(){
       if(auth==null){
           auth = FirebaseAuth.getInstance();
       }
       return auth;
    }
}
