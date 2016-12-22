package com.wc.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import com.baidu.disconf.client.common.update.IDisconfUpdate;

/**
 * Created by fiboliu on 16-3-16.
 */
@Configuration("redisConfig")
@DisconfFile(filename = "redis.properties")
public class RedisConfig implements IDisconfUpdate {

    protected static final Logger LOGGER = LoggerFactory.getLogger(RedisConfig.class);

    // 代表连接地址
    private String host;
    
    // 代表连接port
    private int port;

    /**
     * 地址, 分布式文件配置
     *
     * @return
     */
    @DisconfFileItem(name = "redis.host", associateField = "host")
    public String getHost() {

        return host;
    }

    public void setHost(String host) {

        this.host = host;
    }

    /**
     * 端口, 分布式文件配置
     *
     * @return
     */
    @DisconfFileItem(name = "redis.port", associateField = "port")
    public int getPort() {

        return port;
    }

    public void setPort(int port) {

        this.port = port;
    }

    public void reload() throws Exception {

        LOGGER.info("host: " + host);
    }
       
}
