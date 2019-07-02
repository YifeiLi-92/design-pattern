package com.example.template.examination;

public class ExaminationApplication {
    public static void main(String[] args) {
        System.out.println("学生1的试卷\n");
        StudentA studentA = new StudentA();
        studentA.question1();
        studentA.question2();

        System.out.println("学生2的试卷\n");
        StudentB studentB = new StudentB();
        studentB.question1();
        studentB.question2();
    }
}
