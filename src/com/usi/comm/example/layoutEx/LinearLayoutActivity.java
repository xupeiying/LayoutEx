package com.usi.comm.example.layoutEx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LinearLayoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_linear_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.linear_layout, menu);
		return true;
	}

	public void onClick(View v) {

		if (v.getId() == R.id.button1) {
			// startActivity(new Intent(this, LinearLayoutActivity.class));
			onBackPressed();
		} else if (v.getId() == R.id.button2) {
			startActivity(new Intent(this, LinearLayoutActivity2.class));
		} else if (v instanceof TextView) {
			Toast.makeText(this,
					((TextView) v).getText() + "has been clicked . ",
					Toast.LENGTH_SHORT).show();
		}
	}
}
