package com.mycompany.myapp.section3;

public class TeacherImpl extends PersonBaseImpl implements Teacher {

	String thoughtCourseTitle;
	public TeacherImpl(String _name, String _thoughtCourseTitle) {
		super(_name);
		thoughtCourseTitle = _thoughtCourseTitle;
	}

	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String teachesFor() {
		return thoughtCourseTitle;
	}

}
