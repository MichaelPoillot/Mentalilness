package com.example.mentalilness;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById ( R.id.toolbar );
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.black));
        FloatingActionButton fab=findViewById ( R.id.fab );
        fab.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Snackbar.make ( view, "Replace with your own action", Snackbar.LENGTH_LONG )
                        .setAction ( "Action", null ).show ();
            }
        } );
        DrawerLayout drawer=findViewById ( R.id.drawer_layout );
        NavigationView navigationView=findViewById ( R.id.nav_view );
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration=new AppBarConfiguration.Builder (
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send )
                .setDrawerLayout ( drawer )
                .build ();
        NavController navController=Navigation.findNavController ( this, R.id.nav_host_fragment );
        NavigationUI.setupActionBarWithNavController ( this, navController, mAppBarConfiguration );
        NavigationUI.setupWithNavController ( navigationView, navController );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater ().inflate ( R.menu.main, menu );
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController=Navigation.findNavController ( this, R.id.nav_host_fragment );
        return NavigationUI.navigateUp ( navController, mAppBarConfiguration )
                || super.onSupportNavigateUp ();
    }

    public void depresiclick(View view) {
        Intent intent = new Intent(this,desc_depresi.class);
        startActivity(intent);
    }

    public void kepercayaandiriclick(View view) {
        Intent intent = new Intent(this,desc_kepercayaandiri.class);
        startActivity(intent);
    }

    public void emosiclick(View view) {
        Intent intent = new Intent(this,mood_swing.class);
        startActivity(intent);
    }

    public void eatingdisorderclick(View view) {
        Intent intent = new Intent(this,eating_disorder.class);
        startActivity(intent);
    }

    public void cyberbulyclick(View view) {
        Intent intent = new Intent(this,cyber_bullying.class);
        startActivity(intent);
    }

    public void alteregoclick(View view) {
        Intent intent = new Intent(this,alter_ego.class);
        startActivity(intent);
    }
}
