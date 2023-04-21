package com.example.algorithmstudy.자료구조;

import java.util.*;
import java.util.ArrayList;

public class study {
    private class Student implements Comparable<Student> {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Student o) {
            return age - o.age;
        }
    }

    public static void main(String[] args) {
        List<Student> ss = new ArrayList<>();
        Collections.sort(ss);

    }
}
