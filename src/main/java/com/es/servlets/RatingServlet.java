package com.es.servlets;

import com.es.model.RatingCalculator;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/rating")
public class RatingServlet extends HttpServlet {
    @EJB
    private RatingCalculator ratingCalculator;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] params = request.getParameterValues("marks");

        List<Double> marks = Arrays.stream(params).map(Double::parseDouble).collect(Collectors.toList());

        request.setAttribute("result", ratingCalculator.getRating(marks));
        request.getRequestDispatcher("/WEB-INF/pages/result.jsp").forward(request, response);
    }
}
