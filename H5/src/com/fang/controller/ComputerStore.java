package com.fang.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fang.entity.HistoryTitle;
import com.fang.entity.WPInfo;
import com.fang.util.JsoupHistoryUtil;
import com.fang.util.JsoupImgUtil;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Record;

public class ComputerStore extends Controller {

    public void index() {

        render("/jsp/mainHome.jsp");
    }

    public void jokeImg() {

        List<String> img_jks = new ArrayList<String>();

        List<String> imgIndexUrls = JsoupImgUtil.getImgUrl("");
        System.out.println(imgIndexUrls.size()+"----------------------");
        String url = "";
//        for (String key : imgIndexUrls) {
          for(int i=0;i<imgIndexUrls.size();i++) {
              if(i==2) break;
              String key = imgIndexUrls.get(i);
            Map<String, String> img_jks1 = JsoupImgUtil.getImgUrlDetail(key);
            for (String key2 : img_jks1.keySet()) {
                img_jks.add(key2);
            }
        }
        System.out.println(img_jks.size()+"+++++++++++++++++++++++++");
        setAttr("img_jks", img_jks);

        render("/index.jsp");
    }
    
    public void history() {
        List<HistoryTitle> listHistory=JsoupHistoryUtil.getAllBaseHistory();
        setAttr("listHistory", listHistory);
        render("/history.jsp");
    }
    
}
