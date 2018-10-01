package com.example.dell443.framentapplicatio;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {




    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            //กดปุ่มแล้วหน้าไหนมา
            switch (item.getItemId()) {
                case R.id.navigation_proflie:
                    loadFragment(new ProfileFragment() );
                    return true;
                case R.id.navigation_study:
                    loadFragment(new StudyFragment() );
                    return true;
                case R.id.navigation_movie:
                    loadFragment(new MovieFragment() );
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new ProfileFragment() );//โหลดนั้นขึ้นมา

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }
//โหลดหน้าต่าง ตามปุ่มที่ทำการกด
    private boolean loadFragment(StudyFragment fragment) {
        //switching fragment
        if (fragment != null) {
            //สถานะการทำงาน
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit(); //จะบอกว่าสำเร็จกี่ครั้ง
            return true;
        }
        return false;
    }

    private boolean loadFragment(ProfileFragment fragment) {
        //switching fragment
        if (fragment != null) {
            //สถานะการทำงาน
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit(); //จะบอกว่าสำเร็จกี่ครั้ง
            return true;
        }
        return false;
    }

    private boolean loadFragment(MovieFragment fragment) {
        //switching fragment
        if (fragment != null) {
            //สถานะการทำงาน
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit(); //จะบอกว่าสำเร็จกี่ครั้ง
            return true;
        }
        return false;
    }


}
