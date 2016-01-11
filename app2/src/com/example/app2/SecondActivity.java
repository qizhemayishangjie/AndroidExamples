package com.example.app2;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		/*super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		Intent intent=getIntent();
		String data=intent.getStringExtra("extra_data");
		Log.d("SecondActivity", data);*/
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		Button button2=(Button)findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.putExtra("data_return", "hello, main Activity");
				setResult(RESULT_OK,intent);
				finish();
			}
		});
		
	}

	@Override
	public void onBackPressed() {
		Intent intent=new Intent();
		intent.putExtra("data_return", "hello, press Back");
		setResult(RESULT_OK,intent);
		finish();
	}
}
