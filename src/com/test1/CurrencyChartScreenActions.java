package com.test1;

public class CurrencyChartScreenActions {
	private Integer currencyCode;
	private Integer chartCode;
	private Integer screenId;
	private Integer actionId;
	private String actionName;
	private Integer actionOrder;
	private String actionDesc;
	private String rowSelection;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CurrencyChartScreenActions() {

	}

	public CurrencyChartScreenActions(Integer currencyCode, Integer chartCode, Integer screenId, Integer actionId,
			String actionName, Integer actionOrder, String actionDesc, String rowSelection, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.currencyCode = currencyCode;
		this.chartCode = chartCode;
		this.screenId = screenId;
		this.actionId = actionId;
		this.actionName = actionName;
		this.actionOrder = actionOrder;
		this.actionDesc = actionDesc;
		this.rowSelection = rowSelection;
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

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public Integer getActionId() {
		return actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public Integer getActionOrder() {
		return actionOrder;
	}

	public void setActionOrder(Integer actionOrder) {
		this.actionOrder = actionOrder;
	}

	public String getActionDesc() {
		return actionDesc;
	}

	public void setActionDesc(String actionDesc) {
		this.actionDesc = actionDesc;
	}

	public String getRowSelection() {
		return rowSelection;
	}

	public void setRowSelection(String rowSelection) {
		this.rowSelection = rowSelection;
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
