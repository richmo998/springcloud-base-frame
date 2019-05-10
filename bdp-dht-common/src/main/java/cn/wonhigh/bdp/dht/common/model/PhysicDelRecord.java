package cn.wonhigh.bdp.dht.common.model;

import java.util.Date;

/**
 * 记录每次获取的物理删除记录sequence的最大值，作为下一次的最小值
 * 
 * @author user
 * @date 2016-4-25 下午1:14:13
 * @version 0.5.0 
 * @copyright wonhigh.cn 
 */
public class PhysicDelRecord {

	private Long id;
	private String sysName;
	private String tableName;
	private Long seqNo;
	private Date updateTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSysName() {
		return sysName;
	}
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public Long getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(Long seqNo) {
		this.seqNo = seqNo;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
