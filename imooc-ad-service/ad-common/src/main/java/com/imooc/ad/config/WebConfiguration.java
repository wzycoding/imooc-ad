package com.imooc.ad.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * web mvc配置类
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/3 6:07 下午
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //配置消息转换器，本来是spring会选择消息转化器，我们直接把其他消息转换器清空，直接使用Jackson的消息转换器
        converters.clear();
        converters.add(new MappingJackson2HttpMessageConverter());
    }
}