package lab4_3;

import java.util.*;

public class StudentIterator {
    List<Student> studentList=null;
    public StudentIterator(){
        Student[] stu=new Student[5];
        studentList=new ArrayList<Student>();
        stu[0]=new Student("张三",32);
        stu[1]=new Student("李四", 25);
        stu[2]=new Student("王五", 21);
        stu[3]=new Student("赵六", 38);
        stu[4]=new Student("周七", 26);
        for(int i=0;i<5;i++){
            studentList.add(stu[i]);
        }
    }
    public  void display(){
        Iterator<Student> i=studentList.iterator();
        System.out.println("原始数据：");
        while(i.hasNext()){
            Student stu=i.next();
            System.out.println("姓名:"+stu.getName()+" "+"年龄："+stu.getAge());
        }
        System.out.println("-----------------------");
        Collections.sort(studentList);
        Iterator<Student> t=studentList.iterator();
        System.out.println("从小到大排序后数据：");
        while(t.hasNext()){
            Student stu=t.next();
            System.out.println("姓名:"+stu.getName()+" "+"年龄："+stu.getAge());
        }
    }

    public static void main(String[] args){
        StudentIterator studentIterator=new StudentIterator();
        studentIterator.display();
    }
}
