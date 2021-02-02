package com.example.Sales_App.Handler;

import com.example.Sales_App.DAO.SalesRepDAO;
import com.example.Sales_App.DAO.SalesRepMapper;
import com.example.Sales_App.Model.SalesRep;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class SalesRepDataHandler implements SalesRepDAO {
    private JdbcTemplate salesRepTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.salesRepTemplate =new JdbcTemplate(dataSource);
    }

    @Override
    public List<SalesRep> getSalesRepData() {
        String SQL="Select * from salesrepdata;";
        List<SalesRep> sRepList= salesRepTemplate.query(SQL,new SalesRepMapper());
        return sRepList;
    }

    @Override
    public void addSalesRep(SalesRep salesRep) {
        String SQL="Insert into salesrepdata values(?,?,?,?,?,?);";
        int s= salesRepTemplate.update(SQL,salesRep.getId(),salesRep.getName(),salesRep.getCountry(),salesRep.getCity(),salesRep.getZipCode(),salesRep.getGender());
        System.out.println(s+" rows added");
    }

    @Override
    public void updateSalesRep(SalesRep salesRep) {
        String SQL="Update salesrepdata set name=?,country=?,city=?,zipcode=?,gender=? where id=?";
        //String SQL="Insert into salesrepdata values(?,?,?,?,?,?)";
        int s= salesRepTemplate.update(SQL,salesRep.getName(),salesRep.getCountry(),salesRep.getCity(),salesRep.getZipCode(),salesRep.getGender(),salesRep.getId());
        System.out.println(s+" rows added");
    }

    @Override
    public void deleteSalesRep(int id) {
        String sql="Delete from salesrepdata where id=?";

        int res= salesRepTemplate.update(sql,id);
        System.out.println(res+" rows deleted");
    }
}