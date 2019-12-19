package com.zking.ssm.mapper;

import com.zking.ssm.model.XUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface XuserMapper {

    /**
     * 根据用户表的remark进行查询所有
     * @param xUser
     * @return
     */
    List<XUser> getUserByRemark(XUser xUser);

    /**
     * 用户表和签到表联查
     * @param xUser
     * @return
     */
    List<XUser> getUserAndSing(@Param("paramMap") Map<String,Object> param);

}
