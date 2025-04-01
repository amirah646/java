package Inheritance.LibraryManagement;

public class LibraryManagementSystem {
	private String userType;
    private String username;
    private String password;

    public LibraryManagementSystem(String userType, String username, String password) {
        this.userType = userType;
        this.username = username;
        this.password = password;
    }

    public void login() {
        System.out.println(username + " logged in.");
    }

    public void register() {
        System.out.println(username + " registered.");
    }

    public void logout() {
        System.out.println(username + " logged out.");
    }
}
