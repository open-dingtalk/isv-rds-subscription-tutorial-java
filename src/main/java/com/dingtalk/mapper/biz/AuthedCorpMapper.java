package com.dingtalk.mapper.biz;

import com.dingtalk.model.biz.AuthedCorpDO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 开通应用的企业信息
 * 建表SQL参见项目中的isv-rds-subscription-tutorial-java.sql文件
 */
@Mapper
public interface AuthedCorpMapper {

    void addOrUpdateAuthedCorp(AuthedCorpDO authedCorpDO);

    AuthedCorpDO getAuthedCorp(@Param("corpId") String corpId,@Param("suiteKey")String suiteKey);
}
