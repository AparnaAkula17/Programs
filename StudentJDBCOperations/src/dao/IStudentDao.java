package dao;

import java.util.List;
import data.Student;

public interface IStudentDao
{
	//This is the method used to insert a record in table
	public void create(Student student);
		
	//This method is used to retrieve student record with given id
	public Student getStudent(Integer id);
	
	//This method is used to list all student records
	public List<Student> getStudents();
	
	//This is the method used to delete a record in table
	public void delete(Integer id);
	
	//This method will update the record in the table
	public void update(Student student);
	
	public boolean saveStudentByPst(Student e);
}
