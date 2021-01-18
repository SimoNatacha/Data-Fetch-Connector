package org.datafetchconnector.scheduler;

import org.datafetchconnector.dao.TablesDb;

public class QueueWriter implements Runnable {
    Object object;
    private TablesDb doa = new TablesDb();
    public QueueWriter(Object object) {
        this.object = object;
    }


    @Override
    public void run() {
        synchronized (doa){
            doa.saveObject(object);
        }

    }
}
