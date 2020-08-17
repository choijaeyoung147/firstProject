package com.yedam.classes;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setAge(27);
		p1.setName("최재영");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person cjy = new Person();
		cjy.setName("최재영");
		cjy.setAge(27);
		
		Person ksm = new Person();
		ksm.setName("김상민");
		ksm.setAge(26);
		
		Person ksm2 = new Person();
		ksm2.setName("김상민");
		ksm2.setAge(26);
		
		System.out.println(ksm==ksm2);
		System.out.println(ksm.getName()==ksm2.getName());//기본타입은  == 사용가능
		System.out.println(ksm.getName().equals(ksm2.getName()));//기본 타입이 아니면equals()
		
		System.out.println(cjy.introduce());
		System.out.println(ksm.introduce());
		
		Person[]pAry= {cjy,ksm,ksm2};
		
		Person anoy =new Person();
		System.out.println(anoy.introduce());
		
		Person mhj =new Person("민해주");
		System.out.println(mhj.introduce());
		mhj.name = "최형준";
		System.out.println(mhj.introduce());
		
		Person hsj =new Person("허성준,28");
		System.out.println(hsj.introduce());
		hsj.setName("시무");
		System.out.println(hsj.introduce());
	
		
		
		
		
		
	}

}
