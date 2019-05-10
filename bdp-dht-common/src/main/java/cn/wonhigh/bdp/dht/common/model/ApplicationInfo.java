package cn.wonhigh.bdp.dht.common.model;
import java.util.Date;

public class ApplicationInfo {
    private Integer id;

    private String appId;

    private String appName;

    private String state;

    private String finalstatus;

    private Long startedtime;

    private Long finishedtime;

    private int elapsedtime;

    private String scheduleId;

    private String instanceid;

    private String subinstanceid;

    private String remark;

    private String createUser;

    private Integer createUserId;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getFinalstatus() {
        return finalstatus;
    }

    public void setFinalstatus(String finalstatus) {
        this.finalstatus = finalstatus == null ? null : finalstatus.trim();
    }

    public Long getStartedtime() {
        return startedtime;
    }

    public void setStartedtime(Long startedtime) {
        this.startedtime = startedtime;
    }

    public Long getFinishedtime() {
        return finishedtime;
    }

    public void setFinishedtime(Long finishedtime) {
        this.finishedtime = finishedtime;
    }

    public int getElapsedtime() {
        return elapsedtime;
    }

    public void setElapsedtime(int elapsedtime) {
        this.elapsedtime = elapsedtime;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId == null ? null : scheduleId.trim();
    }

    public String getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid == null ? null : instanceid.trim();
    }

    public String getSubinstanceid() {
        return subinstanceid;
    }

    public void setSubinstanceid(String subinstanceid) {
        this.subinstanceid = subinstanceid == null ? null : subinstanceid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ApplicationInfo{" +
                "id=" + id +
                ", appId='" + appId + '\'' +
                ", appName='" + appName + '\'' +
                ", state='" + state + '\'' +
                ", finalstatus='" + finalstatus + '\'' +
                ", startedtime=" + startedtime +
                ", finishedtime=" + finishedtime +
                ", elapsedtime=" + elapsedtime +
                ", scheduleId='" + scheduleId + '\'' +
                ", instanceid='" + instanceid + '\'' +
                ", subinstanceid='" + subinstanceid + '\'' +
                ", remark='" + remark + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createUserId=" + createUserId +
                ", createTime=" + createTime +
                ", updateUser='" + updateUser + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}