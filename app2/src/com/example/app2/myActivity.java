package com.example.app2;
import com.example.app2.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
public class myActivity extends Activity {
	@Override
	protected void onCreate(Bundle saveInstanceState){
		super.onCreate(saveInstanceState);
		//���д��������������label������д�����ò��ִ����ǰ��
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
		//����һ�д������ͨ��id�������Ŀ�е����
		Button button1=(Button)findViewById(R.id.button_1);
		/*
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//��һ��������Context���󣬾���ToastҪ��������ģ����������һ��Context����
				//�ڶ���������Toast��ʾ���ı�����
				//������������Toast��ʾ��ʱ�������������õĳ���Toast.LENGTH_SHORT��Toast.LENGTH_LONG
				Toast.makeText(myActivity.this, "success", Toast.LENGTH_SHORT).show();
			}
		});
		*/
		/*
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		*/
		/*
		 * button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(myActivity.this,SecondActivity.class);
				startActivity(intent);
			}
		});
		*/
		/*button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent("com.example.app2.ACTION_START");
				intent.addCategory("com.example.myCategory");
				startActivity(intent);
			}
		});*/
		/*button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));
				startActivity(intent);
			}
		});*/
		/*button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("tel:"));
				startActivity(intent);
			}
		});*/
		/*button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String data="hello I'm from myActivity";
				Intent intent=new Intent(myActivity.this,SecondActivity.class);
				intent.putExtra("extra_data", data);
				startActivity(intent);
			}
		});*/
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(myActivity.this,SecondActivity.class);
				startActivityForResult(intent,1);
			}
		});
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch(requestCode){
		case 1:
			if(resultCode==RESULT_OK){
				String returnData=data.getStringExtra("data_return");
				Log.d("msg", returnData);
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		/*ͨ��getMenuInflater()�����ܹ��õ�MenuInlater�����ٵ�������inflate()�����Ϳ��Ը�
		      ��ǰ������˵��ˡ�
		  inflate()��������������������һ����������ָ��ͨ����һ����Դ�����˵���ڶ�����������ָ���˵���
		      ���ӵ���һ��Menu�����С������������true��ʾ�������Ĳ˵���ʾ�������������false�������Ĳ˵���
		     ����ʾ������
		*/
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()){
		case R.id.add_item:
			Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT);
			break;
		case R.id.remove_item:
			Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT);
			break;
		default:
		}
		return true;
	}
	
}