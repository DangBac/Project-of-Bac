package com.example.activitityandintentex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.model.Product1;
import com.example.model.Product2;

public class ReceiveActivity extends AppCompatActivity {
    TextView txtContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        linkView();
        getData();
    }

    private void linkView() {
    txtContent =findViewById(R.id.txtContent);

    }

    private void getData() {
        Intent intent = getIntent();
        int numb = intent.getIntExtra("numb",9);
        double marks = intent.getDoubleExtra("marks",0.0);
        boolean checked = intent.getBooleanExtra("checked",false);
        String say = intent.getStringExtra("say");
        Product1 p = (Product1) intent.getSerializableExtra("product_infor");
        Product2 p2 = intent.getParcelableExtra("product_description");

//        Bundle bundle = intent.getBundleExtra("myBundel");
//        int numb = bundle.getInt("numb");
//        double marks = bundle.getDouble("marks");
//        boolean checked = bundle.getBoolean("checked");
//        String say  = bundle.getString("say");
//
//        Product2 p2 = bundle.getParcelable("infor");

        txtContent.append("numb: "+ numb + "\n");
        txtContent.append("marks: "+ marks + "\n");
        txtContent.append("checked: "+ checked+ "\n");
        txtContent.append("say: "+ say + "\n");
        txtContent.append("product: "+ p + "\n");
        txtContent.append("product: "+ p2.getProductCode() + ":" + p2.getProductName() +" - " + p2.getProductPrice());

    }
}