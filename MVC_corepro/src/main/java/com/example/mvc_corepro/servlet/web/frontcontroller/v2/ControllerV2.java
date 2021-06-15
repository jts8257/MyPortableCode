package com.example.mvc_corepro.servlet.web.frontcontroller.v2;

import com.example.mvc_corepro.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV2 {


    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
