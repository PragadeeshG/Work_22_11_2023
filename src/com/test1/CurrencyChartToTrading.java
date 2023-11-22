package com.test1;

public class CurrencyChartToTrading {
	private Integer currencyCode;
	private Integer accountId;
	private Integer tradeId;
	private String preTradeApplicable;
	private Integer businessIndicator;
	private boolean userCode;
	private boolean countryCode;
	private String unitName;
	private String pglAccoutMappingId;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CurrencyChartToTrading() {

	}

	public CurrencyChartToTrading(Integer currencyCode, Integer accountId, Integer tradeId, String preTradeApplicable,
			Integer businessIndicator, boolean userCode, boolean countryCode, String unitName,
			String pglAccoutMappingId, String creationCr, String modifiedCr, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.currencyCode = currencyCode;
		this.accountId = accountId;
		this.tradeId = tradeId;
		this.preTradeApplicable = preTradeApplicable;
		this.businessIndicator = businessIndicator;
		this.userCode = userCode;
		this.countryCode = countryCode;
		this.unitName = unitName;
		this.pglAccoutMappingId = pglAccoutMappingId;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
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

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public String getPreTradeApplicable() {
		return preTradeApplicable;
	}

	public void setPreTradeApplicable(String preTradeApplicable) {
		this.preTradeApplicable = preTradeApplicable;
	}

	public Integer getBusinessIndicator() {
		return businessIndicator;
	}

	public void setBusinessIndicator(Integer businessIndicator) {
		this.businessIndicator = businessIndicator;
	}

	public boolean isUserCode() {
		return userCode;
	}

	public void setUserCode(boolean userCode) {
		this.userCode = userCode;
	}

	public boolean isCountryCode() {
		return countryCode;
	}

	public void setCountryCode(boolean countryCode) {
		this.countryCode = countryCode;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getPglAccoutMappingId() {
		return pglAccoutMappingId;
	}

	public void setPglAccoutMappingId(String pglAccoutMappingId) {
		this.pglAccoutMappingId = pglAccoutMappingId;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
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
