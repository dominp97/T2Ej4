package com.pmdm.t2ej4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        String ac=intent.getAction();
        String textRecibidoURL;
        String textRecibidoCoorX;
        String textRecibidoCoorY;

        if(ac.equals(Intent.ACTION_VIEW)) {
            TextView edRecibidoURL=findViewById(R.id.textView);
            TextView edRecibidoTit=findViewById(R.id.textView2);
            TextView edRecibidoTex=findViewById(R.id.textView3);
            Uri datos = intent.getData();
            if(datos!=null){
                edRecibidoURL.setText(datos+"");
            }else{
                edRecibidoTit.setText(datos.toString());
                edRecibidoTex.setText(datos + "");
            }
        }
    }
}
