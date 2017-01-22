package mypack;

public class CourseReg {
	private Student stud;
	private String cname;
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