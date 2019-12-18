package com.spread.ydy.thkinjava.chap14Rtt;

//: typeinfo/Staff.java
import java.util.ArrayList;

import com.spread.ydy.thkinjava.chap14Rtt.Staff.Position;

interface Null {}

public class Staff extends ArrayList<Position> {

    private static final long serialVersionUID = 7195355158734399613L;

    public void add(String title, Person person) {
        add(new Position(title, person));
    }

    public void add(String... titles) {
        for (String title : titles)
            add(new Position(title));
    }

    public Staff(String... titles) {
        add(titles);
    }

    public boolean positionAvailable(String title) {
        for (Position position : this)
            if (position.getTitle().equals(title)
                    && position.getPerson() == com.spread.ydy.thkinjava.chap14Rtt.Staff.Person.NullPerson.NULL)
                return true;
        return false;
    }

    public void fillPosition(String title, Person hire) {
        for (Position position : this)
            if (position.getTitle().equals(title)
                    && position.getPerson() == com.spread.ydy.thkinjava.chap14Rtt.Staff.Person.NullPerson.NULL) {
                position.setPerson(hire);
                return;
            }
        throw new RuntimeException("Position " + title + " not available");
    }

    public static void main(String[] args) {
        Staff staff = new Staff("President", "CTO",
          "Marketing Manager", "Product Manager",
          "Project Lead", "Software Engineer",
          "Software Engineer", "Software Engineer",
          "Software Engineer", "Test Engineer",
          "Technical Writer");
        staff.fillPosition("President",
                new com.spread.ydy.thkinjava.chap14Rtt.Staff.Person("Me", "Last", "The Top, Lonely At"));
        staff.fillPosition("Project Lead",
                new com.spread.ydy.thkinjava.chap14Rtt.Staff.Person("Janet", "Planner", "The Burbs"));
        if(staff.positionAvailable("Software Engineer"))
            staff.fillPosition("Software Engineer",
                    new com.spread.ydy.thkinjava.chap14Rtt.Staff.Person("Bob", "Coder", "Bright Light City"));
        System.out.println(staff);
    }

    public static class Person {
        public final String first;
        public final String last;
        public final String address;

        // etc.
        public Person(String first, String last, String address) {
            this.first = first;
            this.last = last;
            this.address = address;
        }

        public String toString() {
            return "Person: " + first + " " + last + " " + address;
        }

        public static class NullPerson extends Person implements Null {
            private NullPerson() {
                super("None", "None", "None");
            }

            public String toString() {
                return "NullPerson";
            }
        }

        public static final Person NULL = new NullPerson();
    }

    public static class Position {
        private String title;
        private Person person;

        public Position(String jobTitle, Person employee) {
            title = jobTitle;
            person = employee;
            if (person == null)
                person = Person.NULL;
        }

        public Position(String jobTitle) {
            title = jobTitle;
            person = Person.NULL;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String newTitle) {
            title = newTitle;
        }

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person newPerson) {
            person = newPerson;
            if (person == null)
                person = Person.NULL;
        }

        public String toString() {
            return "Position: " + title + " " + person;
        }
    }
} /* Output:	
[Position: President Person: Me Last The Top, Lonely At, Position: CTO NullPerson, Position: Marketing Manager NullPerson, Position: Product Manager NullPerson, Position: Project Lead Person: Janet Planner The Burbs, Position: Software Engineer Person: Bob Coder Bright Light City, Position: Software Engineer NullPerson, Position: Software Engineer NullPerson, Position: Software Engineer NullPerson, Position: Test Engineer NullPerson, Position: Technical Writer NullPerson]
*///:~
