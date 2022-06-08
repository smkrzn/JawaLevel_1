package Lesson5;

public class Main {

    public static void main(String[] args) {
        Staff[] staff = new Staff[5];
        staff[0] = new Staff("Иванов И.И.", 42, "Бухгалтер", "+79090909090", "ivanov@mail.com", 30000);
        staff[1] = new Staff("Петров П.П.", 30, "Кладовщик", "+79040404040", "petrov@mail.com", 25000);
        staff[2] = new Staff("Сидоров С.С.", 50, "Водитель", "+72020202020", "sidorov@mail.com", 22000);
        staff[3] = new Staff("Васин В.В.", 29, "Менеджер", "+76060606060", "vasin@mail.com", 38000);
        staff[4] = new Staff("Володин В.В.", 46, "Слесарь", "+73030303030", "volodin@mail.com", 34000);

        for (int i = 0; i < staff.length; i++){
            if (staff[i].getAge() >= 40) {
                staff[i].print();
            }
        }

    }


}
