package com.example.Sales_App.Controller;

import com.example.Sales_App.Handler.DrugSalesDataHandler;
import com.example.Sales_App.Model.DrugSales;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("drugsalesdata")
public class DrugSalesDataController {
    static ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    static DrugSalesDataHandler drugSalesDataHandler =(DrugSalesDataHandler) context.getBean("drugSalesDataHandler");

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DrugSales> get(@QueryParam("city") String city)
    {

        List<DrugSales> drugSalesList= drugSalesDataHandler.getDrugSalesData(city);
        return drugSalesList;
        //return vd.getSalesRepList();
    }
}
