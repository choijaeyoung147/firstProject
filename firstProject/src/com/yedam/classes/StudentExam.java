package com.yedam.classes;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hgd = new Student(111,"홍길동","역사");
		Student kys = new Student(222,"김유신","말타기");
		Student cjy = new Student(333,"최재영","총쏘기");
		
		hgd.setstudentNum(222);
		
		Student[]stu1 = {hgd,kys,cjy};
		
		for(int i=0;i<stu1.length;i++) {
			System.out.println(stu1[i].getstudentNum()+" "+stu1[i].getname()+" "+stu1[i].getmajor());
		}
		
		System.out.println(hgd.getname());
		
		String[]stu= new String[3];
		
		stu[0]=hgd.getstudentNum()+hgd.getname()+hgd.getmajor();
		stu[1]=kys.getstudentNum()+kys.getname()+kys.getmajor();
		stu[2]=cjy.getstudentNum()+cjy.getname()+cjy.getmajor();
		
//		for(int i=0;i<3;i++) {
//			System.out.println(stu[i]);
//		}
//		for(Student s:stu1) {
//			System.out.println(s);
//		}
		
		String search="김유신";
		String major="역사";
		for(Student s:stu1) {
			if(s.getmajor().equals(major)) {
				System.out.println(s.toString());
			}
		}
	}

}
