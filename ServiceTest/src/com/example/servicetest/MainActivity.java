package com.example.servicetest;

import com.example.servicetest.MyService.DownloadBinder;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private Button bindService;
	private Button unbindService;
	private MyService.DownloadBinder downloadBinder;
	private ServiceConnection connection=new ServiceConnection() {	
		@Override
		public void onServiceDisconnected(ComponentName name) {
		}
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			downloadBinder=(DownloadBinder) service;
			downloadBinder.startDownload();
			downloadBinder.getProgress();
		}
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bindService=(Button) findViewById(R.id.bind_service);
		unbindService=(Button) findViewById(R.id.unbind_service);
		bindService.setOnClickListener(this);
		unbindService.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.bind_service:
			Intent bindIntent=new Intent(this,MyService.class);
			//绑定服务
			bindService(bindIntent,connection,BIND_AUTO_CREATE);
			break;
		case R.id.unbind_service:
			//解除服务
			unbindService(connection);
			break;
		default:
			break;
		}
	}
}
