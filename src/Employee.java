public class Employee
{   //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    private String name;
    private String position;
    private String email;
    private int telephone;
    private int salary;
    private int age;

    public int getAge()
    {  //Создали "геттер" для "age";
        return age;
    }

    //Конструктор класса должен заполнять эти поля при создании объекта;
    public Employee(String name, String position, String email, int telephone, int salary, int age )
    {
    this.name = name;
    this.position = position;
    this.email = email;
    this.telephone = telephone;
    this.salary = salary;
    this.age = age;
    }
    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    public void information()
    {
        System.out.println(" ФИО " + name + " Должность " + position + " em@il " + email + " Зарплата " + salary + " Возраст " + age);
    }
}

