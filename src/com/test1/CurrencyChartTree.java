package com.test1;

public class CurrencyChartTree {
	private Integer currencyCode;
	private Integer curencyChartTreeId;
	private String curencyChartTreeEffectiveDate;
	private Integer curencyChartTreeCode;
	private String curencyChartTreeDescription;
	private String treeLevel1;
	private String treeLevel1Desc;
	private String treeLevel2;
	private String treeLevel2Desc;
	private String treeLevel3;
	private String treeLevel4;
	private String treeLevel4Desc;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CurrencyChartTree() {

	}

	public CurrencyChartTree(Integer currencyCode, Integer curencyChartTreeId, String curencyChartTreeEffectiveDate,
			Integer curencyChartTreeCode, String curencyChartTreeDescription, String treeLevel1, String treeLevel1Desc,
			String treeLevel2, String treeLevel2Desc, String treeLevel3, String treeLevel4, String treeLevel4Desc,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.currencyCode = currencyCode;
		this.curencyChartTreeId = curencyChartTreeId;
		this.curencyChartTreeEffectiveDate = curencyChartTreeEffectiveDate;
		this.curencyChartTreeCode = curencyChartTreeCode;
		this.curencyChartTreeDescription = curencyChartTreeDescription;
		this.treeLevel1 = treeLevel1;
		this.treeLevel1Desc = treeLevel1Desc;
		this.treeLevel2 = treeLevel2;
		this.treeLevel2Desc = treeLevel2Desc;
		this.treeLevel3 = treeLevel3;
		this.treeLevel4 = treeLevel4;
		this.treeLevel4Desc = treeLevel4Desc;
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

	public Integer getCurencyChartTreeId() {
		return curencyChartTreeId;
	}

	public void setCurencyChartTreeId(Integer curencyChartTreeId) {
		this.curencyChartTreeId = curencyChartTreeId;
	}

	public String getCurencyChartTreeEffectiveDate() {
		return curencyChartTreeEffectiveDate;
	}

	public void setCurencyChartTreeEffectiveDate(String curencyChartTreeEffectiveDate) {
		this.curencyChartTreeEffectiveDate = curencyChartTreeEffectiveDate;
	}

	public Integer getCurencyChartTreeCode() {
		return curencyChartTreeCode;
	}

	public void setCurencyChartTreeCode(Integer curencyChartTreeCode) {
		this.curencyChartTreeCode = curencyChartTreeCode;
	}

	public String getCurencyChartTreeDescription() {
		return curencyChartTreeDescription;
	}

	public void setCurencyChartTreeDescription(String curencyChartTreeDescription) {
		this.curencyChartTreeDescription = curencyChartTreeDescription;
	}

	public String getTreeLevel1() {
		return treeLevel1;
	}

	public void setTreeLevel1(String treeLevel1) {
		this.treeLevel1 = treeLevel1;
	}

	public String getTreeLevel1Desc() {
		return treeLevel1Desc;
	}

	public void setTreeLevel1Desc(String treeLevel1Desc) {
		this.treeLevel1Desc = treeLevel1Desc;
	}

	public String getTreeLevel2() {
		return treeLevel2;
	}

	public void setTreeLevel2(String treeLevel2) {
		this.treeLevel2 = treeLevel2;
	}

	public String getTreeLevel2Desc() {
		return treeLevel2Desc;
	}

	public void setTreeLevel2Desc(String treeLevel2Desc) {
		this.treeLevel2Desc = treeLevel2Desc;
	}

	public String getTreeLevel3() {
		return treeLevel3;
	}

	public void setTreeLevel3(String treeLevel3) {
		this.treeLevel3 = treeLevel3;
	}

	public String getTreeLevel4() {
		return treeLevel4;
	}

	public void setTreeLevel4(String treeLevel4) {
		this.treeLevel4 = treeLevel4;
	}

	public String getTreeLevel4Desc() {
		return treeLevel4Desc;
	}

	public void setTreeLevel4Desc(String treeLevel4Desc) {
		this.treeLevel4Desc = treeLevel4Desc;
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
