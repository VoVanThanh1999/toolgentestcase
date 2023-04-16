package model;

import java.util.List;
import java.util.Map;

public class ViewPointTest extends Excel{

	private String id;

	private String name;

	private Map<String, List<ViewPointTest>> mapViewPoint;

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
	 * @return the mapViewPoint
	 */
	public Map<String, List<ViewPointTest>> getMapViewPoint() {
		return mapViewPoint;
	}

	/**
	 * @param mapViewPoint the mapViewPoint to set
	 */
	public void setMapViewPoint(Map<String, List<ViewPointTest>> mapViewPoint) {
		this.mapViewPoint = mapViewPoint;
	}

}
