package com.zking.ssm.mapper;


import com.zking.ssm.model.XDictEntity;

import java.util.List;

public interface DictMapper {

    /**
     * 添加字典信息
     * @param record
     * @return
     */
    int insert(XDictEntity record);


    List<XDictEntity> queryDictPager(XDictEntity dict);

    /**
     * 查询
     * @param dict
     * @return
     */
    List<XDictEntity> Sdict(XDictEntity dict);

    /**
     * 修改字典信息
     * @param dict
     * @return
     */
    int updateDict(XDictEntity dict);

    /**
     * 删除字典信息
     * @param dict
     * @return
     */
    int deleteDict(XDictEntity dict);
}
