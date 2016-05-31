package com.fang.entity;

import java.util.ArrayList;
import java.util.List;

public class HistoryTitle {

	private String contentUrl;
	private String title;
	private List<String> imgList = new ArrayList<String>();

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getImgList() {
		return imgList;
	}

	public void setImgList(List<String> imgList) {
		this.imgList = imgList;
	}

}
