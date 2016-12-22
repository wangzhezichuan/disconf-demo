package com.wc.config;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import com.baidu.disconf.client.common.annotations.DisconfItem;

/**
 * 静态 配置文件 示例
 *
 * @author liaoqiqi
 * @version 2014-6-17
 */
@DisconfFile(filename = "static.properties")
public class StaticConfig {

    private static int staticVar;

    @DisconfFileItem(name = "staticVar", associateField = "staticVar")
    public static int getStaticVar() {
        return staticVar;
    }

    public static void setStaticVar(int staticVar) {
        StaticConfig.staticVar = staticVar;
    }
    
    private static int staticItem = 56;

    /**
     *
     * @return
     */
    public static int getStaticFileData() {

        return StaticConfig.getStaticVar();
    }

    @DisconfItem(key = "staticItem")
    public static int getStaticItem() {
        return staticItem;
    }


}