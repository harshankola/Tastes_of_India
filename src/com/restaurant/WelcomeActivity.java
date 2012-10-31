package com.restaurant;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class WelcomeActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

	public void loginUser(View v) {
		// TODO checking credentials of Users.

		// TODO admin redirect

		// TODO normal user redirect
		startActivity(new Intent(getApplicationContext(),
				com.restaurant.ProfileActivity.class));
		// TODO login failure, redirect to login screen.
		// startActivity(new Intent(getBaseContext(), LoginActivity.class));
	}

	public void registerUser(View v) {
		// TODO go to registration page
		startActivity(new Intent(getApplicationContext(),
				com.restaurant.RegisterActivity.class));
	}
}
