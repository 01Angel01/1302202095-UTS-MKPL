package lib;
import java.util.List;
import java.util.LinkedList;

public class Family_Employee {
    private String spouseIdNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;
    public Family_Employee(){
        childNames = new LinkedList<String>();
	    childIdNumbers = new LinkedList<String>();
    }

    public void setSpouse(String spouseIdNumber) {
		this.spouseIdNumber = spouseIdNumber;
	}
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
    public String getSpouseIdNumber(){
        return spouseIdNumber;
    }
}
