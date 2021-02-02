package com.example.Sales_App.DAO;

import com.example.Sales_App.Model.SalesRep;
import com.example.Sales_App.Model.SalesRepPerformance;

import javax.sql.DataSource;
import java.util.List;

public interface SalesRepPerformanceDAO {

    public void setDataSource(DataSource dataSource);

    public List<SalesRepPerformance> getSalesRepPerformanceData();
}
