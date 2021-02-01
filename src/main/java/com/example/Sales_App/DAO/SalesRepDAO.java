package com.example.Sales_App.DAO;

import com.example.Sales_App.Model.SalesRep;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface SalesRepDAO {

    public void setDataSource(DataSource dataSource);

    public List<SalesRep> getSalesRepData();
    public void addSalesRep(SalesRep salesRep);
    public void updateSalesRep(SalesRep salesRep);
    public void deleteSalesRep(int id);

}
