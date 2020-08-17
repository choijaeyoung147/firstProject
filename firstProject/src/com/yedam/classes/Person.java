package com.yedam.classes;

public class Person {

   String name;
   int age;
   // 생성자
   public Person() { //매개값없이  생성자를 기본생성자 
	   name = "anonymous";
	   age = 0;
	   
   }
   //매개값이 있는 생성자
   public Person(String name) {
	   this.name = name;
   }
   
 //매개값이 있는 생성자
   public Person(String name,int age) {
	   this.name = name;
	   this.age = age;
   }
   
   public String introduce() {
	   return "이름은 " + name+" 나이는 "+age;
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   
  
   
}