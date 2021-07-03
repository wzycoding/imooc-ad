package com.imooc.ad.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义 Zuul 的 filter 时，需要继承 ZuulFilter 抽象类，其中 filterOrder 定义了过滤器执行的顺序，数值越小，优先级越高。
 * 因为内置的响应过滤器优先级定义为常量 FilterConstants.SEND_RESPONSE_FILTER_ORDER，所以，我们需要在响应返回之前执行我们自定义的过滤器。
 * 最好的方式就是将这个常量减去 1。
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/3 4:18 下午
 */
@Slf4j
@Component
public class AccessLogFilter extends ZuulFilter {
    @Override
    public String filterType() {
        // 过滤器的类型
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        // zuul 组件默认的 response filter 的 order 是 1000（因为zuul的FilterConstants.SEND_RESPONSE_FILTER_ORDER
        // 常量就是1000），所以我们的 response 过滤器的 order要在 FilterConstants.SEND_RESPONSE_FILTER_ORDER 之前，否则不起作用。
        return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        //是否启用过滤器
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        Long startTime = (Long) ctx.get("startTime");

        HttpServletRequest request = ctx.getRequest();
        String uri = request.getRequestURI();

        long duration = System.currentTimeMillis() - startTime;

        log.info("uri： " + uri + ", duration: " + duration + "ms");

        return null;
    }
}