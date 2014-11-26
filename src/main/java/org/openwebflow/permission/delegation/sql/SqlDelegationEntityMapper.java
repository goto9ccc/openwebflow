package org.openwebflow.permission.delegation.sql;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface SqlDelegationEntityMapper
{
	@Select("SELECT * FROM DELEGATION_TAB where DELEGATED=#{delegated}")
	@Results(value = { @Result(property = "opTime", column = "OP_TIME") })
	List<SqlDelegationEntity> findByDelegated(@Param("delegated")
	String delegated);
}