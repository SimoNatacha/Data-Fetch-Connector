package org.datafetchconnector;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

public class Schedule {

    private static volatile Schedule queueInstance;
    private Schedule(){}

    public static Schedule getInstance(){
        if(queueInstance == null){
            queueInstance = new Schedule();
        }
        return queueInstance;
    }


    public static Scheduler setUp() throws SchedulerException {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        return scheduler;
    }
}
