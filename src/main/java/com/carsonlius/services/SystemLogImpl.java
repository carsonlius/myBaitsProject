package com.carsonlius.services;

import com.carsonlius.dao.SystemLogDetailsDao;
import com.carsonlius.entries.SystemLogDetails;
import com.carsonlius.exceptions.ParamsErrorException;
import com.carsonlius.services.impl.SystemLogService;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author carsonlius
 */
public class SystemLogImpl implements SystemLogService {

    private  SystemLogDetailsDao systemLogDetailsDao;

    @Override
    @Transactional
    public void insertLog(){
        SystemLogDetails systemLogDetails = new SystemLogDetails();
        systemLogDetails.setData("hello world");
        systemLogDetails.setRemark("测试事务");
        String requestId = "唯一" + (new Date());
        systemLogDetails.setRequest_id(requestId);
        systemLogDetailsDao.insertSystemLogDetails(systemLogDetails);

        throw new ParamsErrorException("参数异常");
//        System.out.println("抛出异常之后的执行");
    }

    public void setSystemLogDetailsDao(SystemLogDetailsDao systemLogDetailsDao) {
        this.systemLogDetailsDao = systemLogDetailsDao;
    }

    @Override
    public SystemLogDetails selectLogs() {

        return   systemLogDetailsDao.getLogById(1, 2);
    }
}
