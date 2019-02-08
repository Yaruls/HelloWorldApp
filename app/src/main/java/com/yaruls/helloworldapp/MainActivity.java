package com.yaruls.helloworldapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnIsClicked(View view) {
//        int result = 5+6;
//        Log.i("OPERATIONS",result+"");

//        TextView text= findViewById(R.id.txtViewMsg);
//        Log.i("Tag",text.getText().toString());

        EditText name=findViewById(R.id.editTextName);
        Log.i("Name",name.getText().toString());
        TextView text= findViewById(R.id.txtViewMsg);
        ImageView img= findViewById(R.id.imgView);
        if(!name.getText().toString().matches(""))
            text.setText(name.getText());
        else
            Toast.makeText(MainActivity.this,"Please input some number",Toast.LENGTH_SHORT).show();
        img.setImageResource(R.drawable.rawpixel);
    }
}
