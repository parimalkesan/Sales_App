package com.example.Sales_App;

import com.example.Sales_App.Model.SalesRep;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("MyApi")
public class SalesRepDataController {
    static VirtualDatabase vd=new VirtualDatabase();
    static ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    static SalesRepDataHandler salesRepJDBCTemplate = (SalesRepDataHandler)context.getBean("salesRepJDBCTemplate");
    //static SalesRepDAO salesRepJDBCTemplate=context.getBean("salesRepDao",SalesRepDAO.class);
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> get()
    {
        List<SalesRep> salesRepList=salesRepJDBCTemplate.getSalesRepData();
        return salesRepList;
        //return vd.getSalesRepList();
    }

    @POST
    @Path("postdata")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> post()
    {
        SalesRep salesRep=new SalesRep(123,"abc","UK","london",1234,"Male");
        salesRepJDBCTemplate.addSalesRep(salesRep);
        //vd.addSalesRepRecord(salesRep);
        return salesRepJDBCTemplate.getSalesRepData();
    }

    @PUT
    @Path("putdata")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> put()
    {
        SalesRep salesRep=new SalesRep(143,"abcde","UK","london",1234,"Male");
        salesRepJDBCTemplate.updateSalesRep(salesRep);
        //vd.updateSalesRepList(0,salesRep);
        return salesRepJDBCTemplate.getSalesRepData();
    }

    @DELETE
    @Path("deletedata/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> delete(@PathParam("id") int id)
    {
        //if(vd.getSalesRepList().size()>0)
        //{
           // vd.deleteSalesRepRecord(0);
           // return "Data deleted";
        //}
        salesRepJDBCTemplate.deleteSalesRep(id);
        return salesRepJDBCTemplate.getSalesRepData();
    }
}