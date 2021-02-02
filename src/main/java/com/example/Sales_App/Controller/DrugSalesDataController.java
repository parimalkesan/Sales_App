package com.example.Sales_App.Controller;

import com.example.Sales_App.Handler.DrugSalesDataHandler;
import com.example.Sales_App.Handler.SalesRepPerformanceDataHandler;
import com.example.Sales_App.Model.DrugSales;
import com.example.Sales_App.Model.SalesRepPerformance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("drugsalesdata")
public class DrugSalesDataController {
    static ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    static DrugSalesDataHandler drugSalesDataHandler =(DrugSalesDataHandler) context.getBean("drugSalesDataHandler");

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DrugSales> get()
    {

        List<DrugSales> drugSalesList= drugSalesDataHandler.getDrugData();
        return drugSalesList;
        //return vd.getSalesRepList();
    }
}
