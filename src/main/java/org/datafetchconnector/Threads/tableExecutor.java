package org.datafetchconnector.Threads;

import com.google.gson.Gson;
import com.intuit.ipp.core.IEntity;
import com.intuit.ipp.exception.FMSException;
import com.intuit.ipp.services.DataService;
import com.intuit.ipp.services.QueryResult;
import org.datafetchconnector.controller.QBOController;
import org.datafetchconnector.entities.User;
import org.datafetchconnector.helper.QBOServiceHelper;
import org.quartz.SchedulerException;

import java.util.List;
import java.util.concurrent.Callable;

public class tableExecutor implements Callable {

    User user;
    private String table;

    public tableExecutor( String table, User user) {

        this.user = user;
        this.table = table;

    }


    @Override
    public Object call() throws Exception {

        try {
            DataService service = QBOServiceHelper.getDataService(user.getRealmId(), user.getAccesToken());
            QueryResult queryResult = service.executeQuery("select * from " + table);

            if (!queryResult.getEntities().isEmpty() && queryResult.getEntities().size() > 0) {
                List<? extends IEntity> tableList = queryResult.getEntities();
                Gson gson = new Gson();

                for (int i = 0; i < tableList.size(); i++) {
                    String dataString = gson.toJson(tableList.get(i));
                    QBOController.Switch(table, dataString, user);
                }

            }
        } catch (FMSException | SchedulerException e) {
            e.printStackTrace();
        }
        return table;
    }
}