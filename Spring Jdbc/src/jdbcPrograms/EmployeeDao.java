package jdbcPrograms;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao
{
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	public List<Employee> getEmployee()
 	{
		String sql="select * from employee";
		List<Employee> list=jdbcTemplate.query(sql, new RowMapper<Employee>()
		{
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException
			{
		
				Employee e=new Employee();
				e.setEmpid(rs.getString("empid"));
				e.setEname(rs.getString("ename"));
				e.setDept(rs.getString("dept"));
				e.setDesg(rs.getString("desg"));
				e.setEmail(rs.getString("email"));
				return e;
			}
		});
		return list;
	}
	public Boolean searchEmployee(String empid) 
	{
		String sql="select * from employee where empid="+empid;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Boolean>() 
		{
			@Override
			public Boolean extractData(ResultSet rs) throws SQLException, DataAccessException 
			{
			if(rs.next()) 
			{
				
				return true;
			}
			else 
			{
				return false;
			}
		}
			
		});
	}
	public int addEmployee(Employee e) 
	{
		Boolean search_res=searchEmployee(e.getEmpid());
		if(search_res)
		{
			return 0 ;
		}
		else
		{
			String sql="insert into employee values (?,?,?,?,?)";
			return jdbcTemplate.update(sql,e.getEmpid(),e.getEname(),e.getDept(),e.getDesg(),e.getEmail());
	}
	}
}
