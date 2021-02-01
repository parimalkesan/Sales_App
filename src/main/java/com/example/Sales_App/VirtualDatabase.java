package com.example.Sales_App;

import com.example.Sales_App.Model.SalesRep;

import java.util.ArrayList;
import java.util.List;

public class VirtualDatabase {
    private List<SalesRep> salesRepList;

    public VirtualDatabase() {
        salesRepList = new ArrayList<SalesRep>();
        salesRepList.add(new SalesRep(01, "Parimal", "India", "Darbhanga", 846004, "Male"));
        salesRepList.add(new SalesRep(02, "Abc", "Uk", "London", 123456, "Male"));
    }

    public List<SalesRep> getSalesRepList() {
        return salesRepList;
    }

    public boolean updateSalesRepList(int id,SalesRep salesRep){
        salesRepList.set(id,salesRep);
        return true;
    }

    public boolean deleteSalesRepRecord(int id)
    {
        salesRepList.remove(id);
        return true;
    }

    public boolean addSalesRepRecord(SalesRep salesRep)
    {
        salesRepList.add(salesRep);
        return true;
    }
}
