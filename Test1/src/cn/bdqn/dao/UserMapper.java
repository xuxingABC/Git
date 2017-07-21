package cn.bdqn.dao;

import java.util.List;
import java.util.Map;

import entity.User;

public interface UserMapper {
	List<User>  getAll();
	int add(User user);
	int delete(Integer id);
	List<User> getByNameAndLoginname(User user);
	
	List<User> getByNameAndLoginname2(Map<String, String> userMap);

}
