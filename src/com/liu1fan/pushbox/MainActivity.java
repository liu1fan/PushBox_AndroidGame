package com.liu1fan.pushbox;

import java.util.zip.Inflater;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onClick(View view){
    	
		
		
		switch (view.getId()) {
		case R.id.exit:
			isFinish();
			break;

		}
    }

	public void isFinish(){
		AlertDialog.Builder dll = new AlertDialog.Builder(this);
    	dll.setTitle("Warnning!");
   
    	dll.setMessage("Do you want exit?");
    	dll.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				MainActivity.this.finish();
			}
		}); 
		dll.setNeutralButton("cancle", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
			}
		});
		dll.create();
		dll.show();
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	MenuInflater inflater =new MenuInflater(this);
        inflater.inflate(R.menu.activity_main, menu);
        
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	switch (item.getItemId()) {
		case R.id.music:
			Intent intent1 = new Intent(MainActivity.this,MusicPlayer.class);
			startActivity(intent1);
			break;
		case R.id.help:
			Intent intent2 = new Intent(MainActivity.this,Helper.class);
			startActivity(intent2);
			break;
		}
    	return super.onOptionsItemSelected(item);
    }
    
}
