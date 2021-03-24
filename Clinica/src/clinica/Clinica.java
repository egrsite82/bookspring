package clinica;

import java.util.ArrayList;

public class Clinica {
	
	private double lowestWeightIndex;
	private String name;
	private ArrayList<Person> members;
	
	public Clinica (String name, double lowestWeightIndex) {
		
		this.name = name;
		this.lowestWeightIndex = lowestWeightIndex;
		this.members = new ArrayList<Person>();
	}
	
	public boolean isAccepted (Person personToCompare) {
		
		if ( personToCompare.weightIndex() < this.lowestWeightIndex   ) {
			
			return false;
		}
		
		return true;
	}
	
	public void addAsMember (Person personToAddtoMembers) {
		
		if (isAccepted(personToAddtoMembers))
		{   
	        this.members.add(personToAddtoMembers);
			System.out.println("added");}
		
		else {
			
			System.out.println("Not added");
		}
		
	}
	

	public double getLowestWeightIndex() {
		return lowestWeightIndex;
	}

	public void setLowestWeightIndex(double lowestWeightIndex) {
		this.lowestWeightIndex = lowestWeightIndex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Person> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Person> members) {
		this.members = members;
	}

	/*
	 * @Override public String toString() { return "Clinica [lowestWeightIndex=" +
	 * lowestWeightIndex + ", name=" + name + ", members=" + members + "]"; }
	 */
	
	@Override
	public String toString() {
		String membersAsString = "";

		for (Person member : this.members) {
			membersAsString += "  " + member + "\n";
		}

		return "Clinic:\n " + this.name + " (" + this.lowestWeightIndex +  ") " + "  \n members: \n" + membersAsString;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(lowestWeightIndex);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((members == null) ? 0 : members.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clinica other = (Clinica) obj;
		if (Double.doubleToLongBits(lowestWeightIndex) != Double.doubleToLongBits(other.lowestWeightIndex))
			return false;
		if (members == null) {
			if (other.members != null)
				return false;
		} else if (!members.equals(other.members))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
