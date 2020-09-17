package com.carsonlius.dao;

import com.carsonlius.entries.SystemLogDetails;

import java.util.List;

public interface SystemLogDetailsDao {
    public List<SystemLogDetails> selectSystemLogDetails();

    public int insertSystemLogDetails(SystemLogDetails systemLogDetails);
}
