/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.usi.comm.example.layoutEx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Demonstrates using GridLayout to build the same "Simple Form" as in the
 * LinearLayout and RelativeLayout demos.
 */
public class GridLayout1 extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_layout_1);
	}

	public void onClick(View v) {
		if (v.getId() == R.id.grid_btn1) {
			onBackPressed();
		} else {
			startActivity(new Intent(this, GridLayout2.class));
		}
	}
}
