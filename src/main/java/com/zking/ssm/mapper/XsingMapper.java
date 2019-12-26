package com.zking.ssm.mapper;

import com.zking.ssm.model.XSing;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface XsingMapper {

    /**
     * 用户表和签到表进行联查
     * @param map
     * @return
     */
    List<XSing> getUserAndSing(@Param("param") Map<String,Object> map);

}
