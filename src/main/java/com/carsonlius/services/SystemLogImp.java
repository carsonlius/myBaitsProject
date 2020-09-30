package com.carsonlius.services;

import com.carsonlius.dao.SystemLogDetailsDao;
import com.carsonlius.entries.SystemLogDetails;
import com.carsonlius.services.impl.SystemLogService;

import java.util.List;

public class SystemLogImp implements SystemLogService {

    private  SystemLogDetailsDao systemLogDetailsDao;

    public void setSystemLogDetailsDao(SystemLogDetailsDao systemLogDetailsDao) {
        this.systemLogDetailsDao = systemLogDetailsDao;
    }

    @Override
    public SystemLogDetails selectLogs() {

        return   systemLogDetailsDao.getLogById(1, 2);
    }
}
