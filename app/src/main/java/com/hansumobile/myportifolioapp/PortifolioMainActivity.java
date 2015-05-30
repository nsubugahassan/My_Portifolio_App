package com.hansumobile.myportifolioapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class PortifolioMainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portifolio_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portifolio_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Bellow are the methods that will be handling onclick events on buttons
    //Method to handle click event on buttons
    public void handButtonClickEvents(View view){
        switch (view.getId()){
            case R.id.btn_cat:
                displayToast("Cat !");
                break;
            case R.id.btn_thing1:
                displayToast("Thing1 !");
                break;
            case R.id.btn_thing2:
                displayToast("Thing2 !");
                break;
            case R.id.btn_amajigger:
                displayToast("Amajigger !!");
                break;
            case R.id.btn_sally:
                displayToast("Sally!");
                break;
            case R.id.btn_nick:
                displayToast("Nick!");
                break;
            case R.id.btn_dr_seuss:
                displayToast("Seuss !");
                break;

        }

    }

    //Method to display a toast

    public void displayToast(String msg){

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

    }
}
