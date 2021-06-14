    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.time.LocalDate;
import linkedLists.*;

/**
 *
 * @author jackc
 */
public class DoublyLinkedListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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

        //Made a studentSort and enrollment: Student----------------------------|  Enrollment------------------------------------------------|  Person---------------------------------------| Address--------------------------------------------------------------|
        Student s1 = new Student("New arrival", LocalDate.parse("1967-09-29"), new Enrollment(36, LocalDate.parse("1967-09-29"), "F", "1", c1), 6, "Patrick McGoohan", "unknown email", "+6", new Address("6", "Bluff Street", "The Village", "0000", "The Island"));

        //Made a studentSort and enrollment: Student----------------------------|  Enrollment-----------------------------------------------|  Person-----------------------------------| Address--------------------------------------------------------------|
        Student s2 = new Student("Retirement", LocalDate.parse("1958-09-21"), new Enrollment(100, LocalDate.parse("1935-09-29"), "A", "2", c3), 2, "David Bauer", "unknown email", "+2", new Address("2", "Carrer de Hill", "The Village", "0000", "The Island"));

        //Made a studentSort and enrollment: Student--------------------------------|  Enrollment-----------------------------------------------|  Person---------------------------------------| Address--------------------------------------------------------------|
        Student s3 = new Student("Business owner", LocalDate.parse("1958-09-21"), new Enrollment(100, LocalDate.parse("1944-08-29"), "B", "1", c2), 2, "Georgina Cookson", "unknown email", "+2", new Address("4", "Beach Via", "The Village", "0000", "The Island"));

        //Made a studentSort and enrollment: Student----------------------------|  Enrollment-----------------------------------------------|  Person----------------------------------------| Address--------------------------------------------------------------|
        Student s4 = new Student("Retirement", LocalDate.parse("1958-09-21"), new Enrollment(64, LocalDate.parse("1937-12-29"), "A", "2", c3), 45, "Kenneth Griffith", "unknown email", "+45", new Address("45", "Rue Forest", "The Village", "0000", "The Island"));

        //Made a studentSort and enrollment: Student--------------------------------|  Enrollment-----------------------------------------------|  Person---------------------------------------| Address--------------------------------------------------------------|
        Student s5 = new Student("Island Security", LocalDate.parse("1975-03-24"), new Enrollment(4, LocalDate.parse("1941-12-29"), "B", "1", c3), 2, "Anton Rodgers", "unknown email", "+44", new Address("44", "Sky Strauss", "The Village", "0000", "The Island"));

        //Made a studentSort and enrollment: Student-------------------------------|  Enrollment-----------------------------------------------|  Person----------------------------------------| Address--------------------------------------------------------------|
        Student s6 = new Student("Island Security", LocalDate.parse("1975-03-24"), new Enrollment(5, LocalDate.parse("1941-12-29"), "B", "1", c3), 85, "Anton Rodgers", "unknown email", "+85", new Address("44", "Sky Avenue", "The Village", "0000", "The Island"));

        Node sN1 = new Node(s1);
        Node sN2 = new Node(s2);
        Node sN3 = new Node(s3);
        Node sN4 = new Node(s4);
        Node sN5 = new Node(s5);
        Node sN6 = new Node(s6);

        Node eN1 = new Node(s1.enrollment);
        Node eN2 = new Node(s2.enrollment);
        Node eN3 = new Node(s3.enrollment);
        Node eN4 = new Node(s4.enrollment);
        Node eN5 = new Node(s5.enrollment);
        Node eN6 = new Node(s6.enrollment);

        Node cN1 = new Node(c1);
        Node cN2 = new Node(c2);
        Node cN3 = new Node(c3);

        DoublyLinkedList studentDLL = new DoublyLinkedList();
        studentDLL.addFirst(sN1);
        studentDLL.addFirst(sN2);
        System.out.println("\nAdding first: studentDLL toString: " + studentDLL.toString());

        studentDLL.addLast(sN5);
        studentDLL.addLast(sN6);
        System.out.println("\nAdding last: studentDLL toString: " + studentDLL.toString());

        studentDLL.insertMiddle(3, sN3);
        studentDLL.insertMiddle(4, sN4);
        System.out.println("\nInsert middle: studentDLL toString: " + studentDLL.toString());

        studentDLL.removeFirst();
        studentDLL.removeMiddle(3);
        studentDLL.removeLast();
        System.out.println("\nRemove first, 3rd (after removing first) and last):  studentDLL toString: " + studentDLL.toString());

        System.out.println("\nstudentDLL reversed after removals toString: " + studentDLL.toStringReverse());

        DoublyLinkedList enrollmentDLL = new DoublyLinkedList();
        enrollmentDLL.addFirst(eN1);
        enrollmentDLL.addFirst(eN2);

        System.out.println("\nAdding first: enrollmentDLL toString: " + enrollmentDLL.toString());

        enrollmentDLL.addLast(eN5);
        enrollmentDLL.addLast(eN6);
        System.out.println("\nAdding last: enrollmentDLL toString: " + enrollmentDLL.toString());

        enrollmentDLL.insertMiddle(3, eN3);
        enrollmentDLL.insertMiddle(4, eN4);
        System.out.println("\nAdding middle: enrollmentDLL toString: " + enrollmentDLL.toString());

        enrollmentDLL.removeFirst();
        enrollmentDLL.removeMiddle(3);
        enrollmentDLL.removeLast();
        System.out.println("\nRemove first, 3rd (after removing first) and last):  enrollmentDLL toString: " + enrollmentDLL.toString());

        System.out.println("\nenrollmentDLL reversed after removals toString: " + enrollmentDLL.toStringReverse());

        DoublyLinkedList courseDLL = new DoublyLinkedList();
        courseDLL.addFirst(cN1);
        courseDLL.addLast(cN2);
        courseDLL.addLast(cN3);
        System.out.println("\ncourseDLL toString: " + courseDLL.toString());
        System.out.println("\ncourseDLL reversed toString: " + courseDLL.toStringReverse());

    }

    /**
     *
     * @param node
     */
    public static void printList(Node node) {
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

}
