package lsp;
abstract class Customer {
	static String name;
	static String email;
	public abstract String getName();
	public abstract void setName(String name);
	public abstract String getEmail();
	public abstract void setEmail(String email);

}
