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
    //static VirtualDatabase vd=new VirtualDatabase();
    static ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    static SalesRepDataHandler salesRepDataHandler = (SalesRepDataHandler)context.getBean("salesRepDataHandler");

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> get(@QueryParam("offset") int offset,
                              @QueryParam("limit") int limit)
    {

        List<SalesRep> salesRepList= salesRepDataHandler.getSalesRepData(offset,limit);
        return salesRepList;
        //return vd.getSalesRepList();
    }

    @POST
    @Path("postsalesrepdata")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> post(SalesRep salesRep)
    {
        salesRepDataHandler.addSalesRep(salesRep);
        //vd.addSalesRepRecord(salesRep);
        return salesRepDataHandler.getSalesRepData(0,10);
    }

    @PUT
    @Path("putsalesrepdata")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> put(SalesRep salesRep)
    {
        salesRepDataHandler.updateSalesRep(salesRep);
        //vd.updateSalesRepList(0,salesRep);
        return salesRepDataHandler.getSalesRepData(0,10);
    }

    @DELETE
    @Path("deletesalesrepdata/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> delete(@PathParam("id") int id)
    {
        //if(vd.getSalesRepList().size()>0)
        //{
           // vd.deleteSalesRepRecord(0);
           // return "Data deleted";
        //}
        salesRepDataHandler.deleteSalesRep(id);
        return salesRepDataHandler.getSalesRepData(0,10);
    }
}