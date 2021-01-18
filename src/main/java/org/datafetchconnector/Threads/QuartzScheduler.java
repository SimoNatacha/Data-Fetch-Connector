package org.datafetchconnector.Threads;

import org.datafetchconnector.Schedule;
import org.datafetchconnector.entities.User;
import org.quartz.*;

public class QuartzScheduler {
    public static Schedule scheduler = Schedule.getInstance();

    public void fireJob(User user, Class MyJob) throws SchedulerException {
        //define the job and tie it to our MyJob class
        JobBuilder jobBuilder = JobBuilder.newJob(MyJob);
        JobDataMap data = new JobDataMap();

        data.put("user", user);

        JobDetail jobDetail = jobBuilder.usingJobData(data)
                .withIdentity("myJob" + user.getId(), "InitiatePulling")
                .build();

        // Trigger the job to run now and then ever
        Trigger trigger =
                TriggerBuilder.newTrigger().withIdentity("myTrigger").startNow()
                        .build();

        // Tell the quartz to schedule the job using trigger
        scheduler.setUp().scheduleJob(jobDetail, trigger);

    }
}
