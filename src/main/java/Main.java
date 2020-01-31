import javassist.*;
import javassist.bytecode.AccessFlag;
import javassist.bytecode.ClassFile;
import javassist.bytecode.DuplicateMemberException;
import javassist.bytecode.FieldInfo;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CannotCompileException {

        /*task1();
        task2();
        task3();
        task4();
        task5();*/
    }

    public static void task1(){
        Integer[] a = new Integer[100000*100000];
    }

    public static void task2(){

        Person prev = new Person();
        while (true){
            Person next = new Person();
            next.setParent(prev);
            prev = next;
        }
    }

    public static void task3() throws CannotCompileException {
        ClassPool cp = javassist.ClassPool.getDefault();
        List<Class> list = new LinkedList<>();
        for (int i = 0; i < 1000000 ; i++) {
            list.add(cp.makeClass("test" + i).toClass());

        }
    }

    public static int task4(){
        task4();
        return 0;
    }

    public static void task5(){
        new NewClass();
    }


    static class Person {
        int age;
        String name;
        double weight;
        Person parent;

        public Person(){
            this.age = 1;
            this.name = "q";
            this.weight = 2;
        }

        public void setParent(Person parent) {
            this.parent = parent;
        }
    }

    static class NewClass{
        public NewClass(){
            new NewClass();
        }
    }
}

