package com.zking.ssm.mapper;

import com.zking.ssm.model.XNotice;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 通知管理
 */
public interface XnoticeMapper {

    /**
     * 添加通知
     * @return
     */
    int addXNotice(XNotice xNotice);

    /**
     * 获取所有的通知
     * @return
     */
    List<XNotice> getXNotice(XNotice xNotice);

    /**
     * 修改 xnotice
     * @param xNotice
     * @return
     */
    int updateXNotice (XNotice xNotice);

    /**
     *  删除
     * @param xNotice
     * @return
     */
    int delXNotice (XNotice xNotice);





}
