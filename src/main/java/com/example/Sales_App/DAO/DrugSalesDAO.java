package com.example.Sales_App.DAO;

import com.example.Sales_App.Model.DrugSales;

import javax.sql.DataSource;
import java.util.List;

public interface DrugSalesDAO {

    public void setDataSource(DataSource dataSource);
    public List<DrugSales> getDrugSalesData(String city);
}
