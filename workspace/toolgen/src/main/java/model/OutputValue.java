package model;


public class OutputValue {
	private String value;

	private String dataType;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	@Override
	public String toString() {
		return "OutputValue [value=" + value + ", dataType=" + dataType + "]";
	}

	
}
