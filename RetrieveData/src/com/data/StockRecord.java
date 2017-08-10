package com.data;

public class StockRecord {

	private String levelOfSmell;
	private String smellName;
	private String packageName;
	private String className;
	private String methodName;
	


	public StockRecord(String levelOfSmell2, String smellName2, String packageName2, String className2,
			String methodName2) {
		// TODO Auto-generated constructor stub
		
		this.levelOfSmell = levelOfSmell2;
		this.smellName = smellName2;
		this.packageName = packageName2;
		this.className = className2;
		this.methodName = methodName2;
	}





	public String getLevelOfSmell() {
		
		
		return levelOfSmell;
	}
	public void setLevelOfSmell(String levelOfSmell) {
		this.levelOfSmell = levelOfSmell;
	}
	public String getSmellName() {
		return smellName;
	}
	public void setSmellName(String smellName) {
		this.smellName = smellName;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	
}

