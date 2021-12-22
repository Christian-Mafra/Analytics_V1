package com.example.analytics.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.analytics.R;
import com.example.analytics.adapter.AdapterCartazVertical;
import com.example.analytics.adapter.AdapterShortBook;
import com.example.analytics.model.CartazVerticalModel;
import com.example.analytics.model.ShortbookModel;

import java.util.ArrayList;
import java.util.List;

public class ShortBookActivity extends AppCompatActivity {
    private RecyclerView recyclerViewShortBook;
    private List<ShortbookModel> listashortbook = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_book);

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
        getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.gray));

        recyclerViewShortBook = findViewById(R.id.recyclerViewShortBook);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false);
        recyclerViewShortBook.setLayoutManager(layoutManager);
        recyclerViewShortBook.setHasFixedSize(true);
        //Config Adapter
        listashortbook.clear();
        preparaCartazVertical();
        AdapterShortBook adapterShortBook = new AdapterShortBook(listashortbook);
        recyclerViewShortBook.setAdapter(adapterShortBook);

    }


    public void preparaCartazVertical(){
        ShortbookModel g = new ShortbookModel(R.drawable.pp,"Potêncial de redução" +
                "","lewdjoewdjewjdlkewjfljwelfjewlkfjewfjiwoejdwejdfoipewjdwdwe´dfk");
        this.listashortbook.add(g);
        g = new ShortbookModel(R.drawable.sulfetosinsoluveisemmeioacidoroteiro, "Sulfetos Insolúveis em Meio Ácido","dqwedwedwqedw");
        this.listashortbook.add(g);
        g = new ShortbookModel(R.drawable.sulfetosinsoluveisemmeiobasicoroteiro,"Sulfetos Insolúveis em Meio Básico","wdfewfewrfew");
        this.listashortbook.add(g);
        g = new ShortbookModel(R.drawable.carbonatosinsoluveisroteiro,"Carbonatos Insolúveis","jkdshfvdjifhkds");
        this.listashortbook.add(g);
        g = new ShortbookModel(R.drawable.cationssoluveisroteiro,"Cátions Solúveis","kdsgcbjkdwsbfkdjk");
        this.listashortbook.add(g);
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