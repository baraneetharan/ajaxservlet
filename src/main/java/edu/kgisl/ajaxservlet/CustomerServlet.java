package edu.kgisl.ajaxservlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<Customer>();

        Customer c1 = new Customer();
        c1.setCustomerid(1);
        c1.setCustomername("customername1");

        Customer c2 = new Customer();
        c2.setCustomerid(2);
        c2.setCustomername("customername2");

        Customer c3 = new Customer();
        c3.setCustomerid(3);
        c3.setCustomername("customername3");

        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);

        String customerJson = new Gson().toJson(customerList);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(customerJson);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestData = req.getReader().lines().collect(Collectors.joining());
        System.out.println("requestData Length->" + requestData.length());
        System.out.println("requestData->" + requestData);
        
    }

}
