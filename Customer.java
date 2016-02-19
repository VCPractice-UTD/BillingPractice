import java.util.*;
public class Customer extends User
{
	private long creditCard;
	private ArrayList<String> interests;
	private String postalAddress;
	private ArrayList<Order> orders;
	
	public void addInterests(String interest)
	{
		interests.add(interest);
	}
	private void removeInterest(String interest)
	{
		int index = interests.indexOf(interest);
		interests.remove(index);
	}
}
