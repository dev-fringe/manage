package manage;

public class Configuration {

    private String inputFile;
    private String user;
    private String password;

    private String truststoreFile;
    private String keystoreFile;
    private String keystorePassword;
    private String truststorePassword;
	public String getInputFile() {
		return inputFile;
	}
	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTruststoreFile() {
		return truststoreFile;
	}
	public void setTruststoreFile(String truststoreFile) {
		this.truststoreFile = truststoreFile;
	}
	public String getKeystoreFile() {
		return keystoreFile;
	}
	public void setKeystoreFile(String keystoreFile) {
		this.keystoreFile = keystoreFile;
	}
	public String getKeystorePassword() {
		return keystorePassword;
	}
	public void setKeystorePassword(String keystorePassword) {
		this.keystorePassword = keystorePassword;
	}
	public String getTruststorePassword() {
		return truststorePassword;
	}
	public void setTruststorePassword(String truststorePassword) {
		this.truststorePassword = truststorePassword;
	}
}