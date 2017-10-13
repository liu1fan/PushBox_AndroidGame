package com.liu1fan.pushbox;

import java.util.zip.Inflater;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onClick(View view){
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
    	MenuInflater infiMenuInflater =new MenuInflater(this);
        getMenuInflater().inflate(R.menu.activity_main, menu);
        
        return true;
    }
    
}
