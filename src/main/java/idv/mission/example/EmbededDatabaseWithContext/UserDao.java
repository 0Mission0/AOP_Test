package idv.mission.example.EmbededDatabaseWithContext;

import java.util.List;

public interface UserDao {
	User findByName(String name);
	List<User> findAll();
}