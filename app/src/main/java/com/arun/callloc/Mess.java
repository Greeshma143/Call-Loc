package com.arun.callloc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Mess extends AppCompatActivity {
    EditText e1,e2;
    Button button;
    String s,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess);
        e1=(EditText)findViewById(R.id.mob1);
        e2=(EditText)findViewById(R.id.mes);
        button=(Button)findViewById(R.id.sen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString().trim();
                b=e2.getText().toString().trim();
                Toast.makeText(getApplicationContext(),s+"\n "+b+" ",Toast.LENGTH_SHORT).show();


                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone="+s+"&text="+b));
                startActivity(intent);

            }
        });
    }
}
