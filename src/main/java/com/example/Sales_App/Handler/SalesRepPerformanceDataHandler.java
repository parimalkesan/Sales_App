package com.example.Sales_App.Handler;

import com.example.Sales_App.DAO.SalesRepMapper;
import com.example.Sales_App.DAO.SalesRepPerformanceDAO;
import com.example.Sales_App.DAO.SalesRepPerformanceMapper;
import com.example.Sales_App.Model.SalesRep;
import com.example.Sales_App.Model.SalesRepPerformance;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class SalesRepPerformanceDataHandler implements SalesRepPerformanceDAO{
    private JdbcTemplate salesRepPerformanceTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.salesRepPerformanceTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public List<SalesRepPerformance> getSalesRepPerformanceData() {
        String SQL="Select * from salesrepperformancedata;";
        List<SalesRepPerformance> sRepPerformanceList= salesRepPerformanceTemplate.query(SQL,new SalesRepPerformanceMapper());
        return sRepPerformanceList;
    }
}
