package com.oracle.demo.model.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class EmpDetailsSDOImpl extends SDODataObject implements EmpDetailsSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 9;

   public EmpDetailsSDOImpl() {}

   public java.lang.Integer getEmployeeId() {
      return new Integer(getInt(START_PROPERTY_INDEX + 0));
   }

   public void setEmployeeId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getFirstName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setFirstName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getLastName() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setLastName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getEmail() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setEmail(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getSalary() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setSalary(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.sql.Timestamp getHireDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 5);
   }

   public void setHireDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getJobId() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setJobId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.Integer getDepartmentId() {
      return new Integer(getInt(START_PROPERTY_INDEX + 7));
   }

   public void setDepartmentId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getDepartmentName() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setDepartmentName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.math.BigDecimal getAnnualSalary() {
      return getBigDecimal(START_PROPERTY_INDEX + 9);
   }

   public void setAnnualSalary(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }


}

