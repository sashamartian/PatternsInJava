package main.java.com.patterns.other.dataAccessObject.example1;

/**
 * BusinessObject представляет клиента данных. Это объект, который нуждается в доступе к источнику данных для получения
 * и сохранения данных. BusinessObject может быть реализован как сессионный компонент, компонент управления данными или
 * другой Java-объект, сервлет или вспомогательный компонент.
 * DataAccessObject является первичным объектом данного паттерна. DataAccessObject абстрагирует используемую реализацию
 * доступа к данным для BusinessObject, обеспечивая прозрачный доступ к источнику данных. BusinessObject передает также
 * ответственность за выполнение операций загрузки и сохранения данных объекту DataAccessObject.
* */
public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //print all students
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }


        //update student
        Student student =studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //get the student
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
