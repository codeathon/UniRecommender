package com.android.signup;

import com.android.universityrecommender_v1.R;
import com.android.universityrecommender_v1.R.layout;
import com.android.universityrecommender_v1.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends Activity {

	private Button sign_up_startup;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);
		initControls();
	}

	private void initControls() {
		sign_up_startup=(Button)findViewById(R.id.sign_up_home);
		sign_up_startup.setOnClickListener(new Button.OnClickListener() { public void onClick(View v) { signUpHome();}});
	}


	protected void signUpHome() {
		Intent startupInIntent = new Intent();
		startupInIntent.setClass(this, com.android.startup.StartupActivity.class);
		startActivity(startupInIntent);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_sign_up, menu);
		return true;
	}
	
	

}
