package com.example.convert_money.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class ConvertController implements org.springframework.web.servlet.mvc.Controller {

    private static final Log logger = LogFactory.getLog(ConvertController.class);
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("ConvertController called");
        return new ModelAndView("convert");
    }
}
