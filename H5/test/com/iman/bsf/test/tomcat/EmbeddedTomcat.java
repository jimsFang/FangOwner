package com.iman.bsf.test.tomcat;


import java.io.File;

import org.apache.catalina.startup.Tomcat;


/**
 * TOMCAT
 */
public class EmbeddedTomcat {

    private static Tomcat tomcat = null;
    private static String CONTEXT_PATH = "/H5";
    private static String WEB_APP_PATH = new File("WebRoot").getAbsolutePath();
    private static String ENCODING = "UTF-8";

    // 启动嵌入式Tomcat服务器
    public static void startTomcat() throws Exception {
        try {
            tomcat = new Tomcat();
            // 设置Tomcat的工作目录:工程根目录/Embedded/Tomcat
            tomcat.setBaseDir(WEB_APP_PATH);
            tomcat.setPort(9081);
            tomcat.addWebapp(CONTEXT_PATH, WEB_APP_PATH);
            tomcat.enableNaming();//执行这句才能支持JDNI查找
            tomcat.getConnector().setURIEncoding(ENCODING);
            tomcat.start();
            tomcat.getServer().await();//让服务器一直跑
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            EmbeddedTomcat.startTomcat();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}