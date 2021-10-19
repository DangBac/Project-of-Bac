package com.example.activitityandintentex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.model.Product1;
import com.example.model.Product2;

public class MainActivity extends AppCompatActivity {

    Button btnClick,btnDialog,btnSendData;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "onCreate");

        linkView();
        addEvent();
    }

    private void linkView() {
        btnClick = findViewById(R.id.btnClick);
        btnDialog= findViewById(R.id.btnDialog);
        btnSendData = findViewById(R.id.btnSendData);
    }

    private void addEvent() {
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Bắc là tui", Toast.LENGTH_SHORT).show();
            }
        });
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ReceiveActivity.class);
               // Attach Data - Cách 1
                intent.putExtra("number",0);
                intent.putExtra("marks",8.9);
                intent.putExtra("checked",true);
                intent.putExtra("say","Hello");

                Product1 p = new Product1(1,"Heiniken",19000);
                intent.putExtra("product_infor",p);

                Product2 p2 = new Product2();
                p2.setProductCode(2);
                p2.setProductName("Tiger");
                p2.setProductPrice(18000);
                intent.putExtra("product_description", p2);

                startActivity(intent);

                //Attach Data - Cách 2
//                Bundle bundle = new Bundle();
//                bundle.putInt("numb",8);
//                bundle.putDouble("marks", 8.8);
//                bundle.putBoolean("checked",true);
//                bundle.putString("say","Welcome");
//
//
//                Product2 product2 = new Product2();
//                product2.setProductCode(3);
//                product2.setProductName("HaNoi");
//                product2.setProductPrice(15000);
//                bundle.putParcelable("infor",product2);
//
//                intent.putExtra("myBundel", bundle);
//                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity", "onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy");
    }
}