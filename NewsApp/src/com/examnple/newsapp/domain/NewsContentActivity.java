package com.examnple.newsapp.domain;

import com.example.newsapp.NewsContentFragment;
import com.example.newsapp.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class NewsContentActivity extends Activity {
	public static void actionStart(Context context,String newsTitle,String newsContent){
		Intent intent=new Intent(context,NewsContentActivity.class);
		intent.putExtra("news_title", newsTitle);
		intent.putExtra("news_content", newsContent);
		context.startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.news_content);
		//��ȡ��������ű���
		String newsTitle=getIntent().getStringExtra("news_title");
		//��ȡ�������������
		String newsContent=getIntent().getStringExtra("news_content");
		NewsContentFragment newsContentFragment=(NewsContentFragment) getFragmentManager().
				                     findFragmentById(R.id.news_content_fragment);
		//ˢ��
		newsContentFragment.refresh(newsTitle, newsContent);
	}
}