package cn.wonhigh.bdp.dht.service;



import cn.wonhigh.bdp.dht.common.model.ApplicationInfo;

import java.util.List;
import java.util.Map;

public interface ApplicationInfoService {

    void insertOrUpdateApplicationInfo(Map<String, String> params) throws Exception;


    void delByAppName(ApplicationInfo applicationInfo)throws Exception;

    boolean isApplicationExists(String appName)throws Exception;

    int insertApplicationBySelective(ApplicationInfo applicationInfo)throws Exception;

    int updateApplicationBySelective(ApplicationInfo applicationInfo)throws Exception;

    ApplicationInfo selectByAppNameAndAppId(Map<String, String> parms)throws Exception;

    int updateByAppNameAndAppIdBySelective(ApplicationInfo appInfo)throws Exception;

    List<ApplicationInfo> selectByAppNameList(String appName)throws Exception;

    List<ApplicationInfo> selectByParamsMap(Map<String, String> paramsMap)throws Exception;

    List<String> selectAllJobIdByParamsMap(Map<String, Object> paramsMap)throws Exception;

    List<String> selectByInstandId(List instanceIds) throws Exception;

    int deleteByAppNameAndAppidIsNull(String appName) throws Exception;

}
