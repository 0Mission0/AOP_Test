package idv.mission.example.EmbededDatabaseWithContext;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		UserDao dao = context.getBean(UserDao.class);
		User user = dao.findByName("mission");
		System.out.println(user);
		System.out.println(user.getId().intValue());
		System.out.println(user.getName());
		System.out.println(user.getEmail());

		try {
			String str = "Mission Test...";
			File testFile = new File("E:\\MISSION\\TEST\\my.txt");
			testFile.getParentFile().mkdirs();
			BufferedWriter writer = new BufferedWriter(new FileWriter(testFile));
			writer.write(str);
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		System.out.println("End");
	}
}