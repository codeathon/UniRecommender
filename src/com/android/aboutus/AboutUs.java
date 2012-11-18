package com.android.aboutus;

import com.android.universityrecommender_v1.R;
import com.android.universityrecommender_v1.R.layout;
import com.android.universityrecommender_v1.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class AboutUs extends Activity {

	private Button about_us_startup;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_us);
		initControls();
	}

	private void initControls() {
		about_us_startup=(Button)findViewById(R.id.about_us_home);
		about_us_startup.setOnClickListener(new Button.OnClickListener() { public void onClick(View v) { aboutUsStartupOnClick(); }});
	}

	public void aboutUsStartupOnClick() {
		Intent startupInIntent = new Intent();
		startupInIntent.setClass(this, com.android.startup.StartupActivity.class);
		startActivity(startupInIntent);
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_about_us, menu);
		return true;
	}

}
