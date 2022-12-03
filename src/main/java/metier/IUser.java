package metier;

import java.util.List;

public interface IUser {

	public int add(User user);
	public int delete(int id);
	public int update(User user);
	public User findById(int id);
	public List<User> findAll();	
}
