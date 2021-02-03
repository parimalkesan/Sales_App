package com.example.Sales_App.Controller;

import com.example.Sales_App.Handler.SalesRepDataHandler;
import com.example.Sales_App.Handler.SalesRepPerformanceDataHandler;
import com.example.Sales_App.Model.SalesRep;
import com.example.Sales_App.Model.SalesRepPerformance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("salesrepperformancedata")
public class SalesRepPerformanceDataController
{
    static ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    static SalesRepPerformanceDataHandler salesRepPerformanceDataHandler =(SalesRepPerformanceDataHandler)context.getBean("salesRepPerformanceDataHandler");

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRepPerformance> get(@QueryParam("product") String product,
                                         @QueryParam("month") int month)
    {

        List<SalesRepPerformance> salesRepPerformanceList= salesRepPerformanceDataHandler.getSalesRepPerformanceData(product,month);
        return salesRepPerformanceList;
        //return vd.getSalesRepList();
    }
}
