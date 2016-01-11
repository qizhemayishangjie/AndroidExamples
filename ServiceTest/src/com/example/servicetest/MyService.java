package com.example.servicetest;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;


public class MyService extends Service {
	private DownloadBinder mBinder=new DownloadBinder();
	class DownloadBinder extends Binder{
		public void startDownload(){
			Log.d("MyService","startDownload executed");
		}
		public int getProgress(){
			Log.d("MyService", "getProgress executed");
			return 0;
		}
	}
	@Override
	public IBinder onBind(Intent intent) {
		return mBinder;
	}
}
