package com.carsonlius.services.impl;

import com.carsonlius.entries.SystemLogDetails;

import java.util.List;

public interface SystemLogService {
    SystemLogDetails selectLogs();

    void insertLog();
}
