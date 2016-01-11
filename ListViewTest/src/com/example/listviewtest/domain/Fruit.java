package com.example.listviewtest.domain;

public class Fruit {
	//name代表水果的名字
	private String name;
	//imageId代表的是水果对应的图片资源
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
