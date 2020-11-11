public class mainPers {
    public static void main(String[] age)
    {   //Создать массив из 5 сотрудников;
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Kirill Ivanovich Kapitoliev", "снайпер SOBR MSK", "Kapitoliev@mail.ru", 999309309, 70000, 35);
        employees[1] = new Employee("Ivan Ivanovich Brusnica", "зам. по боевой службе FSB", "Brusnica@mail.ru", 999509509, 150000, 46);
        employees[2] = new Employee("Ruslan Ilich Gloc", "боец высотник OMON", "Gloc@mail.ru", 999889809, 120000, 41);
        employees[3] = new Employee("Alecsandr Petrovich Malahov", "водитель DPS", "Malahov@mail.ru", 950308004, 65000, 38);
        employees[4] = new Employee("Max Alecsandrovich Dikii", " главный председатель head of the State Duma", "Dikii@mail.ru", 999999980, 420000, 55);
        for (int i = 0; i < employees.length; i++)
        {   //С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
            if (employees[i].getAge() > 40)
            {
                employees[i].information();
            }
        }
    }
}
