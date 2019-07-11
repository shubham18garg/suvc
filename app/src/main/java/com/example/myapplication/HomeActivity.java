package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ListView memberList;
    TextView scoretv;
    String st1;
    EditText username;
/*
    Button suvcBtn;
*/
/*
    Button editBtn;
*/
    Button addMemberBtn;
    TextView teamEdittv;
    Menu notification_menu;
/*
    Button notificationBtn;
*/
    String st;
    public Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getScreenElements();
        //Need to modify this method to add dynamic members.
        addMembers();
        openNotificationActivity();
        /*Log.d( "HomeActivity","" + username);
        if(username.getText().toString().equals("admin")) {
            updatescore();
        }*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    /*menu fucntion and switch case*/


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.notification_menu:
                setNotification_menu();
                return true;

            case R.id.about_us_menu:
                setAbout_us_menu();
                return true;

            case R.id.team_profile_menu:
                setTeam_profile();
                return true;

            case R.id.log_out_menu:
                setLogout();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void setNotification_menu() {
        startActivity(new Intent( HomeActivity.this, NotificationActivity.class));
    }

    public void setAbout_us_menu() {
        startActivity(new Intent( HomeActivity.this, AboutUsActivity.class));
    }

    public void setTeam_profile(){
        startActivity(new Intent( HomeActivity.this, ProfileActivity.class));

    }
    public void setLogout(){
        startActivity(new Intent( HomeActivity.this, MainActivity.class));

    }



    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        openNotificationActivity();

    }



    private void openNotificationActivity() {
        /*suvcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( HomeActivity.this,AboutUsActivity.class));
            }
        });*/



        addMemberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( HomeActivity.this,AddMemberActivity.class));
            }
        });

        /*profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( HomeActivity.this,ProfileActivity.class));
            }
        });*/


        /*notificationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( HomeActivity.this, NotificationActivity.class));
            }
        });*/


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
        memberList = findViewById(R.id.memberList);
/*
        suvcBtn = findViewById(R.id.suvcBtn);
*/
/*
        editBtn=findViewById(R.id.editBtn);
*/
        addMemberBtn=findViewById(R.id.addMemberBtn);
/*
        profile=findViewById(R.id.profile);
*/
/*
        notificationBtn=findViewById(R.id.notificationBtn);

*/
        scoretv=findViewById(R.id.welcomeUser);
        teamEdittv =findViewById(R.id.teamName);
        username=findViewById(R.id.username);

    }
    private void updatescore(){
        st1=getIntent().getExtras().getString("Value");
        scoretv.setText(st1);

    }

}
