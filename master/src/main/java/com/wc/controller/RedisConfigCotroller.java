package com.wc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wc.config.RedisConfig;
import com.wc.config.StaticConfig;

@Controller
public class RedisConfigCotroller {

	protected static final Logger LOG = LoggerFactory.getLogger(RedisConfigCotroller.class);
	
	/*@Autowired
	RedisConfig redisConfig;*/
	
	
	@RequestMapping("/env")
	@ResponseBody
	String home() {
		StringBuffer env = new StringBuffer();
		/*env.append("<br>Host:" + redisConfig.getHost());
		env.append("<br>Port:" + redisConfig.getPort());*/
		env.append("<br>StaticVar:" + StaticConfig.getStaticVar());
		env.append("<br>StaticItem:" + StaticConfig.getStaticItem());
		return env.toString();
	}

}
