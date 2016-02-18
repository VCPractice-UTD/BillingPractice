import java.util.ArrayList;
public class Administrator 
{
	private ArrayList<String> permissions;
	private ArrayList<String> roles;
	
	public void addRole(String role)
	{
		roles.add(role);
	}
	public void removeRole(String role)
	{
		int index = roles.indexOf(role);
		roles.remove(index);
	}
	public void addPermission(String permission)
	{
		permissions.add(permission);
	}
	public void removePermission(String permission)
	{
		int index = permissions.indexOf(permission);
		permissions.remove(index);
	}

}
