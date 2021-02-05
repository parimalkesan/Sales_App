package com.example.Sales_App.DAO;

import com.example.Sales_App.Model.SalesRep;

import javax.sql.DataSource;
import java.util.List;

public interface SalesRepDAO {

    public void setDataSource(DataSource dataSource);

    public List<SalesRep> getSalesRepData(int offset,int limit,String searchCriteria);
    public void addSalesRep(SalesRep salesRep);
    public void updateSalesRep(SalesRep salesRep);
    public void deleteSalesRep(int id);

}
