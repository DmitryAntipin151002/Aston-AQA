public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Терещенко Сергей Владимирович", "Учитель истории", 34,
                "tereschenko.s.v@works.com", 700, "+375337225705");
        employees[1] = new Employee("Соколов Николай Казимирович", "Senior Data-Scientist", 29,
                "sokol862@gmail.com", 3500, "+7037583004");
        employees[2] = new Employee("Солтаков Евгений Михайлович", "Психолог", 67,
                "sltEvgMich@yandex.by", 500, "+375297522802");
        employees[3] = new Employee("Стукова Валерия Николаевна", "Стоматолог", 25,
                "ValierriiS@gmail.com", 1200, "+7285642200");
        employees[4] = new Employee("Дубровский Владимир Владимирович", "Мэр", 42,
                "dubrovskiVV.work@mail.ru", 1500, "+375382917667");

        for (Employee emp : employees) {
            emp.printInfo();
            System.out.println();
        }

        Park park = new Park(7);
        park.addAttraction("Карусель", "12:00 - 18:00", 100);
        park.addAttraction("Колесо обозрения", "15:00 - 22:00", 500);
        park.addAttraction("Молоток", "12:30 - 20:00", 200);

        System.out.println(park.getAttractions()[2]);
    }
}
