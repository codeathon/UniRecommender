package com.android.startup;

import com.android.universityrecommender_v1.R;
import com.android.universityrecommender_v1.R.id;
import com.android.universityrecommender_v1.R.layout;
import com.android.universityrecommender_v1.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class StartupActivity extends Activity {

	private Button signIn;
	private Button signUp;
	private Button aboutUs;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_startup);
		
		signIn=(Button)findViewById(R.id.startup_signIn);
		signUp=(Button)findViewById(R.id.startup_newUser);
		aboutUs=(Button)findViewById(R.id.startup_aboutUs);
		
		signIn.setOnClickListener(new Button.OnClickListener() { public void onClick(View v) { signInOnClick(); }});
		signUp.setOnClickListener(new Button.OnClickListener() { public void onClick(View v) { signUpOnClick(); }});
		aboutUs.setOnClickListener(new Button.OnClickListener() { public void onClick(View v) { aboutUsClick(); }});
	}

	public void signInOnClick() {
		Intent signInIntent = new Intent();
		signInIntent.setClass(this, com.android.signin.SignInActivity.class);
		startActivity(signInIntent);
	}
	
	public void signUpOnClick() {
		Intent signUpIntent = new Intent();
		signUpIntent.setClass(this, com.android.signup.SignUpActivity.class);
		startActivity(signUpIntent);
	}
	
	public void aboutUsClick() {
		Intent aboutUsIntent = new Intent();
		aboutUsIntent.setClass(this, com.android.aboutus.AboutUs.class);
		startActivity(aboutUsIntent);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_startup, menu);
		return true;
	}

}
