package cn.wonhigh.bdp.dht.common.model;

import java.util.Date;

/**
 * ods 表配置信息
 * 用于查询重复id的表配置信息
 * 
 * @author zhang.rq
 * @since 2016-07-25
 */
public class TabDupPrimaryConfig {
	
	/**
	 *  id
	 */
	private int id;
	/**
	 * 业务表名
	 */
	private String tableName;
	
	/**
	 * 分组名称
	 */
	private String groupName;
	
	/**
	 * 是否有效  1:无效数据，0:有效数据
	 */
	private int isdisable; 
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getIsdisable() {
		return isdisable;
	}
	public void setIsdisable(int isdisable) {
		this.isdisable = isdisable;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


}
