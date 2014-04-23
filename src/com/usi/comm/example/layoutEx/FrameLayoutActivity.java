package com.usi.comm.example.layoutEx;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class FrameLayoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_frame_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.absolute_layout, menu);
		return true;
	}

	public void onClick (View v) {
		View txt3 = findViewById(R.id.textView3);
		txt3.setVisibility(txt3.getVisibility()^View.GONE);
	}
}
