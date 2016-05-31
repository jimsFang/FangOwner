package com.fang.common;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.fang.controller.ComputerStore;
import com.fang.entity.WPInfo;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.CaseInsensitiveContainerFactory;
import com.jfinal.plugin.activerecord.dialect.OracleDialect;
import com.jfinal.render.ViewType;

public class CommonController extends JFinalConfig {
    public void configConstant(Constants me) {
        me.setDevMode(true);
        me.setViewType(ViewType.JSP);      
    }

    public void configRoute(Routes me) {
        me.add("/", ComputerStore.class);

    }

    public void configPlugin(Plugins me) {

        DataSource dataSource =null;
        try {
            dataSource = (DataSource)new InitialContext().lookup("java:comp/env/jdbc/eoms_ds");
        } catch (NamingException e) {
            e.printStackTrace();
        }
        ActiveRecordPlugin bsfArp  = new ActiveRecordPlugin("bsf",dataSource);
        bsfArp.setDialect(new OracleDialect());
        bsfArp.setContainerFactory(new CaseInsensitiveContainerFactory(true));        //配置数据库列大小写不敏感。
        bsfArp.setShowSql(true);
        bsfArp.addMapping("wpinfo", WPInfo.class);
        me.add(bsfArp);
    }

    public void configInterceptor(Interceptors me) {
    }

    public void configHandler(Handlers me) {
    }
}
