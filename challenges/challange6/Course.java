public class Course {
  static int maxCapacity = 100;

  String CourseName;
  int enrolments;
  String[] enroledStudents = new String[maxCapacity];

  void enrollStuendt(String StudentName) {
    enroledStudents[enrolments] = StudentName;
    enrolments++;

  }

  void unenrollStuendt(String StudentName) {
    enroledStudents[enrolments] = "";

    enrolments--;

  }

  static void setMaxCapacity(int maxcapacity) {
    Course.maxCapacity = maxcapacity;

  }

}