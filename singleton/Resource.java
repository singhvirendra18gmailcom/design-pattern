package singleton;

/**
 * The Class Resource.
 */
public class Resource {

	/** The id. */
	private String id;
	
	/** The name. */
	private String name;

	/**
	 * Instantiates a new resource.
	 *
	 * @param id the id
	 * @param name the name
	 */
	private Resource(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * The Class ResourceGenerator.
	 */
	private static class ResourceGenerator {
		// these values for id or name can be fetched from database or
		// properties file. or can be hardcoded as per bissiness requirement
		/** The resource. */
		private static Resource resource = new Resource("101",
				"Singleton Resource");
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * Gets the.
	 *
	 * @return the resource
	 */
	public static Resource get() {
		return ResourceGenerator.resource;
	}
}
