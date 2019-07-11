package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;



public class AdminProfileActivity extends AppCompatActivity {

    Button udbtn;
    EditText udet;
    String st;
    String scoredata;
    ListView documentsSubmitted;
    ListView documentsNotSubmitted;
    ListView memberList;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_admin_profile);
        getScreenElements();
        documentsSubmitted();
        documentsNotSubmitted();
        addMembers();


    }

    private void documentsSubmitted() {


        ArrayList<String> documentSubmittedList = new ArrayList<>();
        for (int i=0;i<6;i++){
            documentSubmittedList.add("Document "+(i+1));
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,documentSubmittedList);
        documentsSubmitted.setAdapter(arrayAdapter);
    }

    private void documentsNotSubmitted() {


        ArrayList<String> documentNotSubmittedList = new ArrayList<>();
        for (int i=6;i<12;i++){
            documentNotSubmittedList.add("Document "+(i+1));
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,documentNotSubmittedList);
        documentsNotSubmitted.setAdapter(arrayAdapter);
    }

    private void addMembers() {

        ArrayList<String> memberArrayList = new ArrayList<>();
        for (int i=0;i<20;i++){
            memberArrayList.add("Team Member "+(i+1));
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,memberArrayList);
        memberList.setAdapter(arrayAdapter);
    }


    private void getScreenElements(){
        udbtn=findViewById(R.id.updateBtn);
        udet=findViewById(R.id.updateEd);

        documentsSubmitted=findViewById(R.id.documentsSubmitted);
        documentsNotSubmitted=findViewById(R.id.documentsNotSubmitted);
        memberList = findViewById(R.id.memberList);



        // For forwording update score from one activity to another

        udbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AdminProfileActivity.this,HomeActivity.class);
                st=udet.getText().toString();
                scoredata="Score:"+st+"/2000";
                i.putExtra("Value",scoredata);
                startActivity(i);
                finish();
            }
        });

    }


}
