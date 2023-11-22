package com.test1;

public class CurrencyChart {
	private Integer currencyCode;
	private Integer pglEffective;
	private String pglEffectiveDate;
	private String pglCurrencyDesc;
	private String pglCurrencyShortDesc;
	private Integer pglDecimalPositions;
	private String pglCurrencySymbol;
	private String pglCurrencyScale;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CurrencyChart() {

	}

	public CurrencyChart(Integer currencyCode, Integer pglEffective, String pglEffectiveDate, String pglCurrencyDesc,
			String pglCurrencyShortDesc, Integer pglDecimalPositions, String pglCurrencySymbol, String pglCurrencyScale,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.currencyCode = currencyCode;
		this.pglEffective = pglEffective;
		this.pglEffectiveDate = pglEffectiveDate;
		this.pglCurrencyDesc = pglCurrencyDesc;
		this.pglCurrencyShortDesc = pglCurrencyShortDesc;
		this.pglDecimalPositions = pglDecimalPositions;
		this.pglCurrencySymbol = pglCurrencySymbol;
		this.pglCurrencyScale = pglCurrencyScale;
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

	public Integer getPglEffective() {
		return pglEffective;
	}

	public void setPglEffective(Integer pglEffective) {
		this.pglEffective = pglEffective;
	}

	public String getPglEffectiveDate() {
		return pglEffectiveDate;
	}

	public void setPglEffectiveDate(String pglEffectiveDate) {
		this.pglEffectiveDate = pglEffectiveDate;
	}

	public String getPglCurrencyDesc() {
		return pglCurrencyDesc;
	}

	public void setPglCurrencyDesc(String pglCurrencyDesc) {
		this.pglCurrencyDesc = pglCurrencyDesc;
	}

	public String getPglCurrencyShortDesc() {
		return pglCurrencyShortDesc;
	}

	public void setPglCurrencyShortDesc(String pglCurrencyShortDesc) {
		this.pglCurrencyShortDesc = pglCurrencyShortDesc;
	}

	public Integer getPglDecimalPositions() {
		return pglDecimalPositions;
	}

	public void setPglDecimalPositions(Integer pglDecimalPositions) {
		this.pglDecimalPositions = pglDecimalPositions;
	}

	public String getPglCurrencySymbol() {
		return pglCurrencySymbol;
	}

	public void setPglCurrencySymbol(String pglCurrencySymbol) {
		this.pglCurrencySymbol = pglCurrencySymbol;
	}

	public String getPglCurrencyScale() {
		return pglCurrencyScale;
	}

	public void setPglCurrencyScale(String pglCurrencyScale) {
		this.pglCurrencyScale = pglCurrencyScale;
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
