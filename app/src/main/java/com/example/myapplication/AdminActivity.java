package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AdminActivity extends AppCompatActivity {
    ListView memberList;
    Menu notification_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        addMembers();




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
        startActivity(new Intent( AdminActivity.this, NotificationActivity.class));
    }

    public void setAbout_us_menu() {
        startActivity(new Intent( AdminActivity.this, AboutUsActivity.class));
    }

    public void setTeam_profile(){
        startActivity(new Intent( AdminActivity.this, ProfileActivity.class));

    }
    public void setLogout(){
        startActivity(new Intent( AdminActivity.this, MainActivity.class));

    }

    private void addMembers() {
        memberList = findViewById(R.id.memberList);
        ArrayList<String> memberArrayList = new ArrayList<>();
        for (int i=0;i<20;i++){
            memberArrayList.add("Team "+(i+1));
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,memberArrayList);
        memberList.setAdapter(arrayAdapter);


        memberList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent intent=new Intent(AdminActivity.this,AdminProfileActivity.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent=new Intent(AdminActivity.this,AdminProfileActivity.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent=new Intent(AdminActivity.this,AdminProfileActivity.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent=new Intent(AdminActivity.this,AdminProfileActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

}
