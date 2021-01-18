package org.datafetchconnector.Threads;

import org.datafetchconnector.entities.User;
import org.datafetchconnector.scheduler.DbWriter;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyJob implements Job {
    ExecutorService tableExecutor = Executors.newFixedThreadPool(2);

    List<Future> futures = new ArrayList<>();

    public  void pull(User user) {
        List<String> tables = new ArrayList<>(Arrays.asList("account", "payment", "vendor", "vendorCredit", "budget", "customer", "bill", "salesReceipt", "paymentMethod", "creditMemo", "employee", "invoice"));


        for (String table : tables
        ) {
            if (!(table ==null)){
                futures.add(tableExecutor.submit(new tableExecutor(table, user)));
            }else {
                System.out.println("table is null");
            }
        }

        for (Future<Object> future : futures) {
            try {
                future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }


               new DbWriter().DbWrite();


    }


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Inside Execute of MyJOB");

        User user = (User) jobExecutionContext.getJobDetail().getJobDataMap().get("user");

        pull(user);


    }
}
