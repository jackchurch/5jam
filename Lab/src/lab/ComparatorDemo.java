/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import comparatorSorting.*;
import searchingAlgorithms.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author 000080409
 */
public class ComparatorDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        // TODO code application logic here
        //Make course
//        Course c1 = new Course("5JAW", "Java web", 200.99);
//        System.out.println(c1);
        //Make person and address: Person ------------------------------------|      Address-------------------------------------------------------------------|
        //Person p1 = new Person("6", "Patrick McGoohan", "unknown email", "+6", new Address("6", "Unknown street name", "The Village", "KAR102C", "The Island"));
        //Make course c1 Course----------------------------|
        Course c1 = new Course(101, "Tell All 101", 0.0);
        //Make course c2 Course----------------------------|
        Course c2 = new Course(200, "Insolence Training", 1000.0);
        //Make course c3 Course----------------------------|
        Course c3 = new Course(301, "How to be happy", 550.0);

        //Made a student and enrollment: Student----------------------------|  Enrollment------------------------------------------------|  Person---------------------------------------| Address--------------------------------------------------------------|
        Student s1 = new Student("New arrival", LocalDate.parse("1967-09-29"), new Enrollment(36, LocalDate.parse("1967-09-29"), "F", "1", c1), 6, "Patrick McGoohan", "unknown email", "+6", new Address("6", "Bluff Street", "The Village", "0000", "The Island"));

        //Made a student and enrollment: Student----------------------------|  Enrollment-----------------------------------------------|  Person-----------------------------------| Address--------------------------------------------------------------|
        Student s2 = new Student("Retirement", LocalDate.parse("1958-09-21"), new Enrollment(100, LocalDate.parse("1935-09-29"), "A", "2", c3), 2, "David Bauer", "unknown email", "+2", new Address("2", "Carrer de Hill", "The Village", "0000", "The Island"));

        //Made a student and enrollment: Student--------------------------------|  Enrollment-----------------------------------------------|  Person---------------------------------------| Address--------------------------------------------------------------|
        Student s3 = new Student("Business owner", LocalDate.parse("1958-09-21"), new Enrollment(100, LocalDate.parse("1944-08-29"), "B", "1", c2), 2, "Georgina Cookson", "unknown email", "+2", new Address("4", "Beach Via", "The Village", "0000", "The Island"));

        //Made a student and enrollment: Student----------------------------|  Enrollment-----------------------------------------------|  Person----------------------------------------| Address--------------------------------------------------------------|
        Student s4 = new Student("Retirement", LocalDate.parse("1958-09-21"), new Enrollment(64, LocalDate.parse("1937-12-29"), "A", "2", c3), 45, "Kenneth Griffith", "unknown email", "+45", new Address("45", "Rue Forest", "The Village", "0000", "The Island"));

        //Made a student and enrollment: Student--------------------------------|  Enrollment-----------------------------------------------|  Person---------------------------------------| Address--------------------------------------------------------------|
        Student s5 = new Student("Island Security", LocalDate.parse("1975-03-24"), new Enrollment(4, LocalDate.parse("1941-12-29"), "B", "1", c3), 2, "Anton Rodgers", "unknown email", "+44", new Address("44", "Sky Strauss", "The Village", "0000", "The Island"));

        //Made a student and enrollment: Student-------------------------------|  Enrollment-----------------------------------------------|  Person----------------------------------------| Address--------------------------------------------------------------|
        Student s6 = new Student("Island Security", LocalDate.parse("1975-03-24"), new Enrollment(5, LocalDate.parse("1941-12-29"), "B", "1", c3), 85, "Anton Rodgers", "unknown email", "+85", new Address("44", "Sky Avenue", "The Village", "0000", "The Island"));

        System.out.println("\nStudent 1:" + s1.allToString());
        System.out.println("\nStudent 2:" + s2.allToString());
        System.out.println("\nStudent 3:" + s3.allToString());
        System.out.println("\nStudent 4:" + s4.allToString());
        System.out.println("\nStudent 5:" + s5.allToString());
        System.out.println("\nStudent 6:" + s6.allToString());

        System.out.println("\nCourse 1:" + c1.allToString());
        System.out.println("\nCourse 2:" + c2.allToString());
        System.out.println("\nCourse 3:" + c3.allToString());

        System.out.println("\n\nPART A STUDENTS PART A STUDENTS PART A STUDENTS PART A STUDENTS PART A STUDENTS\n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓\n"
                + "PART A STUDENTS PART A STUDENTS PART A STUDENTS PART A STUDENTS PART A STUDENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓\n "
                + "PART A STUDENTS PART A STUDENTS PART A STUDENTS PART A STUDENTS PART A STUDENTS\n "
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓\n "
                + "PART A STUDENTS PART A STUDENTS PART A STUDENTS PART A STUDENTS PART A STUDENTS\n "
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n");

        System.out.println("\nCompare Student 2 with all students: \n");
        System.out.println("Is s2 == s1? Expect false, everyting is different: \t" + s2.equals(s1)); //false
        System.out.println("Is s2 == s2? Expect true, same object: \t" + s2.equals(s2)); //true - same object
        System.out.println("Is s2 == s3? Expect true, only ID and date registered are the same: \t" + s2.equals(s3)); //true - id and date registered are the same. 
        System.out.println("Is s2 == s4? Expect false, only registed is the same, ID is different: \t" + s2.equals(s4)); // false - id is different
        System.out.println("Is s2 == s5? Expect false, only id is the same, date registed is different:\t " + s2.equals(s5));
        System.out.println("Is s2 == s6? Expect false, everyting is different\t " + s2.equals(s6));

        System.out.println("\nShow hashcode for all students:");
        System.out.println("s1 hash: " + s1.hashCode());
        System.out.println("s2 hash: " + s2.hashCode());
        System.out.println("s3 hash: " + s3.hashCode() + "\ts2 and s3 hash are the same as the hash value uses the id and date enrolled");
        System.out.println("s4 hash: " + s4.hashCode());
        System.out.println("s5 hash: " + s5.hashCode());
        System.out.println("s6 hash: " + s6.hashCode());

        System.out.println("\n\nPART A ENROLLMENTS PART A ENROLLMENTS PART A ENROLLMENTS PART A ENROLLMENTS PART A ENROLLMENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓\n "
                + "PART A ENROLLMENTS PART A ENROLLMENTS PART A ENROLLMENTS PART A ENROLLMENTS PART A ENROLLMENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART A ENROLLMENTS PART A ENROLLMENTS PART A ENROLLMENTS PART A ENROLLMENTS PART A ENROLLMENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART A ENROLLMENTS PART A ENROLLMENTS PART A ENROLLMENTS PART A ENROLLMENTS PART A ENROLLMENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓\n ");

        System.out.println("\nCompare Enrollment 2 with all enrollments: \n");
        System.out.println("Is e2 == e1? Expect false, everyting is different: \t" + s2.enrollment.equals(s1.enrollment)); //false
        System.out.println("Is e2 == e2? Expect true, same object: \t\t\t" + s2.enrollment.equals(s2.enrollment)); //true - same object
        System.out.println("Is e2 == e3? Expect true, ID is the same: \t\t" + s2.enrollment.equals(s3.enrollment));//true - id aare the same. 
        System.out.println("Is e2 == e4? Expect false, everyting is different: \t" + s2.enrollment.equals(s4.enrollment)); // false - id is different
        System.out.println("Is e2 == e5? Expect false, everyting is different:\t " + s2.enrollment.equals(s5.enrollment)); //false
        System.out.println("Is e2 == e6? Expect false, everyting is different:\t " + s2.enrollment.equals(s6.enrollment));//false

        System.out.println("\nShow hashcode for all enrollments:");
        System.out.println("e1 hash: " + s1.enrollment.hashCode());
        System.out.println("e2 hash: " + s2.enrollment.hashCode());
        System.out.println("e3 hash: " + s3.enrollment.hashCode() + "\t e2 and e3 hash are the same as the hash value uses the id.");
        System.out.println("e4 hash: " + s4.enrollment.hashCode());
        System.out.println("e5 hash: " + s5.enrollment.hashCode());
        System.out.println("e6 hash: " + s6.enrollment.hashCode());

        System.out.println("\n\nPART A COURSES PART A COURSES PART A COURSES PART A COURSES PART A COURSES \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART A COURSES PART A COURSES PART A COURSES PART A COURSES PART A COURSES \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART A COURSES PART A COURSES PART A COURSES PART A COURSES PART A COURSES \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART A COURSES PART A COURSES PART A COURSES PART A COURSES PART A COURSES \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n");

        System.out.println("\nCompare Coures 2 with all courses: \n");
        System.out.println("Is c2 == c1? Expect false, everyting is different: \t" + c2.equals(c1)); //false
        System.out.println("Is c2 == c2? Expect true, same object: \t\t\t" + c2.equals(c2)); //true - same object
        System.out.println("Is c2 == c3? Expect false, everyting is different: \t" + c2.equals(c3)); //false

        System.out.println("\nShow hashcode for all courses:");
        System.out.println("c1 hash: " + c1.hashCode());
        System.out.println("c2 hash: " + c2.hashCode());
        System.out.println("c3 hash: " + c3.hashCode());

        System.out.println("\n\nPART B STUDENTS PART B STUDENTS PART B STUDENTS PART B STUDENTS PART B STUDENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART B STUDENTS PART B STUDENTS PART B STUDENTS PART B STUDENTS PART B STUDENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART B STUDENTS PART B STUDENTS PART B STUDENTS PART B STUDENTS PART B STUDENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART B STUDENTS PART B STUDENTS PART B STUDENTS PART B STUDENTS PART B STUDENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n");

        List<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);
        studentArrayList.add(s5);
        studentArrayList.add(s6);

        System.out.println("\n\nStudents Array before sorting: ");
        studentArrayList.forEach((s)
                -> {
            System.out.println(s.toString() + " " + s.name);
        });

        //BY ID
        System.out.println("\n\nStudents Array by ID:");
        Collections.sort(studentArrayList, new SortStudentById());
        studentArrayList.forEach((s)
                -> {
            System.out.println(s.toString() + " " + s.name);
        });

        //BY DATE REGISTERED REVERSE ORDER
        Collections.sort(studentArrayList, new SortStudentByDateRegistered().reversed());
        System.out.println("\n\nStudents Array by Newsest Date Registered: ");
        studentArrayList.forEach((s)
                -> {
            System.out.println(s.toString() + " " + s.name);
        });

        //BY NAME
        Collections.sort(studentArrayList, new SortStudentByName());
        System.out.println("\n\nStudents Array by name from inherited from person class:");
        studentArrayList.forEach((s)
                -> {
            System.out.println(s.toString() + " " + s.name);
        });

        //TREE SET SORTING
        Set<Student> studentSet = new HashSet<Student>();

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);
        studentSet.add(s6);

        System.out.println("\n\nStudents Set before sorting: ");
        studentSet.forEach((s)
                -> {
            System.out.println(s.toString() + " " + s.name);
        });

        //BY NAME
        System.out.println("\n\nStudents Set by Name:");
        TreeSet<Student> studentByNameTreeSet = new TreeSet<Student>(new SortStudentByName());
        studentByNameTreeSet.add(s1);
        studentByNameTreeSet.add(s2);
        studentByNameTreeSet.add(s3);
        studentByNameTreeSet.add(s4);
        studentByNameTreeSet.add(s5);
        studentByNameTreeSet.add(s6);

        studentByNameTreeSet.forEach((s)
                -> {
            System.out.println(s.toString() + " " + s.name);
        });

        //BY DATE REGistered
        System.out.println("\n\nStudents Set by Date Registered:");
        TreeSet<Student> studentByDateRegisteredTreeSet = new TreeSet<Student>(new SortStudentByDateRegistered());
        studentByDateRegisteredTreeSet.add(s1);
        studentByDateRegisteredTreeSet.add(s2);
        studentByDateRegisteredTreeSet.add(s3);
        studentByDateRegisteredTreeSet.add(s4);
        studentByDateRegisteredTreeSet.add(s5);
        studentByDateRegisteredTreeSet.add(s6);

        studentByDateRegisteredTreeSet.forEach((s)
                -> {
            System.out.println(s.toString() + " " + s.name);
        });

        //BY ID
        System.out.println("\n\nStudents Set by ID:");
        TreeSet<Student> studentByIdTreeSet = new TreeSet<Student>(new SortStudentById());
        studentByIdTreeSet.add(s1);
        studentByIdTreeSet.add(s2);
        studentByIdTreeSet.add(s3);
        studentByIdTreeSet.add(s4);
        studentByIdTreeSet.add(s5);
        studentByIdTreeSet.add(s6);

        studentByIdTreeSet.forEach((s)
                -> {
            System.out.println(s.toString() + " " + s.name);
        });

        System.out.println("\n\n PART B ENROLLMENTS PART B ENROLLMENTS PART B ENROLLMENTS PART B ENROLLMENTS PART B ENROLLMENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART B ENROLLMENTS PART B ENROLLMENTS PART B ENROLLMENTS PART B ENROLLMENTS PART B ENROLLMENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART B ENROLLMENTS PART B ENROLLMENTS PART B ENROLLMENTS PART B ENROLLMENTS PART B ENROLLMENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART B ENROLLMENTS PART B ENROLLMENTS PART B ENROLLMENTS PART B ENROLLMENTS PART B ENROLLMENTS \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n");

        List<Enrollment> enrollmentArrayList = new ArrayList<>();

        enrollmentArrayList.add(s1.enrollment);
        enrollmentArrayList.add(s2.enrollment);
        enrollmentArrayList.add(s3.enrollment);
        enrollmentArrayList.add(s4.enrollment);
        enrollmentArrayList.add(s5.enrollment);
        enrollmentArrayList.add(s6.enrollment);

        System.out.println("\n\nEnrollmentArray before sorting: ");
        enrollmentArrayList.forEach((e)
                -> {//
            System.out.println(e.toString());
        });

        //BY ID
        System.out.println("\n\nEnrollmentArray Array by ID:");
        Collections.sort(enrollmentArrayList, new SortEnrollmentById());

        enrollmentArrayList.forEach((e)
                -> {
            System.out.println(e.toString());
        });

        //BY DateEnrolled
        System.out.println("\n\nEnrollmentArray Array by date:");
        Collections.sort(enrollmentArrayList, new SortEnrollmentByDateEnrolled());

        enrollmentArrayList.forEach((e)
                -> {
            System.out.println(e.toString());
        });

        //TREE SET SORTING
        Set<Enrollment> enrollmentSet = new HashSet<Enrollment>();

        enrollmentSet.add(s1.enrollment);
        enrollmentSet.add(s2.enrollment);
        enrollmentSet.add(s3.enrollment);
        enrollmentSet.add(s4.enrollment);
        enrollmentSet.add(s5.enrollment);
        enrollmentSet.add(s6.enrollment);

        System.out.println("\n\nEnrollment Set before sorting: ");
        enrollmentSet.forEach((e)
                -> {
            System.out.println(e.toString());
        });

        //BY DATE REGistered
        System.out.println("\n\nEnrollment Set by Date Registered:");
        TreeSet<Enrollment> enrollmentByDateEnrolledTreeSet = new TreeSet<Enrollment>(new SortEnrollmentByDateEnrolled());
        enrollmentByDateEnrolledTreeSet.add(s1.enrollment);
        enrollmentByDateEnrolledTreeSet.add(s2.enrollment);
        enrollmentByDateEnrolledTreeSet.add(s3.enrollment);
        enrollmentByDateEnrolledTreeSet.add(s4.enrollment);
        enrollmentByDateEnrolledTreeSet.add(s5.enrollment);
        enrollmentByDateEnrolledTreeSet.add(s6.enrollment);

        enrollmentByDateEnrolledTreeSet.forEach((e)
                -> {
            System.out.println(e.toString());
        });

        //BY id
        System.out.println("\n\nEnrollment Set by ID:");
        TreeSet<Enrollment> enrollmentByDateIdTreeSet = new TreeSet<Enrollment>(new SortEnrollmentById());
        enrollmentByDateIdTreeSet.add(s1.enrollment);
        enrollmentByDateIdTreeSet.add(s2.enrollment);
        enrollmentByDateIdTreeSet.add(s3.enrollment);
        enrollmentByDateIdTreeSet.add(s4.enrollment);
        enrollmentByDateIdTreeSet.add(s5.enrollment);
        enrollmentByDateIdTreeSet.add(s6.enrollment);

        enrollmentByDateIdTreeSet.forEach((e)
                -> {
            System.out.println(e.toString());
        });

        System.out.println("\n\n PART B COURSES PART B COURSES PART B COURSES PART B COURSES PART B COURSES \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART B COURSES PART B COURSES PART B COURSES PART B COURSES PART B COURSES \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART B COURSES PART B COURSES PART B COURSES PART B COURSES PART B COURSES \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n"
                + "PART B COURSES PART B COURSES PART B COURSES PART B COURSES PART B COURSES \n"
                + "↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ \n");

        List<Course> courseArrayList = new ArrayList<>();

        courseArrayList.add(c1);
        courseArrayList.add(c2);
        courseArrayList.add(c3);

        System.out.println("\n\nCourse Array before sorting: ");
        courseArrayList.forEach((c)
                -> {
            System.out.println(c.toString());
        });

        //BY ID
        System.out.println("\n\nCourse Array by code:");
        Collections.sort(courseArrayList, new SortCourseByCode());
        courseArrayList.forEach((c)
                -> {
            System.out.println(c.toString());
        });

        //BY DateEnrolled
        System.out.println("\n\nCourse Array by cost:");
        Collections.sort(courseArrayList, new SortCourseByCost());
        courseArrayList.forEach((c)
                -> {
            System.out.println(c.toString());
        });

        //TREE SET SORTING
        Set<Course> courseSet = new HashSet<Course>();

        courseSet.add(c1);
        courseSet.add(c2);
        courseSet.add(c3);

        System.out.println("\n\nCourse Set before sorting: ");
        courseSet.forEach((c)
                -> {
            System.out.println(c.toString());
        });

        //BY code 
        System.out.println("\n\nCourse Set by code:");
        TreeSet<Course> courseByCodeTreeSet = new TreeSet<Course>(new SortCourseByCode());
        courseByCodeTreeSet.add(c1);
        courseByCodeTreeSet.add(c2);
        courseByCodeTreeSet.add(c3);

        courseByCodeTreeSet.forEach((c)
                -> {
            System.out.println(c.toString());
        });

        //BY cost 
        System.out.println("\n\nCourse Set by cost:");
        TreeSet<Course> courseByCostTreeSet = new TreeSet<Course>(new SortCourseByCost());
        courseByCostTreeSet.add(c1);
        courseByCostTreeSet.add(c2);
        courseByCostTreeSet.add(c3);

        courseByCostTreeSet.forEach((c)
                -> {
            System.out.println(c.toString());
        });

    }

}
