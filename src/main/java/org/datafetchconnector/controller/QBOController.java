package org.datafetchconnector.controller;

import com.google.gson.Gson;
import org.datafetchconnector.entities.*;
import org.datafetchconnector.schema.Queue;
import org.quartz.SchedulerException;


public class QBOController {

    public static void Switch(String table, String dataString, User user) throws SchedulerException {
        Queue queue = Queue.getInstance();
        Gson gson = new Gson();

    CompositeKey compositeKey= new CompositeKey();
    compositeKey.setUser_id(user.getId());
    switch (table) {
            case "customer":
                Customer customer = gson.fromJson(dataString, Customer.class);

                compositeKey.setId(customer.getId());
                customer.setUser(user);

                customer.setCompositeKey(compositeKey);

                queue.enqueue(customer);
                break;
            case "account":
                Account account = gson.fromJson(dataString, Account.class);
                compositeKey.setId(account.getId());
                account.setUser(user);
                account.setCompositeKey(compositeKey);
                queue.enqueue(account);
                break;
            case "bill":
                Bill bill = gson.fromJson(dataString, Bill.class);
                compositeKey.setId(bill.getId());
                bill.setUser(user);
                bill.setCompositeKey(compositeKey);
                queue.enqueue(bill);
                break;
            case "vendor":
                Vendor vendor = gson.fromJson(dataString, Vendor.class);
                compositeKey.setId(vendor.getId());
                vendor.setUser(user);
                vendor.setCompositeKey(compositeKey);
                queue.enqueue(vendor);
                break;
            case "payment":
                Payment payment = gson.fromJson(dataString, Payment.class);
                compositeKey.setId(payment.getId());
                payment.setUser(user);
                payment.setCompositeKey(compositeKey);
                queue.enqueue(payment);
                break;
            case "salesReceipts":
                SalesReceipts salesReceipts = gson.fromJson(dataString, SalesReceipts.class);

                compositeKey.setId(salesReceipts.getId());
                salesReceipts.setUser(user);

                salesReceipts.setCompositeKey(compositeKey);

                queue.enqueue(salesReceipts);
                break;
             case "creditMemo":
                CreditMemo creditMemo = gson.fromJson(dataString, CreditMemo.class);
                compositeKey.setId(creditMemo.getId());
                creditMemo.setUser(user);
                creditMemo.setCompositeKey(compositeKey);
                queue.enqueue(creditMemo);
                break;
             case "employee":
                Employee employee = gson.fromJson(dataString, Employee.class);
                compositeKey.setId(employee.getId());
                employee.setUser(user);
                employee.setCompositeKey(compositeKey);
                queue.enqueue(employee);
                break;
            case "invoice":
                Invoice invoice = gson.fromJson(dataString, Invoice.class);
                compositeKey.setId(invoice.getId());
                invoice.setUser(user);
                invoice.setCompositeKey(compositeKey);
                queue.enqueue(invoice);
                break;
             case "paymentMethod":
                PaymentMethods paymentMethods = gson.fromJson(dataString, PaymentMethods.class);
                compositeKey.setId(paymentMethods.getId());
                paymentMethods.setUser(user);
                paymentMethods.setCompositeKey(compositeKey);
                queue.enqueue(paymentMethods);
                break;
            case "vendorCredit":
                VendorCredit vendorCredit = gson.fromJson(dataString, VendorCredit.class);
                compositeKey.setId(vendorCredit.getId());
                vendorCredit.setUser(user);
                vendorCredit.setCompositeKey(compositeKey);
                queue.enqueue(vendorCredit);
                break;
            case "budget":
                Budget budget = gson.fromJson(dataString, Budget.class);
                compositeKey.setId(budget.getId());
                budget.setUser(user);
                budget.setCompositeKey(compositeKey);
                queue.enqueue(budget);
                break;

        }

    }


}
