package com.usi.comm.example.layoutEx;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class TableLayoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_table_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.table_layout2, menu);
		return true;
	}

	public void onClick(View v){
		onBackPressed();
	}
}
