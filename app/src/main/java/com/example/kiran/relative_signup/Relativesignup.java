package com.example.kiran.relative_signup;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Kiran on 03-11-2015.
 */
public class Relativesignup extends Activity {

protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.signup_relative);
    Toast.makeText(getApplicationContext(), "Log in page", Toast.LENGTH_LONG).show();
}

}
