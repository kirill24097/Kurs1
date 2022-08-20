public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee emp1 = new Employee("кирилл", "Смирнов", "Анатольевич", 1, 113331);
        Employee emp2 = new Employee("кирилл", "Смирнов", "Анатольевич", 2, 113332);
        Employee emp3 = new Employee("кирилл", "Смирнов", "Анатольевич", 3, 113333);
        Employee emp4 = new Employee("кирилл", "Смирнов", "Анатольевич", 4, 113334);
        Employee emp5 = new Employee("кирилл", "Смирнов", "Анатольевич", 5, 113335);


        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);


        employees[0] = emp1;
        employees[1] = emp2;
        employees[2] = emp3;
        employees[3] = emp4;
        employees[4] = emp5;
    }

}









