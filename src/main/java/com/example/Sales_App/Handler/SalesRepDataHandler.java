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
    public List<SalesRep> getSalesRepData(int offset,int limit,String searchCriteria) {
        if(searchCriteria==null) {
            String SQL = "Select * from salesrepdetails offset ? limit ?;";
            List<SalesRep> salesRepList = salesRepTemplate.query(SQL, new SalesRepMapper(), offset, limit);
            return salesRepList;
        }
        String SQL = "Select * from salesrepdetails where salesrep_name ILIKE ?"+" offset ? limit ?;";
        List<SalesRep> salesRepList=salesRepTemplate.query(SQL,new SalesRepMapper(),searchCriteria+"%",offset,limit);
        return salesRepList;
    }

    @Override
    public void addSalesRep(SalesRep salesRep) {
        String SQL="Insert into salesrepdetails values(?,?,?,?,?,?);";
        int s= salesRepTemplate.update(SQL,salesRep.getSalesRepId(),salesRep.getSalesRepName(),salesRep.getCountry(),salesRep.getCity(),salesRep.getPinCode(),salesRep.getGender());
    }

    @Override
    public void updateSalesRep(SalesRep salesRep) {
        String SQL="Update salesrepdetails set salesrep_name=?,country=?,city=?,pincode=?,gender=? where salesrep_id=?";
        int s= salesRepTemplate.update(SQL,salesRep.getSalesRepName(),salesRep.getCountry(),salesRep.getCity(),salesRep.getPinCode(),salesRep.getGender(),salesRep.getSalesRepId());
    }

    @Override
    public void deleteSalesRep(int id) {
        String sql="Delete from salesrepdetails where salesrep_id=?";

        int res= salesRepTemplate.update(sql,id);
    }
}
