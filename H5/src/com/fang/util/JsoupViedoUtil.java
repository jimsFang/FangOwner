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
public class JsoupViedoUtil {
	public static void main(String[] args) {
		List<String> videos=getVediogUrl("");
		getVideoUrlDetail(videos.get(1));
	}
	
	public static Map<String,String>  getVideoUrlDetail(String url) {
		Map<String,String> imgs = new HashMap<String,String>();

		Document doc;
		try {
			doc = Jsoup.connect(url)
					.data("query", "Java").userAgent("Mozilla")
					.cookie("auth", "token").timeout(3000).post();

//			Elements links = doc.select("img[src]");

			System.out.println(doc);
//			for(Element e:links){
//				String img_width=e.attr("img_width");
//				if(!"".equals(img_width)){
//					imgs.put(e.attr("src"),"");
//				}
//			}
		
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return imgs;

	}
	
	/**
	 * 陈翔六点半
	 * @param url
	 * @return
	 */
	public static List<String>  getVediogUrl(String url) {
		Map<String,String> vedios = new HashMap<String,String>();
		List<String> list = new ArrayList<String>();
		String vedioUrlIndex=url;
		if("".equals(url)){
		    vedioUrlIndex="http://www.toutiao.com/m4093808656";
		}
		Document doc;
		try {
			doc = Jsoup.connect(vedioUrlIndex)
					.data("query", "Java").userAgent("Mozilla")
					.cookie("auth", "token").timeout(3000).post();

			Elements links = doc.select("a[href]");
			String urlfirstVedio="";
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
