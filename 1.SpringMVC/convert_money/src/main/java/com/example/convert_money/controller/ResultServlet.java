package com.example.convert_money.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResultServlet implements Controller {
    private static final Log logger = LogFactory.getLog(ResultServlet.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("SaveProductController called");
        Double USD = Double.parseDouble(request.getParameter("USD"));
        Double Rate = Double.parseDouble(request.getParameter("rate"));
        Double VND = USD * Rate;
        return new ModelAndView("result", "VND", VND);

    }
}
