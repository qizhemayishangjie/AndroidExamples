package com.example.listviewtest.domain;

public class Fruit {
	//name����ˮ��������
	private String name;
	//imageId�������ˮ����Ӧ��ͼƬ��Դ
	private int imageId;
	public Fruit(String name, int imageId) {
		super();
		this.name = name;
		this.imageId = imageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
}
