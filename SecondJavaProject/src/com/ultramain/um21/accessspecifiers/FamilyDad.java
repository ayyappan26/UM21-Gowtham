package com.ultramain.um21.accessspecifiers;

import com.ultramain.um21.accessspecifiers.FamilyAccess;

public class FamilyDad {
    public static void main(String[] args){
    	FamilyAccess myfamily =  new FamilyAccess();
    	myfamily.familySize = 200;
    	System.out.println(myfamily.getFamilySize());
    }
}


