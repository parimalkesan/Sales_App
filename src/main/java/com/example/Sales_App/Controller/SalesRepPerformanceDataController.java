package com.example.Sales_App.Controller;

import com.example.Sales_App.Handler.SalesRepDataHandler;
import com.example.Sales_App.Handler.SalesRepPerformanceDataHandler;
import com.example.Sales_App.Model.SalesRep;
import com.example.Sales_App.Model.SalesRepPerformance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("salesrepperformancedata")
public class SalesRepPerformanceDataController
{
    static ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    static SalesRepPerformanceDataHandler salesRepPerformanceDataHandler =(SalesRepPerformanceDataHandler)context.getBean("salesRepPerformanceDataHandler");

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRepPerformance> get()
    {

        List<SalesRepPerformance> salesRepPerformanceList= salesRepPerformanceDataHandler.getSalesRepPerformanceData();
        return salesRepPerformanceList;
        //return vd.getSalesRepList();
    }
}
