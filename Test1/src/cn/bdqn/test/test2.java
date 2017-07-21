package cn.bdqn.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.User;


public class test2 {

	SqlSession session;
	
	@BeforeClass
	 public static void beforeclass(){
		System.out.println("++++++++++");
	}
	
	
	
	//每个测试方法之前运行
	@Before
	public void before() throws IOException{
		//配置核心文件
				String resource = "mybatis-config.xml";
				//读取配置文件
				InputStream is = Resources.getResourceAsStream(resource);
				//创建sqlSessionFactory
				SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
				//创建sqlSession true 自动提交
				SqlSession session = factory.openSession();//提交事务
//				session.commit();
				//关闭session
//				session.close();
				
	}
	@Test
	public void test1() throws IOException{
		User user = new User();
		user.setName("ry");
		user.setLoginname("login123rt");
		
		int r = session.insert("cn.smbms.dao.user.UserMapper.add",user);
		//提交事务
		session.commit();
		System.out.println("r="+r);
		//关闭session
//		session.close();
		
//		User user = new User();
//		user.setName("ss");
//		user.setuser_id(4);
//		session.update("cn.smbms.dao.user.UserMapper.updateUser",user);
//		session.commit();
	}
	
	@Test
	public void delete() throws IOException{
		int r = session.delete("cn.smbms.dao.user.UserMapper.delete",7);
		//提交事务
		session.commit();
		System.out.println("r="+r);
		//关闭session
//		session.close();
//
	}
	
	@After
	public void after() throws IOException{
		//关闭session
	  session.close();
	}
	
}
