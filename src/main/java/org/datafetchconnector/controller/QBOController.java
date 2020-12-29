package org.datafetchconnector.controller;

import com.google.gson.Gson;
import com.intuit.ipp.core.IEntity;
import com.intuit.ipp.exception.FMSException;
import com.intuit.ipp.services.DataService;
import com.intuit.ipp.services.QueryResult;
import org.apache.commons.lang.StringUtils;
import org.datafetchconnector.dao.*;
import org.datafetchconnector.entities.*;
import org.datafetchconnector.helper.QBOServiceHelper;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.Arrays;
import java.util.List;


public class QBOController {



    public static String queryData(@PathParam("id") Integer id) throws FMSException {
        User user = new UserDao().readUser(id);
        if (StringUtils.isEmpty(user.getRealmId())) {
            try {
                System.out.println(new JSONObject().put("response", "No realm ID.  QBO calls only work if the accounting scope was passed!").toString());
            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }

        DataService service = QBOServiceHelper.getDataService(user.getRealmId(), user.getAccesToken());

        List<String> tables = Arrays.asList("customer","account","bill","budget","creditMemo");
        System.out.println("before foreach");

        for (String table : tables
        ) {
            System.out.println(table);
            System.out.println("before sql");
            String sql = "select * from " + table;
            QueryResult queryResult = service.executeQuery(sql);

            if (!queryResult.getEntities().isEmpty() && queryResult.getEntities().size() > 0) {
                List<? extends IEntity> tableList = queryResult.getEntities();
                Gson gson = new Gson();


                for (int i = 0; i <tableList.size(); i++) {
                    String target3 = gson.toJson(tableList.get(i));
                    Switch(table, target3);
                }

            }
        }
        return "Success";

    }

    private static void Switch(String table, String target3) {
        Gson gson = new Gson();
        switch (table){
            case "customer":
                Customer target4 = gson.fromJson(target3, Customer.class);
                new CustomerDao().insertNewCustomer(target4);
            case "account":
                Account account = gson.fromJson(target3, Account.class);
                new AccountDao().insertNewAccount(account);
            case "bill":
                Bill bill = gson.fromJson(target3, Bill.class);
                new BillDao().insertNewBill(bill);
            case "budget":
                Budget budget = gson.fromJson(target3, Budget.class);
                new BudgetDao().insertNewBudget(budget);
            case "creditMemo":
                CreditMemo creditMemo = gson.fromJson(target3, CreditMemo.class);
                new CreditMemoDao().insertNewCreditMemo(creditMemo);

        }
    }

}
