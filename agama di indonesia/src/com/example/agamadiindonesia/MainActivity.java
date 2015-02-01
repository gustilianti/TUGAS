package com.example.agamadiindonesia;

import com.example.agamadiindonesia.AboutActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void openmasjid (View v){
    	Intent masjid = new Intent(getApplicationContext(),masjidActivity.class);
    	
    	startActivity(masjid);
    }
    public void openkristen (View v){
    	Intent kristen = new Intent(getApplicationContext(),kristenActivity.class);
    	
    	startActivity(kristen);
    }
    public void openkonghucu (View v){
    	Intent konghucu = new Intent(getApplicationContext(),konghucuActivity.class);
    	
    	startActivity(konghucu);
    }
    public void openkatolik (View v){
    	Intent katolik = new Intent(getApplicationContext(),katolikActivity.class);
    	
    	startActivity(katolik);
}
public void openwihara (View v){
	Intent wihara = new Intent(getApplicationContext(),wihara_Activity.class);
	
	startActivity(wihara);
}
public void openhindu (View v){
	Intent hindu = new Intent(getApplicationContext(),hinduActivity.class);
	
	startActivity(hindu);
}
public void openAbout (View v){
	Intent About = new Intent(getApplicationContext(),AboutActivity.class);
	
	startActivity(About);

}
}
