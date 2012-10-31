/**
 * 
 */
package com.restaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author Harrsh
 * 
 */
public class LoginActivity extends Activity {

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
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

}
