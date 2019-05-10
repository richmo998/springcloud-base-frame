package cn.wonhigh.bdp.dht.common.model;

import java.util.Date;

/**
 * 任务日志
 * 
 * @author zhangc
 * 
 */
public class TaskLog {

	private String triggerName;// 调度名称
	private String groupName;// 分组名称
	private Date createTime;// 创建时间
	private String runRecord;// 运行说明

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRunRecord() {
		return runRecord;
	}

	public void setRunRecord(String runRecord) {
		this.runRecord = runRecord;
	}

}
