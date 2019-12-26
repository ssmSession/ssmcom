package com.zking.ssm.mapper;

import com.zking.ssm.model.XAdvice;
import com.zking.ssm.model.XDict;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface XadviceMapper {

    /**
     * 根据回复情况，标题查询，查询所有
     * @param param
     * @return
     */
    List<XAdvice> selectAdvice( Map param);

    /**
     * 删除建议
     * @param xAdvice
     * @return
     */
    int delAdvice(XAdvice xAdvice);

    int updateAdvice(XAdvice xAdvice);

}
