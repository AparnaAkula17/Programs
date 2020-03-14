package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import data.Student;

public class StudentDaoImpl implements IStudentDao 
{
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public void create(Student student)
	{
		/*// TODO Auto-generated method stub
		String query="insert into student values('"+student.getId()+"','"+student.getName()+"','"+student.getAge()+"')";
		int result=jdbcTemplate.update(query);
		System.out.println(result+ "Record Inserted....");*/
		
	}
	
	@Override
	public Student getStudent(Integer id)
	{
		// TODO Auto-generated method stub
		return null;
	}
/*
	public List<Student> getStudents() 
	{
		/*String sql="select * from student";
		List<Student> lists=jdbcTemplate.query(sql,new RowMapper<Student>()
		{
			@Override
			public Student mapRow(ResultSet rs,int rowNum) throws SQLException
			{
				Student stu=new Student();
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setAge(rs.getInt("age"));
				return stu;
		}
		});
		return lists;*/
	}
	
	public List<Student> getStudents()
	{
		/*// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from student",new ResultSetExtractor<List<Student>>()
		{
			public List<Student> extractdata(ResultSet rs) throws SQLException,DataAccessException
			{
				List<Student> list=new ArrayList<Student>();
				while(rs.next())
				{
					Student e=new Student();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setAge(rs.getInt(3));
					list.add(e);
				}
				return list;
			}

			@Override
			public List<Student> extractData(ResultSet arg0) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}
*/
	public boolean saveStudentByPst(final Student e)
	{
		String query="insert into student values(?,?,?)";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>()
		{
			public Boolean doInPraparedStatement(PreparedStatement ps)throws SQLException,DataAccessException
		{
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setInt(3, e.getAge());
			return ps.execute();
		}

			@Override
			public Boolean doInPreparedStatement(PreparedStatement arg0) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}
	@Override
	public void delete(Integer id) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Student student) 
	{
		/*// TODO Auto-generated method stub
		String query="delete from student where id='"+student.getId()+"' ";
		int result=jdbcTemplate.update(query);*/
	}

	@Override
	public boolean saveStudentByPst() {
		// TODO Auto-generated method stub
		return false;
	}

}
