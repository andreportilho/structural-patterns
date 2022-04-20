package br.com.cod3r.bridge.converter.converters;

import br.com.cod3r.bridge.converter.employees.Employee;

import java.util.Locale;

public class CSVConverter implements Converter{

	public String getEmployeeFormated(Employee emp) {
		return String.format(Locale.US,"%s;%d;%.2f",
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
