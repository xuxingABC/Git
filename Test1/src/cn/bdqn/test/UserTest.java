package cn.bdqn.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.utils.myBatisTest;

import entity.User;


public class UserTest {
//	public static void main(String[] args) throws IOException{
//		
//		//声明核心文件
//		String resource = "mybatis-config.xml";
//		//读取配置文件
//		InputStream is = Resources.getResourceAsStream(resource);
//		//创建sqlSession
//		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//		//true 自动提交
//		SqlSession session = factory.openSession();
//		int count = session.selectOne("cn.smbms.dao.user.UserMapper.count");
//		
//		System.out.println("count="+count);
//		
//		    List<User> list = session.selectList("cn.smbms.dao.user.UserMapper.getList");
//		for (User user : list) {
//			System.out.println(user.toString());
//		}
//		
//		User user = new User();
//		user.setName("ewe");
//		user.setLoginname("login123");
//		
//		int r = session.insert("cn.smbms.dao.user.UserMapper.add",user);
//		//提交事务
//		session.commit();
//		System.out.println("r="+r);
		
//		
//		User user = new User();
//		user.setName("sdd");
//		user.setuser_id(4);
//		session.update("cn.smbms.dao.user.UserMapper.updateUser",user);
//		session.commit();
//		
//	}

//	@Test
//	public void test1 ()throws IOException{
//		SqlSession sqlSession = myBatisTest.getSqlSession();
//		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//		List<User> list = mapper.getAll();
//		for (User user : list) {
//			System.out.println(user.toString());
//		}
//		myBatisTest.closeSqlSession(sqlSession);
//	}
	
	@Test
	public void test2 ()throws IOException{
		SqlSession sqlSession = myBatisTest.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user.setName("zhangsan");
		user.setLoginname("zs123");
		List<User> list = mapper.getByNameAndLoginname(user);
		for (User users : list) {
			System.out.println(users.toString());
		}
		myBatisTest.closeSqlSession(sqlSession);
	}
	
	@Test
	public void test3 ()throws IOException{
		SqlSession sqlSession = myBatisTest.getSqlSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("name", "zhangsan");
		userMap.put("loginname", "zs123");
		List<User> list = mapper.getByNameAndLoginname2(userMap);
		for (User user : list) {
			System.out.println(user.toString());
		}
		myBatisTest.closeSqlSession(sqlSession);
	}
	
}
