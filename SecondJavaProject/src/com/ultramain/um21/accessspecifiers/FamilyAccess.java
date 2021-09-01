package com.ultramain.um21.accessspecifiers;

public class FamilyAccess {
	public int familySize;
	
	public int getFamilySize(){
		return familySize;
	}
	

	public void setFamilySize(int familySize){
		this.familySize = familySize;
	}
   public void eat(){
	   System.out.println("Eating.....");
   }
}

class Family extends FamilyAccess{
	
	public void eat(){
		System.out.println("Eating piza....");
	}
}
