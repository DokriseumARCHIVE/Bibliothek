public class Autor {
	private String firstname;
	private String lastname;

	public Autor(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	/**
	 * @return the fistname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the fistname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return firstname + " " + lastname;
	}
}
