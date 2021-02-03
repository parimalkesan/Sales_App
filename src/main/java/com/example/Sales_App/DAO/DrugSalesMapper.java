package com.example.Sales_App.DAO;

import com.example.Sales_App.Model.DrugSales;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DrugSalesMapper implements RowMapper<DrugSales> {
    @Override
    public DrugSales mapRow(ResultSet resultSet, int rowNo) throws SQLException {
        DrugSales drug=new DrugSales();
        drug.setDrugName(resultSet.getString("product_name"));
        drug.setDrugSales(resultSet.getInt("price"));
        return drug;
    }
}
