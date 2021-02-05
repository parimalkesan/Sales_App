package com.example.Sales_App.Controller;

import com.example.Sales_App.Model.SalesRep;
import com.example.Sales_App.Handler.SalesRepDataHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("salesrepdata")
public class SalesRepDataController {
    static ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    static SalesRepDataHandler salesRepDataHandler = (SalesRepDataHandler)context.getBean("salesRepDataHandler");

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> get(@QueryParam("offset") int offset,
                              @QueryParam("limit") int limit,
                              @QueryParam("searchCriteria") String searchCriteria)
    {

        List<SalesRep> salesRepList= salesRepDataHandler.getSalesRepData(offset,limit,searchCriteria);
        return salesRepList;
    }

    @POST
    @Path("postsalesrepdata")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> post(SalesRep salesRep)
    {
        salesRepDataHandler.addSalesRep(salesRep);
        return salesRepDataHandler.getSalesRepData(0,10,"");
    }

    @PUT
    @Path("putsalesrepdata")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> put(SalesRep salesRep)
    {
        salesRepDataHandler.updateSalesRep(salesRep);
        return salesRepDataHandler.getSalesRepData(0,10,"");
    }

    @DELETE
    @Path("deletesalesrepdata/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> delete(@PathParam("id") int id)
    {
        salesRepDataHandler.deleteSalesRep(id);
        return salesRepDataHandler.getSalesRepData(0,10,"");
    }
}