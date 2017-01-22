package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("creg")
public class CourseReg {
	@Autowired
	private Student stud;
	@Value("Maths")
	private String cname;
	@Value("101")
	private String ccode;

	public String getCcode() {
		return ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "Course RegitrationDetails  are :[Student details=" + stud
				+ ",CCode=" + ccode + ",Name=" + cname + "]";
	}
}