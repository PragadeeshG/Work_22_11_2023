package com.test1;

public class CurrencyChartApprovals {
	private Integer currencyCode;
	private Integer chartCode;
	private Integer sequenceId;
	private String roleId;
	private String groupName;
	private Integer approvalTypeCode;
	private String approvalType;
	private String approvalTypeDesc;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CurrencyChartApprovals() {

	}

	public CurrencyChartApprovals(Integer currencyCode, Integer chartCode, Integer sequenceId, String roleId,
			String groupName, Integer approvalTypeCode, String approvalType, String approvalTypeDesc,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.currencyCode = currencyCode;
		this.chartCode = chartCode;
		this.sequenceId = sequenceId;
		this.roleId = roleId;
		this.groupName = groupName;
		this.approvalTypeCode = approvalTypeCode;
		this.approvalType = approvalType;
		this.approvalTypeDesc = approvalTypeDesc;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(Integer currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Integer getChartCode() {
		return chartCode;
	}

	public void setChartCode(Integer chartCode) {
		this.chartCode = chartCode;
	}

	public Integer getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getApprovalTypeCode() {
		return approvalTypeCode;
	}

	public void setApprovalTypeCode(Integer approvalTypeCode) {
		this.approvalTypeCode = approvalTypeCode;
	}

	public String getApprovalType() {
		return approvalType;
	}

	public void setApprovalType(String approvalType) {
		this.approvalType = approvalType;
	}

	public String getApprovalTypeDesc() {
		return approvalTypeDesc;
	}

	public void setApprovalTypeDesc(String approvalTypeDesc) {
		this.approvalTypeDesc = approvalTypeDesc;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
