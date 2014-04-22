package com.usi.comm.example.layoutEx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class LayoutList extends Activity {

	private final String[] layoutTypes = new String[] { "AbsoluteLayout",
			"FrameLayout", "GridLayout", "LinearLayout", "RelativeLayout",
			"TableLayout" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_layout_list);

		((ListView) findViewById(R.id.listView1)).setAdapter(new MyAdapter());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.layout_list, menu);
		return true;
	}

	private OnClickListener clickEvent = new OnClickListener() {

		@Override
		public void onClick(View v) {
			int pos = Integer.valueOf(v.getTag().toString());
			Class<? extends Activity> c = null;

			switch (pos) {
				case 0:

					break;
				case 1:
					break;
				case 2:
					break;
				case 3:
					c = LinearLayoutActivity.class;
					break;
				case 4:
					c = RelativeLayoutActivity.class;
					break;
				case 5:
					// c = TableLayout.class;
					break;

				default:
					return;
			}

			if (null != c) {
				startActivity(new Intent(LayoutList.this, c));
			} else {
				Toast.makeText(LayoutList.this,
						layoutTypes[pos] + "恬撹嶄、おまちしてください", Toast.LENGTH_LONG)
						.show();
			}
		}
	};

	public class MyAdapter extends BaseAdapter {

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			TextView tv = (TextView) LayoutInflater.from(LayoutList.this)
					.inflate(R.layout.list_items, parent, false);
			tv.setText(layoutTypes[position]);

			tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,16);
			tv.setHeight(80);
			tv.setClickable(true);
			tv.setTag(position);
			tv.setOnClickListener(clickEvent);
			return tv;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public Object getItem(int position) {
			return layoutTypes[position];
		}

		@Override
		public int getCount() {
			return layoutTypes.length;
		}
	}
}
