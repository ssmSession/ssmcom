package com.zking.ssm.service;

import com.zking.ssm.model.XDictEntity;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

/**
 * TOOD
 *
 * @author ${qiaoqiao}
 * @date 2019/12/23 0:58
 */
public class DictServiceImplTest extends BaseTest{

    @Resource
    private DictService dictService;

    @Test
    public void queryDict(){
        XDictEntity xDictEntity = new XDictEntity();
        xDictEntity.setDictype("category");
        List<XDictEntity> sdict = dictService.Sdict(xDictEntity);
        System.out.println(sdict);
    }

}