package com.john.springbootdemo.customUtils;

import com.john.springbootdemo.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author JohnZhong
 * 自定义异常处理类
 */
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        if(ex instanceof MyException){
            modelAndView.addObject("errorMsg", "你的异常被我拦截了！哈哈！");
        }else{
            modelAndView.addObject("errorMsg", ex.getMessage());
        }
        modelAndView.setViewName("/error/50x");
        return modelAndView;
    }
}
