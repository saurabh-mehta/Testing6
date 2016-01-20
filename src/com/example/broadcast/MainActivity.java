package com.example.broadcast;

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
	
	public void send(View v)
	{
		
		Intent i = new Intent();
		i.setAction("com.example.broadcast");
		i.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
		sendBroadcast(i);
		
	}
}
