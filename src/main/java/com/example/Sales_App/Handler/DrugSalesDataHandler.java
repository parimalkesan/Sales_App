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
    public List<DrugSales> getDrugData() {
        String SQL="Select * from drugsalesdata;";
        List<DrugSales> drugSalesDataList= drugSalesDataTemplate.query(SQL,new DrugSalesMapper());
        return drugSalesDataList;
    }
}
