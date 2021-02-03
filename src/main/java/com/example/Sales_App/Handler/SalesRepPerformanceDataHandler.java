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
    public List<SalesRepPerformance> getSalesRepPerformanceData(String product,int month) {
        String SQL="SELECT salesrep_name,SUM(price) as price FROM historicalsales INNER JOIN salesrepdetails " +
                "ON historicalsales.salesrep_id=salesrepdetails.salesrep_id WHERE historicalsales.product_name=? "+
                "AND EXTRACT(MONTH FROM historicalsales.date)=? GROUP BY salesrepdetails.salesrep_name,historicalsales.salesrep_id ORDER BY price DESC LIMIT 3;";
        SalesRepPerformanceMapper salesRepPerformanceMapper=new SalesRepPerformanceMapper();
        List<SalesRepPerformance> sRepPerformanceList= salesRepPerformanceTemplate.query(SQL,salesRepPerformanceMapper,product,month);
        return sRepPerformanceList;
    }
}
