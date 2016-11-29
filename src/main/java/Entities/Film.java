package Entities;

public class Film {
	
	private String title;
	private String description;
	private int runtime;
	private int avRating;
	private String imgPath;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the runtime
	 */
	public int getRuntime() {
		return runtime;
	}
	/**
	 * @param runtime the runtime to set
	 */
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	/**
	 * @return the avRating
	 */
	public int getAvRating() {
		return avRating;
	}
	/**
	 * @param avRating the avRating to set
	 */
	public void setAvRating(int avRating) {
		this.avRating = avRating;
	}
	/**
	 * @return the imgPath
	 */
	public String getImgPath() {
		return imgPath;
	}
	/**
	 * @param imgPath the imgPath to set
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

}
