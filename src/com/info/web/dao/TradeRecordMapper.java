package com.info.web.dao;

import com.info.web.pojo.TradeRecord;

public interface TradeRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TradeRecord record);

    int insertSelective(TradeRecord record);

    TradeRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeRecord record);

    int updateByPrimaryKey(TradeRecord record);
}