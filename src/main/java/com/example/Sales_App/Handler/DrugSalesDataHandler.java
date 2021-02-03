package com.example.Sales_App.Handler;

import com.example.Sales_App.DAO.DrugSalesDAO;
import com.example.Sales_App.DAO.DrugSalesMapper;
import com.example.Sales_App.DAO.SalesRepPerformanceMapper;
import com.example.Sales_App.Model.DrugSales;
import com.example.Sales_App.Model.SalesRepPerformance;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class DrugSalesDataHandler implements DrugSalesDAO {
    private JdbcTemplate drugSalesDataTemplate;
    @Override
    public void setDataSource(DataSource dataSource) {
        this.drugSalesDataTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public List<DrugSales> getDrugSalesData(String city) {
        String SQL="SELECT product_name,SUM(price) as price FROM historicalsales INNER JOIN salesrepdetails "+
                "ON historicalsales.salesrep_id=salesrepdetails.salesrep_id WHERE city=? AND EXTRACT(MONTH FROM date)="+
                "EXTRACT(MONTH FROM CURRENT_DATE) GROUP BY product_id,product_name ORDER BY price DESC LIMIT 3";
        List<DrugSales> drugSalesDataList= drugSalesDataTemplate.query(SQL,new DrugSalesMapper(),city);
        return drugSalesDataList;
    }
}
