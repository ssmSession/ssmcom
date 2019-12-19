package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.OpinionMapper;
import com.zking.ssm.model.XOpinionEntity;
import com.zking.ssm.service.OpinionService;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Transactional
@Service
public class OpinionServiceImpl implements OpinionService {

    @Resource
    private OpinionMapper opinionMapper;

    @Override
    public int insert(XOpinionEntity xOpinionEntity) {
        return opinionMapper.insert(xOpinionEntity);
    }

    @Override
    public List<XOpinionEntity> queryOpinionPager(XOpinionEntity xOpinionEntity, PageBean pageBean) {
        return opinionMapper.queryOpinionPager(xOpinionEntity);
    }

    @Override
    public int updateOpinion(XOpinionEntity xOpinionEntity) {
        return opinionMapper.updateOpinion(xOpinionEntity);
    }

    @Override
    public int deleteOpinion(XOpinionEntity xOpinionEntity) {

        return opinionMapper.deleteOpinion(xOpinionEntity);
    }

    @Override
    public int updateOpinions(XOpinionEntity xOpinionEntity) {
        return opinionMapper.updateOpinions(xOpinionEntity);
    }

    @Override
    public List<Map<String, Object>> queryTj(XOpinionEntity xOpinionEntity) {

        return opinionMapper.queryTj(xOpinionEntity);
    }

    @Override
    public List<Map<String, Object>> queryTo(XOpinionEntity xOpinionEntity) {

        return opinionMapper.queryTo(xOpinionEntity);
    }

    @Override
    public List<Map<String, Object>> queryTH(XOpinionEntity xOpinionEntity) {
        return opinionMapper.queryTH(xOpinionEntity);
    }

    @Override
    public int updateTp(XOpinionEntity xOpinionEntity) {
        return opinionMapper.updateTp(xOpinionEntity);
    }

    @Override
    public List<XOpinionEntity> queryOpinion(XOpinionEntity xOpinionEntity) {
        return opinionMapper.queryOpinion(xOpinionEntity);
    }
}
