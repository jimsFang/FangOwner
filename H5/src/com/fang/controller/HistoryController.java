package com.fang.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fang.entity.HistoryTitle;
import com.jfinal.core.Controller;

public class HistoryController extends Controller {
	public void index() {
		/**
		 * 测试gitHub
		 */
		String url="http://m.toutiao.com/m4870506287/";
		String url2="http://m.toutiao.com/m4870506287/p2/";
		List<HistoryTitle> hts=getTitle3Img(url);
		List<HistoryTitle> hts2=getTitle3Img(url2);
//		setAttr("title","巨贪和珅原本负责反贪工作，办了两个贪污大案后，悟出了一个道理");
//		setAttr("html", getHisContent(hts.get(0).getContentUrl()));
		hts.addAll(hts2);
		setAttr("hts", hts);
		render("index.jsp");
	}
	
	
	
	public void getHisContent() {
		String url=getPara("contentUrl");
		try {
		String title = new String(getPara("title").getBytes("iso-8859-1"), "utf-8");
		Document doc;
			doc = Jsoup.connect(url).get();

			Elements content = doc.select("div")
					.select("[class=article-content]");
			Elements imgs=content.select("img").removeAttr("img_width").removeAttr("img_height").attr("width", "80%");
//			System.out.println(content.select("img"));
			System.out.println(content);
			setAttr("html", content.html().replaceAll("微信公众号：正史也疯狂", ""));
			setAttr("title",title);
			render("viewHisDetail.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public List<HistoryTitle> getTitle3Img(String url) {
		List<HistoryTitle> hts = new ArrayList<HistoryTitle>();

		HistoryTitle ht = new HistoryTitle();
		Document doc;
		try {
			doc = Jsoup.connect(url).get();

			Elements links = doc.select("a").select(
					"[onclick=action_log(this)]");
			String href = "";
			int i = 0;
			for (Element ele : links) {
				++i;
				if (!"".equals(href) && !href.equals(ele.attr("href"))) {

					System.out
							.println("**************************************************");
					i = 1;
					hts.add(ht);
					ht = new HistoryTitle();
					// break;
				}
				if (i == 1) {
					System.out.println(ele.text() + "----" + ele.attr("href"));
					ht.setContentUrl(ele.attr("href"));
					ht.setTitle(ele.text());
				} else {
					System.out.println(ele.select("img").attr("src"));
					ht.getImgList().add(ele.select("img").attr("src"));
				}

				href = ele.attr("href");
				// System.out.println(ele);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(hts.toString());

		return hts;
	}
}
