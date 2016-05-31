package com.fang.entity;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;

public class WPInfo extends Model<WPInfo> {

    public static WPInfo dao= new WPInfo();
    
    public List<Record> getAllWPInfo(){
        String sql ="select * from wpinfo";
        List<Record> list=Db.find(sql);
        return list;
    }
    
}
