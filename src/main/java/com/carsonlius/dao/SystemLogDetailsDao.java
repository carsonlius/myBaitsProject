package com.carsonlius.dao;

import com.carsonlius.entries.SystemLogDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemLogDetailsDao {
    public List<SystemLogDetails> selectSystemLogDetails();

    public int insertSystemLogDetails(SystemLogDetails systemLogDetails);

    public SystemLogDetails getLogById(@Param("recId") Integer recId,@Param("recId2") Integer  recId2);
}
