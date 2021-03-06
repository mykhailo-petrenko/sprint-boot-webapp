package com.luxoft.mapetrenko.sboot.controller;

import com.luxoft.mapetrenko.sboot.utils.RestException;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionHandlerController {
    private static final Logger LOG = Logger.getLogger(ExceptionHandlerController.class);

    @ExceptionHandler(RestException.class)
    public @ResponseBody String handleException(RestException e) {
        LOG.error(e.getMessage());
        return e.getMessage();
    }

}
