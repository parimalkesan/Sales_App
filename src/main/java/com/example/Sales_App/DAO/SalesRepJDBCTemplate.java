package com.example.Sales_App.DAO;

import com.example.Sales_App.Model.SalesRep;
import com.example.Sales_App.SalesRepMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class SalesRepJDBCTemplate implements SalesRepDAO{
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public List<SalesRep> getSalesRepData() {
        String SQL="select * from SalesRepData";
        List<SalesRep> sRepList=jdbcTemplate.query(SQL,new SalesRepMapper());
        return sRepList;
    }

    @Override
    public void addSalesRep(SalesRep salesRep) {
        String SQL="insert into SalesRepData values(?,?,?,?,?,?)";
        int s=jdbcTemplate.update(SQL,salesRep.getId(),salesRep.getName(),salesRep.getCountry(),salesRep.getCity(),salesRep.getZipCode(),salesRep.getGender());
        System.out.println(s+" rows added");
    }

    @Override
    public void updateSalesRep(SalesRep salesRep) {
        String SQL="insert into SalesRepData values(?,?,?,?,?,?)";
        int s=jdbcTemplate.update(SQL,salesRep.getId(),salesRep.getName(),salesRep.getCountry(),salesRep.getCity(),salesRep.getZipCode(),salesRep.getGender());
        System.out.println(s+" rows added");
    }

    @Override
    public void deleteSalesRep(int id) {
        String sql="delete from SalesRepRecord where Id=?";

        int res=jdbcTemplate.update(sql,id);
        System.out.println(res+" rows deleted");
    }
}
