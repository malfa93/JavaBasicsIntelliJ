package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {


        HashMap<String, Integer> employeeMap = new HashMap<>();

        employeeMap.put("Jon", 120000);
        employeeMap.put("Jane", 130000);
        employeeMap.put("John", 110000);
        employeeMap.put("Smith", 110000);
        String maxSalaryEmpName="";
        double maxSalary=0;

        for (Map.Entry<String, Integer> emp:employeeMap.entrySet()
             ) {

            if(emp.getValue()>maxSalary){
                maxSalary=emp.getValue();
                maxSalaryEmpName = emp.getKey();
            }

        }

        System.out.println(maxSalaryEmpName+" =$"+(int)maxSalary);
    }
}
