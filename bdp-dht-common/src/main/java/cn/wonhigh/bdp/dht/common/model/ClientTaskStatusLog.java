package cn.wonhigh.bdp.dht.common.model;

import java.util.Date;

/**
 * 任务历史记录
 * 
 * @author wangl
 * 
 */
public class ClientTaskStatusLog {
	
    private String id;//任务ID,32位uuid
    private String taskId;//任务实例id
	private String schedulerName;// 调度名称
	private String groupName;// 分组名称
	private Date createTime;// 创建时间
	private String taskStatus;//任务最终状态
	private String taskStatusDesc;// 最终状态说明
	private Date syncBeginTime;//任务开始时间，任务开始时会读取上次任务结束时间作为此值
	private Date syncEndTime;//同步结束时间，在本次任务成功时会更新
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public Date getSyncBeginTime() {
		return syncBeginTime;
	}
	public void setSyncBeginTime(Date syncBeginTime) {
		this.syncBeginTime = syncBeginTime;
	}
	public Date getSyncEndTime() {
		return syncEndTime;
	}
	public void setSyncEndTime(Date syncEndTime) {
		this.syncEndTime = syncEndTime;
	}

	public String getSchedulerName() {
		return schedulerName;
	}
	public void setSchedulerName(String schedulerName) {
		this.schedulerName = schedulerName;
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
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatusDesc() {
		return taskStatusDesc;
	}
	public void setTaskStatusDesc(String taskStatusDesc) {
		this.taskStatusDesc = taskStatusDesc;
	}

}
