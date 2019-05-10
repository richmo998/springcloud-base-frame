package cn.wonhigh.bdp.dht.mapper;

import cn.wonhigh.bdp.dht.common.model.ApplicationInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository("applicationInfoMapper")
public interface ApplicationInfoMapper {
    int deleteByPrimaryKey(Integer id)throws Exception;

    int insert(ApplicationInfo record)throws Exception;

    int insertSelective(ApplicationInfo record)throws Exception;

    ApplicationInfo selectByPrimaryKey(Integer id)throws Exception;

    int selectByAppName(@Param("appName") String appName)throws Exception;

    List<ApplicationInfo> selectByAppNameList(String appName)throws Exception;

    List<ApplicationInfo> selectByParamsMap(Map<String, String> paramsMap)throws Exception;

    List<String> selectAllJobIdByParamsMap(Map<String, Object> paramsMap)throws Exception;

    int updateByAppName(@Param("appInfo") ApplicationInfo appInfo)throws Exception;

    int updateByPrimaryKeySelective(ApplicationInfo record)throws Exception;

    int updateByPrimaryKey(ApplicationInfo record)throws Exception;

    void deleteByAppName(@Param("appInfo") ApplicationInfo appInfo)throws Exception;

    int deleteByAppNameAndAppidIsNull(String appName) throws Exception;

    ApplicationInfo selectByAppNameAndAppId(Map<String, String> parms)throws Exception;

    int updateByAppNameAndAppIdBySelective(ApplicationInfo appInfo)throws Exception;

    List<String> selectByInstandId(@Param("instanceIds") List<String> instanceIds)throws Exception;

}