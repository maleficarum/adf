package com.oracle.demo.model.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class DepartmentsViewSDOImpl extends SDODataObject implements DepartmentsViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 3;

   public DepartmentsViewSDOImpl() {}

   public java.lang.Integer getDepartmentId() {
      return new Integer(getInt(START_PROPERTY_INDEX + 0));
   }

   public void setDepartmentId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getDepartmentName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setDepartmentName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.Integer getManagerId() {
      return new Integer(getInt(START_PROPERTY_INDEX + 2));
   }

   public void setManagerId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.Integer getLocationId() {
      return new Integer(getInt(START_PROPERTY_INDEX + 3));
   }

   public void setLocationId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }


}

