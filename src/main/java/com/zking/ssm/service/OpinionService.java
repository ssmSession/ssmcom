package com.zking.ssm.service;


import com.zking.ssm.model.XOpinionEntity;
import com.zking.ssm.util.PageBean;

import java.util.List;
import java.util.Map;

public interface OpinionService {
    /**
     * 添加民意信息
     * @param xOpinionEntity
     * @return
     */
    int insert(XOpinionEntity xOpinionEntity);

    /**
     *查询全部民意信息
     * @param xOpinionEntity
     * @return
     */
    List<XOpinionEntity> queryOpinionPager(XOpinionEntity xOpinionEntity, PageBean pageBean);

    /**
     * 修改id民意信息
     * @param xOpinionEntity
     * @return
     */
    int updateOpinion(XOpinionEntity xOpinionEntity);

    /**
     * 根据删除
     * @param xOpinionEntity
     * @return
     */
    int deleteOpinion(XOpinionEntity xOpinionEntity);


    /**
     *根据标题修改
     * @param xOpinionEntity
     * @return
     */
    int updateOpinions(XOpinionEntity xOpinionEntity);


    /**
     * 查询
     * @param xOpinionEntity
     * @return
     */
    List<Map<String,Object>> queryTj(XOpinionEntity xOpinionEntity);

    /**
     * 查询
     * @param xOpinionEntity
     * @return
     */
    List<Map<String,Object>> queryTo(XOpinionEntity xOpinionEntity);

    /**
     * 查询
     * @param xOpinionEntity
     * @return
     */
    List<Map<String,Object>> queryTH(XOpinionEntity xOpinionEntity);

    /**
     * 修改
     * @param xOpinionEntity
     * @return
     */
    int updateTp(XOpinionEntity xOpinionEntity);

    /**
     * 查询
     * @param xOpinionEntity
     * @return
     */
    List<XOpinionEntity> queryOpinion(XOpinionEntity xOpinionEntity);

}
