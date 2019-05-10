package cn.wonhigh.bdp.dht.common.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 客户端任务实体
 * @author wang.w
 *
 */
public class ClientTaskControl implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 843214829608945452L;
	private Integer id;
	private String groupName;
	private String schedulerName;
	private Short sourceDbType;
	private String sourceDbUrl;
	private String sourceDbUser;
	private String sourceDbPass;
	private String sourceSqlStr;
	private Short targetDbType;
	private String targetDbUrl;
	private String targetDbUser;
	private String targetDbPass;
	private String targetTableName;
	private Date taskBeginTime;
	private Integer taskExecFreq;
	private Short taskStatus;
	private Short dataStatus;
	private Date createTime;
	private String sourceMainTable;
	public String getSourceMainTable() {
		return sourceMainTable;
	}
	public void setSourceMainTable(String sourceMainTable) {
		this.sourceMainTable = sourceMainTable;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getSchedulerName() {
		return schedulerName;
	}
	public void setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
	}
	public Short getSourceDbType() {
		return sourceDbType;
	}
	public void setSourceDbType(Short sourceDbType) {
		this.sourceDbType = sourceDbType;
	}
	public String getSourceDbUrl() {
		return sourceDbUrl;
	}
	public void setSourceDbUrl(String sourceDbUrl) {
		this.sourceDbUrl = sourceDbUrl;
	}
	public String getSourceDbUser() {
		return sourceDbUser;
	}
	public void setSourceDbUser(String sourceDbUser) {
		this.sourceDbUser = sourceDbUser;
	}
	public String getSourceDbPass() {
		return sourceDbPass;
	}
	public void setSourceDbPass(String sourceDbPass) {
		this.sourceDbPass = sourceDbPass;
	}
	public String getSourceSqlStr() {
		return sourceSqlStr;
	}
	public void setSourceSqlStr(String sourceSqlStr) {
		this.sourceSqlStr = sourceSqlStr;
	}
	public Short getTargetDbType() {
		return targetDbType;
	}
	public void setTargetDbType(Short targetDbType) {
		this.targetDbType = targetDbType;
	}
	public String getTargetDbUrl() {
		return targetDbUrl;
	}
	public void setTargetDbUrl(String targetDbUrl) {
		this.targetDbUrl = targetDbUrl;
	}
	public String getTargetDbUser() {
		return targetDbUser;
	}
	public void setTargetDbUser(String targetDbUser) {
		this.targetDbUser = targetDbUser;
	}
	public String getTargetDbPass() {
		return targetDbPass;
	}
	public void setTargetDbPass(String targetDbPass) {
		this.targetDbPass = targetDbPass;
	}
	public String getTargetTableName() {
		return targetTableName;
	}
	public void setTargetTableName(String targetTableName) {
		this.targetTableName = targetTableName;
	}
	public Date getTaskBeginTime() {
		return taskBeginTime;
	}
	public void setTaskBeginTime(Date taskBeginTime) {
		this.taskBeginTime = taskBeginTime;
	}
	public Integer getTaskExecFreq() {
		return taskExecFreq;
	}
	public void setTaskExecFreq(Integer taskExecFreq) {
		this.taskExecFreq = taskExecFreq;
	}
	public Short getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(Short taskStatus) {
		this.taskStatus = taskStatus;
	}
	public Short getDataStatus() {
		return dataStatus;
	}
	public void setDataStatus(Short dataStatus) {
		this.dataStatus = dataStatus;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
