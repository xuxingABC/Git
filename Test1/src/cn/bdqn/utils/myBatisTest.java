package cn.bdqn.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sun.faces.util.Cache.Factory;

public class myBatisTest  {
	private static SqlSessionFactory factory;
	SqlSession sqlSession = null;
	static{
		//声明核心文件
				String resource = "mybatis-config.xml";
				//读取配置文件
				InputStream is = null;
				try {
					is = Resources.getResourceAsStream(resource);
					factory = new SqlSessionFactoryBuilder().build(is);
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					if (is!=null) {
						try {
							is.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
	}
	
	public static SqlSession getSqlSession(){
		return factory.openSession(true);
	}
	
	public static void closeSqlSession(SqlSession sqlSession){
		if (sqlSession!=null) {
			sqlSession.close(); 
		}
	}

}
