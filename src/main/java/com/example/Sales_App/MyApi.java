package com.example.Sales_App;

import com.example.Sales_App.DAO.SalesRepJDBCTemplate;
import com.example.Sales_App.Model.SalesRep;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("MyApi")
public class MyApi {
    static VirtualDatabase vd=new VirtualDatabase();
    static ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    static SalesRepJDBCTemplate salesRepJDBCTemplate = (SalesRepJDBCTemplate)context.getBean("salesRepJDBCTemplate");

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SalesRep> get()
    {
        List<SalesRep> salesRepList=salesRepJDBCTemplate.getSalesRepData();
        return salesRepList;
        //return vd.getSalesRepList();
    }

    @POST
    @Path("post salesRep")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public SalesRep post(SalesRep salesRep)
    {
        salesRepJDBCTemplate.addSalesRep(salesRep);
        //vd.addSalesRepRecord(salesRep);
        return salesRep;
    }

    @PUT
    @Path("put salesRep")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public SalesRep put(SalesRep salesRep)
    {
        salesRepJDBCTemplate.updateSalesRep(salesRep);
        //vd.updateSalesRepList(0,salesRep);
        return salesRep;
    }

    @DELETE
    @Path("salesRep/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String delete(@PathParam("id") int id)
    {
        //if(vd.getSalesRepList().size()>0)
        //{
           // vd.deleteSalesRepRecord(0);
           // return "Data deleted";
        //}
        salesRepJDBCTemplate.deleteSalesRep(id);
        return "Data deleted";
    }
}