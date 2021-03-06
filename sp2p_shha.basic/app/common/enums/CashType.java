package common.enums;

public enum CashType {
	
	/**
	 * 普通取现
	 */
	GENERAL("GENERAL", "普通提现"),
	
	/**
	 * 即时取现
	 */
	IMMEDIATE("IMMEDIATE", "即时提现"),

	/**
	 * 快速取现
	 */
	FAST("FAST", "快速提现");
	
	public String code;
	
	public String value;
	
	private CashType(String code, String value) {
		this.code = code;
		this.value = value;
	}
	
	public static CashType getCashTypeByCode(String code) {
		if(code == null) {
			return null;
		}
		for(CashType cashType : CashType.values()) {
			if(cashType.code.equals(code)) {
				return cashType;
			}
		}
		return null;
	}
	
}