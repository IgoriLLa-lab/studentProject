package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder Запущен");

        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
       StudentOrder so = new StudentOrder();
       so.setStudentOrderId(id);

           return so;
    }


}
