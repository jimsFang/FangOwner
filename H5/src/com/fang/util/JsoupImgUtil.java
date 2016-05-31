package com.fang.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * �ں����� http://toutiao.com/m2773452475/
 * @author Administrator
 *
 */
public class JsoupImgUtil {
	public static void main(String[] args) {
//		List<String> imgs=getImgUrl("");
//		getImgUrlDetail(imgs.get(1));//http://toutiao.com/item/6218416391234519553/
	}
	
	public static Map<String,String>  getImgUrlDetail(String url) {
		Map<String,String> imgs = new HashMap<String,String>();

		Document doc;
		try {
			doc = Jsoup.connect(url)
					.data("query", "Java").userAgent("Mozilla")
					.cookie("auth", "token").timeout(3000).post();

			Elements links = doc.select("img[src]");
			for(Element e:links){
				String img_width=e.attr("img_width");
				if(!"".equals(img_width)){
					imgs.put(e.attr("src"),"");
				}
			}
		
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return imgs;

	}
	
	public static List<String>  getImgUrl(String url) {
		Map<String,String> vedios = new HashMap<String,String>();
		List<String> list = new ArrayList<String>();
		String imgUrlIndex=url;
		if("".equals(url)){
			imgUrlIndex="http://toutiao.com/m2773452475";
		}
		Document doc;
		try {
			doc = Jsoup.connect(imgUrlIndex)
					.data("query", "Java").userAgent("Mozilla")
					.cookie("auth", "token").timeout(3000).post();

			Elements links = doc.select("a[href]");
			String urlImg="";
			for (Element e : links) {
				String target = e.attr("target");
				String ga_event = e.attr("ga_event");

				if ("_blank".equals(target) && "source_url".equals(ga_event)&&!url.equals(e.attr("href"))) {
					list.add(e.attr("href"));
					url=e.attr("href");
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return list;

	}
}
