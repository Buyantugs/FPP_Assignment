package assignment11;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key,Student> studentMap=new HashMap<>();
		for (Student st:students) {
			studentMap.put(new Key(st.getFirstName(),st.getLastName()), st);
		}
		return studentMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){


		//implements
		double sumGPA=0;
		Set<Map.Entry<Key, Student>> entries = maps.entrySet();
		for (Map.Entry<Key, Student> entry : entries) {
			sumGPA=sumGPA+entry.getValue().getGpa();
		}
		return sumGPA/entries.size();
}
}
