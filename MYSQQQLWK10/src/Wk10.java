
public class Wk10 {
	//Stored #1
		create Procedure GetFUllName ()
		>select first_name, last_name, from employees;
	// Stored #2
		Create procedure GetMaleData ()
		Select * from employees where gender = 'm' 
	// stored 3 #
		create procedure GenZ()
		Select first_name, last_name, hite_date from employees where hire_date > '1995-12-31'
	// stored #4
		create procedure UselessProcedure ()
		call GetMaleData 
	// stored #5
		select employees.*, titles.* from employees INNER JOIN titles ON titles,emp_no = employees.emp_no limit 10;
		
}
