package com.usi.comm.example.layoutEx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RelativeLayoutActivity extends Activity {

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

	
	public void onClick(View v) {
		if(v instanceof TextView && !(v instanceof Button)){
			Toast.makeText(this, ((TextView) v).getText()+ " has been clicked . ", Toast.LENGTH_SHORT).show();
		}
		
		else if(v.getId() == R.id.btn_1) {
			startActivity(new Intent(this, LinearLayoutActivity.class));
		}
	}
}
