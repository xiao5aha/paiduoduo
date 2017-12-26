package com.paiduoduo.pai.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import freemarker.template.TemplateException;
/**
* freeMarkerConfig
*
* @author ZhangChi
* @date 2017年12月15日---下午6:23:12
* @version 1.0
*/
@Configuration
public class FreeMarkerConfig {

	@Autowired
	protected freemarker.template.Configuration configuration;
	@Autowired
	protected org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver resolver;

	@PostConstruct
	public void setSharedVariable() {
		
		configuration.setDateFormat("yyyy/MM/dd");
		configuration.setDateTimeFormat("yyyy-MM-dd HH:mm:ss");

		/**
		 * setting配置
		 */
		try {
			configuration.setSetting("template_update_delay", "1");
			configuration.setSetting("default_encoding", "UTF-8");
		} catch (TemplateException e) {
			e.printStackTrace();
		}

		/**
		 * 配置Freemarker视图解析器
		 */
		resolver.setSuffix(".ftl"); // 解析后缀为html的
		resolver.setCache(false); // 是否缓存模板
		resolver.setRequestContextAttribute("request"); // 为模板调用时，调用request对象的变量名
	}
}