package model;

public class TestCase extends Excel{
	private String id;

	private String name;

	private String input;

	private String output;

	private String methodType;

	private String cacheName;

	private String cacheKey;

	private boolean isCachePresenceOrAbsence;

	private boolean isRepetition;

	private boolean isCreated;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the input
	 */
	public String getInput() {
		return input;
	}

	/**
	 * @param input the input to set
	 */
	public void setInput(String input) {
		this.input = input;
	}

	/**
	 * @return the output
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * @param output the output to set
	 */
	public void setOutput(String output) {
		this.output = output;
	}

	/**
	 * @return the methodType
	 */
	public String getMethodType() {
		return methodType;
	}

	/**
	 * @param methodType the methodType to set
	 */
	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	/**
	 * @return the cacheName
	 */
	public String getCacheName() {
		return cacheName;
	}

	/**
	 * @param cacheName the cacheName to set
	 */
	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

	/**
	 * @return the cacheKey
	 */
	public String getCacheKey() {
		return cacheKey;
	}

	/**
	 * @param cacheKey the cacheKey to set
	 */
	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	/**
	 * @return the isCachePresenceOrAbsence
	 */
	public boolean isCachePresenceOrAbsence() {
		return isCachePresenceOrAbsence;
	}

	/**
	 * @param isCachePresenceOrAbsence the isCachePresenceOrAbsence to set
	 */
	public void setCachePresenceOrAbsence(boolean isCachePresenceOrAbsence) {
		this.isCachePresenceOrAbsence = isCachePresenceOrAbsence;
	}

	/**
	 * @return the isRepetition
	 */
	public boolean isRepetition() {
		return isRepetition;
	}

	/**
	 * @param isRepetition the isRepetition to set
	 */
	public void setRepetition(boolean isRepetition) {
		this.isRepetition = isRepetition;
	}

	/**
	 * @return the isCreated
	 */
	public boolean isCreated() {
		return isCreated;
	}

	/**
	 * @param isCreated the isCreated to set
	 */
	public void setCreated(boolean isCreated) {
		this.isCreated = isCreated;
	}

}
