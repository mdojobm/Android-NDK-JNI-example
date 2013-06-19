package com.example.test04jni;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView textView_result;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Load native library
		System.loadLibrary("jni_example");
		
		textView_result = (TextView) findViewById(R.id.textView_result);
		
		final Button btn_start = (Button) findViewById(R.id.button1);
		btn_start.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View v) {
	        	 Integer i = 10;	        		        		        	
	        	 textView_result.setText(Integer.toString(callJni(i)));
	         }        	  
	    });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	 public native int callJni(int i);
}
