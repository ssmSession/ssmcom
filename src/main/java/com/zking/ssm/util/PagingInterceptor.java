package com.zking.ssm.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 环绕通知处理分页
 *
 * @author Administrator
 * @create 2019-11-0915:11
 */
@Component
@Aspect
public class PagingInterceptor {
    @Around(value = "execution(* *..*Services.*Page(..))")
    public Object paging(ProceedingJoinPoint point) throws Throwable {
        Object[] args = point.getArgs();
        PageBean pageBean = getPageBean(args);

        if (pageBean != null && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        Object lst = point.proceed();
        if (pageBean != null && pageBean.isPagination() && lst != null) {
            PageInfo pageInfo = new PageInfo((List) lst);
            pageBean.setTotal(Long.valueOf(pageInfo.getTotal()).intValue());
        }
        return lst;
    }
    //获取pagebean对象
    private PageBean getPageBean(Object[] args) {
        PageBean pageBean = null;
        for (Object arg : args) {
            if (arg instanceof PageBean) {
                pageBean = (PageBean) arg;
            }
        }
        return pageBean;
    }

}
