package model;

import java.util.List;

public class TestCase extends Excel {
	private String id;

	private String name;

	private List<InputValue> inputValues;

	private List<OutputValue> outputValues;

	private String methodType;

	private String cacheName;

	private String cacheKey;

	private boolean isCachePresenceOrAbsence;

	private boolean isRepetition;

	private boolean isCreated;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<InputValue> getInputValues() {
		return inputValues;
	}

	public void setInputValues(List<InputValue> inputValues) {
		this.inputValues = inputValues;
	}

	public List<OutputValue> getOutputValues() {
		return outputValues;
	}

	public void setOutputValues(List<OutputValue> outputValues) {
		this.outputValues = outputValues;
	}


	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public String getCacheName() {
		return cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

	public String getCacheKey() {
		return cacheKey;
	}

	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	public boolean isCachePresenceOrAbsence() {
		return isCachePresenceOrAbsence;
	}

	public void setCachePresenceOrAbsence(boolean isCachePresenceOrAbsence) {
		this.isCachePresenceOrAbsence = isCachePresenceOrAbsence;
	}

	public boolean isRepetition() {
		return isRepetition;
	}

	public void setRepetition(boolean isRepetition) {
		this.isRepetition = isRepetition;
	}

	public boolean isCreated() {
		return isCreated;
	}

	public void setCreated(boolean isCreated) {
		this.isCreated = isCreated;
	}

	@Override
	public String toString() {
		return "TestCase [id=" + id + ", name=" + name + ", inputValues=" + inputValues + ", outputValues="
				+ outputValues + ", methodType=" + methodType + ", cacheName=" + cacheName + ", cacheKey=" + cacheKey
				+ ", isCachePresenceOrAbsence=" + isCachePresenceOrAbsence + ", isRepetition=" + isRepetition
				+ ", isCreated=" + isCreated + "]";
	}
	
	
 

}
