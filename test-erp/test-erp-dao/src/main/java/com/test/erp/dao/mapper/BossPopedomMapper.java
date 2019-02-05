package com.test.erp.dao.mapper;



import com.test.erp.dao.model.BossPopedom;
import com.test.erp.dao.model.BossPopedomExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface BossPopedomMapper  {
    long countByExample(BossPopedomExample example);

    int deleteByExample(BossPopedomExample example);

    int deleteByPrimaryKey(String id);

    int insertSelective(BossPopedom record);

    List<BossPopedom> selectByExample(BossPopedomExample example);

    BossPopedom selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BossPopedom record, @Param("example") BossPopedomExample example);

    int updateByExample(@Param("record") BossPopedom record, @Param("example") BossPopedomExample example);

    int updateByPrimaryKeySelective(BossPopedom record);

    int updateByPrimaryKey(BossPopedom record);

    List<BossPopedom> selectSecondList(HashMap<String, Object> map);
}