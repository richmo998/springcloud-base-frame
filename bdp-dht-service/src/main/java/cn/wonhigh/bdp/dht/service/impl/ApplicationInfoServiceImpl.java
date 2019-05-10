package cn.wonhigh.bdp.dht.service.impl;



import cn.wonhigh.bdp.dht.common.model.ApplicationInfo;
import cn.wonhigh.bdp.dht.mapper.ApplicationInfoMapper;
import cn.wonhigh.bdp.dht.service.ApplicationInfoService;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service("applicationInfoService")
public class ApplicationInfoServiceImpl implements ApplicationInfoService {
    @Autowired
    private ApplicationInfoMapper applicationInfoMapper;
    private static final Logger logger = Logger.getLogger(ApplicationInfoServiceImpl.class);

    @Override
    public void insertOrUpdateApplicationInfo(Map<String, String> params) throws Exception {
        String jobName = params.get("mapred.job.name");
        String scheduleId = params.get("scheduleId");
        String taskParentId = params.get("taskParentId");
        String taskSonId = params.get("taskSonId");
        if (null != jobName && null != scheduleId &&
                null != taskParentId && null != taskSonId) {
            ApplicationInfo info = convertApplicationInfo(jobName, scheduleId,
                    taskParentId, taskSonId, params);
            if (applicationInfoMapper.selectByAppName(jobName) > 0) {
                applicationInfoMapper.updateByAppName(info);
            } else {
                applicationInfoMapper.insertSelective(info);
            }
        } else {

            logger.info("调度传入参数不合法：jobName=【" + jobName + "】scheduleId=【" + scheduleId
                    + "】taskParentId=【" + taskParentId + "】taskSonId=【" + taskSonId + "】");
            throw new Exception("传入参数异常");
        }

    }

    private ApplicationInfo convertApplicationInfo(String jobName, String scheduleId,
                                                   String taskParentId, String taskSonId, Map<String, String> params) {
        ApplicationInfo res = new ApplicationInfo();
        res.setAppName(jobName == null ? "" : jobName);
        res.setAppId(params.get("appId") == null ? "" : params.get("appId"));
        res.setScheduleId(scheduleId == null ? "" : scheduleId);
        res.setInstanceid(taskParentId == null ? "" : taskParentId);
        res.setSubinstanceid(taskSonId == null ? "" : taskSonId);
        res.setState(params.get("state") == null ? "" : params.get("state"));
        return res;
    }


    @Override
    public void delByAppName(ApplicationInfo applicationInfo) throws Exception {
        applicationInfoMapper.deleteByAppName(applicationInfo);
    }

    @Override
    public boolean isApplicationExists(String appName) throws Exception {

        if (applicationInfoMapper.selectByAppName(appName) > 0) {
            return true;
        }

        return false;
    }

    @Override
    public int insertApplicationBySelective(ApplicationInfo applicationInfo) throws Exception {
        return applicationInfoMapper.insertSelective(applicationInfo);
    }

    @Override
    public int updateApplicationBySelective(ApplicationInfo applicationInfo) throws Exception {
        return applicationInfoMapper.updateByAppName(applicationInfo);
    }

    @Override
    public ApplicationInfo selectByAppNameAndAppId(Map<String, String> parms) throws Exception {
        if (StringUtils.isBlank(parms.get("appName"))) {
            logger.error("参数appName不能为空");
            return null;
        }
        if (StringUtils.isBlank(parms.get("appId"))) {
            logger.error("参数appId不能为空");
            return null;

        }
        return applicationInfoMapper.selectByAppNameAndAppId(parms);
    }

    @Override
    public int updateByAppNameAndAppIdBySelective(ApplicationInfo appInfo) throws Exception {
        if (StringUtils.isBlank(appInfo.getAppName())) {
            logger.error("参数appName不能为空");
            return 0;
        }
        if (StringUtils.isBlank(appInfo.getAppId())) {
            logger.error("参数appId不能为空");
            return 0;

        }
        appInfo.setUpdateTime(new Date());

        return applicationInfoMapper.updateByAppNameAndAppIdBySelective(appInfo);
    }

    @Override
    public List<ApplicationInfo> selectByAppNameList(String appName) throws Exception {
        if (StringUtils.isBlank(appName)) {
            logger.error("参数appName不能为空");
            return null;
        }
        return applicationInfoMapper.selectByAppNameList(appName);
    }

    @Override
    public List<String> selectByInstandId(List instanceIds) throws Exception {
        return applicationInfoMapper.selectByInstandId(instanceIds);

    }

    @Override
    public List<ApplicationInfo> selectByParamsMap(Map<String, String> paramsMap) throws Exception {
        return applicationInfoMapper.selectByParamsMap(paramsMap);
    }

    @Override
    public List<String> selectAllJobIdByParamsMap(Map<String, Object> paramsMap) throws Exception {
        return applicationInfoMapper.selectAllJobIdByParamsMap(paramsMap);
    }

    @Override
    public int deleteByAppNameAndAppidIsNull(String appName) throws Exception {
        return applicationInfoMapper.deleteByAppNameAndAppidIsNull(appName);
    }
}
