import java.util.Scanner;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;



public class Main {
    public static void main(String[] args) throws IOException {


//class Student {
//    private String name;
//    private int age;
//    private double averageGrade;
//
//    public Student(String name, int age, double averageGrade) {
//        this.name = name;
//        this.age = age;
//        this.averageGrade = averageGrade;
//    }
//
//    public double getAverageGrade() {
//        return averageGrade;
//    }
//}
//
//class Group {
//    private Student[] students;
//    private int size;
//
//    public Group(int capacity) {
//        students = new Student[capacity];
//        size = 0;
//    }
//
//    public void addStudent(Student student) {
//        students[size] = student;
//        size++;
//    }
//
//    public void removeStudent(Student student) {
//        for (int i = 0; i < size; i++) {
//            if (students[i] == student) {
//                for (int j = i; j < size - 1; j++) {
//                    students[j] = students[j+1];
//                }
//                size--;
//                break;
//            }
//        }
//    }
//
//    public double getAverageGrade() {
//        double sum = 0;
//        for (int i = 0; i < size; i++) {
//            sum += students[i].getAverageGrade();
//        }
//        return sum / size;
//    }
//}

//            Group group = new Group(5);
//
//            Student student1 = new Student("Alice", 20, 4.5);
//            Student student2 = new Student("Bob", 22, 5.7);
//            Student student3 = new Student("Charlie", 21, 4.2);
//
//            group.addStudent(student1);
//            group.addStudent(student2);
//            group.addStudent(student3);
//
//            double averageGrade = group.getAverageGrade();
//            System.out.println("Average grade of the group: " + averageGrade);

//          String[] users = {"Anna", "Vika", "Jenya", "Alena", "Luba", "Ira"};
//            int user = 0;
//            for(user = 0; user < 6; user += 1){
//            System.out.println(users[user]);}

//            for (int i = 0; i < 100; i += 10) {
//                if (i == 50) {
//                    break;
//                }
//                System.out.println("stroka " + i);
//            }
//            int i = 100;
//            do {
//                System.out.println("YA vypolnilsya");
//            } while (i < 10);

//            String s;
//            int number;
//
//            Scanner input = new Scanner(System.in);
//
//
//            do {
//                System.out.print("inter digits from 1 to 5: ");
//                number = input.nextInt();
//            } while (number < 1 || number > 5);

//            System.out.println("\t\t\t\tMultiplicationTable\n");
//
//            // Отобразить имена столбцов
//            for (int j = 1; j <= 9; j++)
//                System.out.print("\t "  + j);
//
//            System.out.println("\n \t \t_\t_\t_\t_\t_\t_\t_\t_\t_");
//
//            // Отобразить имена строк и произведение
//            for (int i = 1; i <= 9; i++) {
//                System.out.print(i + "   |");
//                for (int j = 1; j <= 9; j++) {
//                    System.out.printf("\t" + i * j);
//                }
//                System.out.println();
//            }

//            int mult;
//
//            for (mult = 0; mult < 100; mult += 5) {
//                if (mult == 55) {
//                    continue;
//                }
//                System.out.println(mult);
//            }


        // Отобразить имена столбцов
/*
            for (int j = 0; j <= 9; j)
                System.out.println(j);
*/

//            System.out.println("\n \t \t_\t_\t_\t_\t_\t_\t_\t_\t_");
//
//            // Отобразить имена строк и произведение
//            for (int i = 1; i <= 11; ++i) {
//                for (int j = 0; j < i; ++j)
//                    System.out.print("  " + j);
//                System.out.println();
//            }
//            for (int k = 10; k > 0; --k) {
//                for (int m = 0; m < k; ++m)
//                    System.out.print("  " + m);
//                System.out.println();
//            }


//            Scanner input = new Scanner(System.in);
//            int ages = 0;
//            System.out.println("Input ages: " );
//            ages = input.nextInt();
//            int ticketPrice = 0;
//            if (ages >= 16){
//                ticketPrice = 20;}
//            else{
//                ticketPrice = 10;}
//            System.out.println(ticketPrice);


//            int year;
//            boolean isLeapYear;
//            Scanner input = new Scanner(System.in);
//            System.out.println("Input counts days in year: " );
//            year = input.nextInt();
//
//            if ((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)){
//                isLeapYear = true;
//            }
//            else {
//                isLeapYear = false;
//            }
//// Високосный год, кратный 4, но не кратный 100
//            isLeapYear = isLeapYear && (year % 100 != 0);
//// Високосный год, кратный 4, но не кратный 100, или кратный 400
//            isLeapYear = isLeapYear || (year % 400 == 0);
//            System.out.println(isLeapYear);

//            Задание 2.5.5
//            Напишите программу которая считывает символ + и = в
//            char и выводит сообщение на экран, в зависимости от ввода: “Считан плюс” или “Считано равно”.
//
//            Посмотреть ответ


//            Scanner input = new Scanner(System.in);
//            System.out.println("simbol: " );
//            char charInput = input.next().charAt(0);
//            if (charInput == '+'){
//                System.out.println("S4itan +");
//            } else if (charInput == '='){
//System.out.println("S4itan =");
//            }
//            else {
//                System.out.println("Vse ne to");
//}


//            Задание 2.5.6
//            Какой будет результат следующих логических выражений при x равном 1?
//
//                    (true) && (3 > 4)
//            !(x > 0) && (x > 0)
//            (x > 0) || (x < 0)
//            (x != 0) || (x == 0)
//            (x >= 0) || (x < 0)
//            (x != 1) == !(x == 1)

//        int x = 1;
//            System.out.println((true) && (3 > 4));
//            System.out.println(!(x > 0) && (x > 0));
//            System.out.println((x > 0) || (x < 0));
//            System.out.println((x != 0) || (x == 0));
//            System.out.println((x >= 0) || (x < 0));
//            System.out.println((x != 1) == !(x == 1));

//            Задание 2.5.7
//            Напишите логическое выражение, которое равно true, если число,
//                    сохраненное в переменной num, находится в диапазоне от 1 до 100
//            не включительно или если число является отрицательным.

//        int num = -353;
//            System.out.println(  (num > 1) && (num < 100));
//            System.out.println(  (num > 1) && (num < 100) || num < 0 );
//        if (num > 1 && num <100){
//            System.out.println("true");
//        }
//            else if (num < 0 ){
//                System.out.println("true");
//            }
//             else {
//            System.out.println("Vse ne to");
//        }

//            Задание 2.5.8
//            Перепишите следующий код с использованием тернарного оператора:
//

//                    int variable = 7;
//                    if (variable > 10) {
//                        variable = variable - 10;
//                    } else {
//                        variable = variable + 10;
//                    }
//                    System.out.println(variable);

//        int variable = 7;
//        int answer = ((variable > 10) ? (variable = variable - 10) :  (variable = variable + 10));
//        System.out.println(answer);

//        Задание 2.5.10
//        С помощью оператора switch реализуйте метод «дешифратор», используя программу IntelliJ IDEA.
//        Расшифровка будет происходить по следующим правилам:
//        'h' → "Hello!"
//        'i', 'm', 'k' → "I can decode!"
//        'b' → "Bye!"
//        Ни один из указанных → "I don't know these symbols :("
//        Например, если символ равен 'h', то результатом работы будет слово "Hello".

//    Scanner input = new Scanner(System.in);
//    System.out.println("input symbol: ");
//    char charInput = input.next().charAt(0);
//        switch (charInput) {
//            case ('h'):
//                System.out.println("Hello");
//            break;
//            case ('m'):
//                System.out.println("I can decode");
//            break;
//            case ('b'):
//                System.out.println("Bye");
//            break;
//            default:
//                System.out.println("I dont know these symbols :(" );
//            break;
//
//        }

//        char ch1 = 'h';
//        char ch2 = 'i';
//        char ch3 = 'b';
//
//        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
//
//  }
//  public static String decode(char ch) {
//        switch (ch) {
//            case 'h':
//                return "Hello!";
//            case 'i':
//            case 'm':
//            case 'k':
//                return "I can decode!";
//            case 'b':
//                return "Bye!";
//            default:
//                return "I don't know these symbols :(";
//        }
//    }
//}

//        Задание 2.5.11
//        Создайте цикл, выводящий на экран чётные цифры из диапазона от 2 до 10 включительно.


//for (int i = 2; i <= 10; i++) {
//    if (i % 2 == 1){
//        continue;
//    }
//    System.out.println(i);


//Задание 2.5.12
//Необходимо вычислить индекс массы тела человека.
// Указать на проблему, если индекс показал критическое значение, вывести сообщение о проблеме (если таковая имеется).
// Самостоятельно найдите формулу расчета и реализуйте алгоритм с использованием изученного ранее материала.
//}
//        int weight = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("vvedite vash ves: ");
//        weight = input.nextInt();
//
//        if (weight > 110) {
//            System.out.println("Have problems");
//        } else if (weight < 110 && weight > 90) {
//            System.out.println("Otmenym yjin");
//        } else if (weight < 89 && weight > 70) {
//            System.out.println("Soydet");
//        } else {
//            System.out.println("Slomal vesy");
//        }
//        Задание 2.5.14
//        Давайте попробуем написать классическую игру «Угадай число».
//        В этой игре программа будет генерировать случайное число, а игрок будет пытаться его угадать.
//        В случае успеха игрока программа должна выводить какое-либо
//        Random rand = new Random();
//        Scanner input = new Scanner(System.in);
//        int randInt = 0;
//        int guessNumber = 0;
//        randInt = rand.nextInt(10) + 1;
//        while (true) {
//
//            System.out.println("Vvedite 4islo: (dlya vyhoda vvedite 15)");
//            guessNumber = input.nextInt();
//            try {
//                if (randInt == guessNumber) {
//                    System.out.println("Vi geniy!!!Chislo bilo: " + randInt);
//                    System.out.println("Spasibo za igry. Igra okon4ena!!");
//                    System.exit(0);
//                } else {
//                    System.out.println("Ne ygadal.");
//                if (guessNumber > randInt) { System.out.println("Vashe chislo bolshe");}
//                    else { System.out.println("Vashe chislo men6e") ;}
//
//
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Пожалуйста, введите корректное число или 'q' для выхода.");
//            }
//        }

//        OneBoxer oneBoxer;
//        oneBoxer = new OneBoxer();
//        TwoBoxer twoBoxer = new TwoBoxer();
//        fight(oneBoxer, twoBoxer);
//
//
//    }
//
//    private static void fight(OneBoxer oneBoxer, TwoBoxer twoBoxer) {
//        while (true) {
//            if (!oneBoxer.isOneBoxerAlive && twoBoxer.isTwoBoxerAlive) {
//                System.out.println("TwoBoxer is dead. OneBoxer win!");
//                break;
//            } else if (oneBoxer.isOneBoxerAlive && !twoBoxer.isTwoBoxerAlive) {           //Задание 2.5.15
//                System.out.println("OneBoxer is dead. TwoBoxer win!");                   //Напишите программу, в которой создаются 2 «противоборствующих» объекта (от
//                break;                                                                  // разных классов), состояние которых описывается параметрами: «имя» (строковый,
//            } else if (!oneBoxer.isOneBoxerAlive && !twoBoxer.isTwoBoxerAlive) {        // необязательно), «здоровье» (целочисленный), «сила удара» (целочисленный),
//                System.out.println("All is dead...");                                 // текущее состояние жив/не жив (логический).
//                break;
//            }                                                                           // В основном или отдельном классе создать статический метод, который будет
//            if (oneBoxer.health < 0) {                                                  //осуществлять «бой насмерть» (подсказка: в бесконечном цикле с каждой
//                oneBoxer.isOneBoxerAlive = false;                                       //итерацией цикла от здоровья одного объекта будет вычитаться сила удара другого
//            } else {                                                                    // объекта, пока здоровье одного из объектов (или обоих, при равных условиях) не
//                oneBoxer.health -= twoBoxer.power;                                     // будет меньше либо равно нулю.
//            }
//            if (twoBoxer.health < 0) {                                              //По окончанию цикла сделать вывод в консоль с указанием, какой из объектов
//                twoBoxer.isTwoBoxerAlive = false;                               //«победил».
//            } else {
//                twoBoxer.health -= oneBoxer.power;
//            }
//        }
//
//    }
//    public class OneBoxer  {
//        public String name;
//        public int health = 10044;
//        public int power = 644;
//        public boolean isOneBoxerAlive = true;
//    }
//
//    public class TwoBoxer {
//        public String name;
//        public int health = 1200;
//        public int power = 155;
//        public boolean isTwoBoxerAlive = true;

////        Задание 2.5.16
////        Необходимо закомментировать некоторые из строк так,
////        чтобы переменная a приняла значение 18. Вывести её в консоль 20 раз.
//
//                int a = 4, b = 3, c = 2;
//                b = b + c;
////                a = a * b;
//                c = a - c;
////                a = a + b;
//                a = a - b;
//                c = a + b;
////                b = c / a;
//                a = b + c;
//                a = a + c + b;
//
//for (int i = 0; i < 20; i++){
//    System.out.println(a);


//        Задание 2.5.17
//        Написать код расчета периметра равнобедренного треугольника,
//        квадрата, окружности и вывести эти значения в консоль.
//        Параметры для расчета задаются статическими переменными, без ввода с клавиатуры.
//        Для расчета периметра фигуры необходимо создать свой класс.
//            Формат вывода:


//                int sideLengthTriangle = 3;
//                int sideLengthSquare = 4;
//                int radius = 5;
//                System.out.println("Perimetr triangle = " + PerimeterTriangle(sideLengthTriangle));
//                System.out.println("Perimetr square = " + PerimeterSquare(sideLengthSquare));
//                System.out.println("Perimetr circle = " + PerimeterCircle(radius));
//            }
//            public static int PerimeterTriangle(int length) {
//                int P = 3 * length;
//                return P;
//            }
//            public static int PerimeterSquare(int length) {
//                int P = 4 * length;
//                return P;
//            }
//            public static double PerimeterCircle(int radius) {
//                double PI = 3.14159;
//                double P = 2 * PI * radius;
//                return P;
//
//    }
//
//}


//        Задание 2.5.18
//        Проверить на практике утверждение, что на отрезке от 0 до 2PI y=sin(cos(x)) всегда будет больше, чем y=cos(sin(x)).
////                Входные данные:
////        Нижнее значение отрезка.
//                Верхнее значение отрезка.
//        Шаг дискретизации.
//        Вывод данных обеспечить в консоль.

//        System.out.println("Programma sravneniia znachenii` y=sin(cos(x)) и y=cos(sin(x)");
//        System.out.println("Vvedite nizhnee znachenie x:");
//        Scanner scanner = new Scanner(System.in);
//        double x_down = scanner.nextDouble();
//        System.out.println("Vvedite verkhnee znachenie x:");
//        double x_up = scanner.nextDouble();
//        System.out.println("Vvedite shag diskretizatcii:");
//        double step = scanner.nextDouble();
//        double i = x_down;
//        do {
//            if (Math.sin(Math.cos(i)) < Math.cos(Math.sin(i))) {
//                System.out.println("Pri x = " + i + " sin(cos(x)) = " +
//                        Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) men`she, chem cos(sin(x))");
//            } else if (Math.sin(Math.cos(i)) > Math.cos(Math.sin(i))) {
//                System.out.println("Pri x = " + i + " sin(cos(x)) = " +
//                        Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) bol`she, chem cos(sin(x))");
//            } else {
//                System.out.println("Pri x = " + i + " sin(cos(x)) = " +
//                        Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) raven cos(sin(x))");
//            }
//            i += step;
//        }
//        while (i <= x_up);


//        Задание 2.5.19
//        Нужно написать программу, которая выводит
//        на консоль простые числа в промежутке от 2 до 100.
//        Решето Эратосфена
//        for (int i = 2; i <= 100; i++) {
//            if (i % i != 0) {
//                continue;
//            }
//            else if (i>2 && i % 2 == 0) {
//                continue;
//            }

//            System.out.println(i);
//        }

//        for(int i = 2; i <= 1000; i ++) {
//            boolean isExit = true;
//
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isExit = false;
//                    break;
//                }
//            }
//
//            if (isExit) {
//                System.out.println(i);
//            }
//
//        }


//        public class BankAccount {
//            private double limit;
//            private double balance;
//            private double accountNumber;
//
//            public BankAccount(double limit, double balance, double accountNumber) {
//                this.limit = limit;
//                this.balance = balance;
//                this.accountNumber = accountNumber;
//            }
//            public double getLimit() {
//                return limit;
//            }
//            public double getBalance() {
//                return balance;
//            }
//            public double getAccountNumber() {
//                return accountNumber;
//            }
//            public void deposit(double amount) throws InvalidSumException {
//                if (amount <= 0) {
//                    throw new InvalidSumException("Sum must be positiv");
//                }
//                balance += amount;
//                System.out.println("New balance: " + balance);
//            }
//            public void withdraw(double amount) throws InvalidSumException, InsufficientBalanceException {
//                if (amount <= 0) {
//                    throw new InvalidSumException("Sum must be positiv");
//                }
//                if (amount > balance) {
//                    throw new InsufficientBalanceException("Accaunt must be greater then balance");
//                }
//                balance -= amount;
//                System.out.println("New balance: " + balance);
//            }
//            public void transfer(BankAccount toBankAccount, double amount) throws AccountNotFoundException, InvalidSumException, InsufficientBalanceException {
//                if (toBankAccount == null) {
//                    throw new AccountNotFoundException("CAn`t FIND account");
//                }
//                if (amount <= 0) {
//                    throw new InvalidSumException("Sum must be positiv");
//                }
//                if (amount > balance) {
//                    throw new InsufficientBalanceException("Accaunt must be greater then balance");
//                }
//                this.balance -= amount;
//                toBankAccount.balance += amount;
//                System.out.println("New balance: " + toBankAccount.balance);
//            }
//        }


//        Задание 2.5.20
//        Напишите простую программу для салона пирсинга, где при вводе
//        возраста клиента через переменную выводились бы соответствующие ограничения:
//        младше 14: прокол ушей в присутствии родителей;
//        от 14 до 18: прокол ушей, пупка, языка, носа в присутствии родителей;
//        от 18 лет: без ограничений.

//Scanner input = new Scanner(System.in);
//int age = 0;
//        System.out.println("Enter your age: ");
//        age = input.nextInt();
//        if (age < 14){
//            System.out.println("prokol ushei` v prisutstvii roditelei`");
//        }
//        else if  ((18 > age) && (age >= 14)){
//            System.out.println("prokol ushei`, pupka, iazy`ka, nosa v prisutstvii roditelei`");
//        }
//        else {
//            System.out.println("bez ogranichenii");
//        }


//        Задание 2.5.21
//        Тест на внимательность: исправьте ошибки в коде.

//System.out.println(result)
//                int value = add(7, 8)
//                int result = add(value, 15)
//            }
//            int result = (x + y)
//            private static int add( int x, int y) {
//                return result;


//        int value = add(7, 8);
//        int result = add(value, 15);
//        System.out.println(result);
//    }
//
//    private static int add( int x, int y) {
//        return (x + y);

//        public class Loader {
//            public static void main(String[] args) {
//                int a = 10;
//                while (a > 0)
//                    do {
//                        a -= 1;
//                    }
//                System.out.println(a);
//            }
//        }


//        Задание 2.5.22
//        Создать класс Loader с методом public static void main, в котором реализуются следующие задачи:
//
//        Объявить целочисленную переменную a, инициализировать значением 10.
//        Создать цикл while, который должен выполняться, пока a больше нуля, при каждом шаге a уменьшается на 1.
//        При значении a, равном 5, реализовать выход из цикла.
//                Объявить целочисленную переменную summ, инициализировать значением 0.
//        Реализовать цикл for с итерационной переменной i, равной нулю. Цикл должен выполняться, пока i меньше 50, с каждым шагом i увеличивается на единицу.
//        С каждым шагом цикла увеличивать значение summ на i. При значении i, равном 45, пропустить итерацию.
//                Создать switch с проверкой summ, со следующими условиями:
//        при summ, равной 50, вывести значение 50;
//        при summ, равной 1180, вывести значение 1180;
//        при summ, равной 1225, вывести значение 1225;
//        во всех остальных случаях "Результат неверный".
//        8. Проверить условие: если а равно 5 и summ равно 1180, вывести на экран "Условие выполнено", иначе — "Условие не выполнено".
//
//                Решением задачи является вывод на экран "Условие выполнено".


//
//        public class Loader {
//            public static void main(String[] args) {
//                int a = 10;
//                int summ = 0;
//                while (a >= 0) {
//                    a -= 1;
//                    if (a == 5) {
//                        break;
//                    }
////         System.out.println(a);
//                }
//                for (int i = 0; i < 50; i++) {
//                    summ = summ + i;
//                    if (i == 45) {
//                        continue;
//                    }
//                    switch (summ) {
//                        case (50):
//                            System.out.println(50);
//                            break;
//                        case (1180):
//                            System.out.println(1180);
//                            break;
//                        case (1225):
//                            System.out.println(1225);
//                            break;
//                        default:
//                            System.out.println("Wrong resault");
//                            break;
//                    }
//                    if (a == 5 && summ == 1180) System.out.println("Uslovie vy`polneno");
//                    else System.out.println("Uslovie ne vy`polneno");
//                }
//            }
//        }


//        Задание 2.5.23
//        Из ведра объемом 30 литров нужно перелить воду в пустое ведро.
//                Каждый десятый литр проливается мимо. Вывести процесс перелива
//        в консоль — в первом ведре количество уменьшается, во втором увеличивается.
//        Пример:

//        29
//        1
//        28
//        2
//        27
//        18
//        и т.д.

//        int a = 30;
//        int b = 0;
//        while (a > 0) {
//            a--;
//            if (a % 10 != 0) {
//                b++;
//            }
//            System.out.println(a);
//            System.out.println(b);
//        }

//  Scanner input = new Scanner(System.in);
//
//
//
//        }
//    public static class Cat {
//String nameCat = null;
//int weightCat = 3;
//int ageCat = 0;

//        Задание 2.5.24
//        Программа «Жизнь кота»
//
//        Задача состоит в следующем: необходимо написать программу, которая будет эмулировать тамагочи 80-х годов. У нас есть возможность кормить кота, играть с котом, показывать его общее состояние. Также отсчитывать время жизни кота.
//
//                Первое, что должно быть — это создание кота. Программа должна просить ввод имени кота и задавать ему следующие параметры:
//
//        Вес кота: 3 кг
//        Возраст кота: 0 лет
//        После создания кота должно появиться «Меню кота». Каждый 20-й раз появление этого меню должно сопровождаться прибавлением 1 года к жизни кота. Каждый вызов этого меню должен сопровождаться уменьшением его массы на несколько грамм и увеличением голода:
//
//        1. Состояние кота
//
//        В состоянии кота должна открываться следующая информация: его возраст, вес, голод, желание играть. В пунктах Голод и Желание играть находится значение от 0 до 100, где 0 — сильно хочется, а 100 — полное насыщение.
//
//        2. Кормление кота
//
//        Меню питания должно состоять из нескольких кормов на ваше усмотрение. Каждое блюдо должно прибавлять разную массу к коту и утолить его голод на несколько пунктов. Кот должен отказываться от еды, если его Голод находится на отметке свыше 50.
//
//        3. Игра с котом
//
//        Кот должен отказываться от игры, если его голод в зонах: от 0 до 20 и от 90 до 100. Кот не должен хотеть играть, если он наигрался на 100. Программа должна нас оповестить, почему именно кот отказывается от игры.
//
//                Программа должна управляться командами: конкретными символами или любым символом. Программа должна завершаться при нажатии на клавишу «S».


//            static String name;
//            static int age = 0;
//            static double weight = 3.0;
//            static byte hunger = 0;
//            static byte needgames = 0;
//
//
//                Scanner scanner = new Scanner(System.in);
//                boolean program = true;
//                char menu = '0';
//                System.out.println("Добро пожаловать в CatLive!");
//                System.out.println("Давайте создадим вашего первого питомца");
////        Создаем кота:
//                System.out.print("Введите имя вашего питомца: ");
//                name = scanner.nextLine();
//
////        Кота создали.
////        Меню состояния кота
//                while (program) {
//                    for (int variants = 0; variants < 500; variants++) {
//                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//                        if (variants < 1) {
//                            System.out.println("Мы создали нашего кота! Давайте посмотрим на его состояние");
//                        }
//                        System.out.println("Выберите и введите пункт меню, для обзора действий с котом:");
//                        System.out.println("1. Состояние кота");
//                        System.out.println("2. Кормление кота");
//                        System.out.println("3. Поиграть с котом");
//                        System.out.println("\"S\" - для выключения программы");
//                        menu = scanner.next().charAt(0);
//                        switch (menu) {
//                            case '1':
//                                System.out.println("Возраст кота: " + age);
//                                System.out.println("Вес: " + weight + " кг");
//                                System.out.println("Голод: " + hunger);
//                                System.out.println("Игры: " + needgames);
//                                System.out.println("Введите любую клавишу, что бы выйти из меню");
//                                menu = scanner.next().charAt(0);
//                                break;
//                            case '2':
//                                cateating();
//                                break;
//                            case '3':
//                                catgames();
//                                break;
//                            case 'S':
//                                variants = 501;
//                                program = false;
//                                break;
//                            default:
//                                System.out.println("Неверная команда, повторите ввод.");
//                        }
//                        if (variants >= 20) {
//                            age += 1;
//                        }
//                        hunger -= 5;
//                        if (hunger <= 0) {
//                            hunger = 0;
//                        }
//                        weight -= 0.1;
//                    }
//                }
//            }
//
//
//                char eatmenu;
//                boolean eatHunger = true;
//                Scanner scanner = new Scanner(System.in);
//                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//                while (eatHunger) {
//                    byte cycles = 0;
//                    while (cycles < 1) {
//                        cycles += 1;
//                        if (hunger >= 50) {
//                            System.out.println("Похоже кот не голоден");
//                            System.out.println("введите \"x\" для выхода");
//                        } else {
//                            System.out.println("Выберите блюдо:");
//                            System.out.println("1. Консервы с тунцом");
//                            System.out.println("2. Кроличий паштет");
//                            System.out.println("3. Колбаса со стола");
//                            eatmenu = scanner.next().charAt(0);
//                            switch (eatmenu) {
//                                case '1':
//                                    System.out.println("Кот благодарен вам и, похоже он набрал лишние 20 грамм. Давайте поиграем с " + name);
//                                    System.out.println("введите \"x\" для выхода");
//                                    hunger += 40;
//                                    weight += 0.20;
//                                    break;
//                                case '2':
//                                    System.out.println("Кот благодарен вам и, похоже он набрал лишние 40 грамм. Давайте поиграем с " + name);
//                                    System.out.println("введите \"x\" для выхода");
//                                    hunger += 60;
//                                    weight += 0.40;
//                                    break;
//                                case '3':
//                                    System.out.println("Кот благодарен вам и, похоже он набрал лишние 60 грамм. Давайте поиграем с " + name);
//                                    System.out.println("введите \"x\" для выхода");
//                                    hunger += 80;
//                                    weight += 0.60;
//                                    break;
//                                default:
//                                    System.out.println("Неверная команда, попробуйте занового. Введите \"x\" для выхода");
//                                    break;
//                            }
//                            if (hunger >= 100) {
//                                hunger = 100;
//                            }
//                        }
//                        eatmenu = scanner.next().charAt(0);
//                        if (eatmenu == 'x') {
//                            eatHunger = false;
//                        } else
//                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//                        System.out.println("Неверная команда, попробуйте еще раз");
//                    }
//                }
//            }
//
//
//                char gamemenu;
//                Scanner scanner = new Scanner(System.in);
//                for (int game = 0; game < 100; game += 50) {
//                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//                    if (needgames >= 100) {
//                        System.out.println("Кажется кот наигрался и хочет поесть");
//                    } else if (hunger <= 20 || hunger >= 90) {
//                        System.out.println("Я не могу играть потому что голоден или много съел");
//                        System.out.println("Кот развернулся и ушел спать");
//                    } else {
//                        needgames += 50;
//                        System.out.println("Поиграли хорошо + " + needgames);
//                        hunger -= 60;
//                        weight -= 0.3;
//                    }
//                    System.out.println("Введите \"x\" для выхода");
//                    gamemenu = scanner.next().charAt(0);
//                    switch (gamemenu) {
//                        case 'x' -> game = 100;
//                        default -> System.out.println("Неверно введена команда");
//                    }
//                }
//            }
//        }
//


//        Задание 2.5.25
//        Петя и Коля живут в одном многоэтажном доме. Квартира Коли на 12 этажей выше, чем квартира Пети.
//        Вечером Петя поднимался по лестнице к Коле. Когда он прошёл половину пути, то оказался на 8 этаже.
//            На каких этажах находятся квартиры мальчиков?
//        int kvPet = 12/2+8;
//        int kvKol = kvPet - 12;
//        System.out.println("Kolya jivet na etaje: " +  kvKol + " Petya jivet na etaje: " + kvPet);
//
//
//        int kolya = 12;
//        int petya = 8;
//        kolya /= 2;
//        kolya += petya;
//        petya = kolya - 12;
//        System.out.println("Петя живет на " + petya + " этаже.");
//        System.out.println("Коля живет на " + kolya + " этаже.");

//        Задание 2.5.26
//        Таблица умножения:
//
//        1 1 2 3 4 5 6 7 8 9
//        2 2 4 6 8 10 12 14 16 18
//        3 3 6 9 12 15 18 21 24 27
//        4 4 8 12 16 20 24 28 32 36
//        5 5 10 15 20 25 30 35 40 45
//        6 6 12 18 24 30 36 42 48 54
//        7 7 14 21 28 35 42 49 56 63
//        8 8 16 24 32 40 48 56 64 72
//        9 9 18 27 36 45 54 63 72 81
//        Первый символ показывает цифру, на которую умножается
//        ряд, а далее следуют результаты в ряд по горизонтали.
//
// for (int i = 1; i <=9; i++) {
//     System.out.print(i + " |");
//     for (int j = 1; j <= 9; j++) {
//         System.out.print(i * j + " "); // умножаем не в цикле, а в выводе!!
//     }                                 //for (int j = 1; j <= 9; i*j); - не так
//     System.out.println();
// }

//        Задание 2.5.27
//        Настало время побить гада летающего, что люд русский губит. Вставай, Добрынюшка, да побей Горыныча!
//
//                Задача:
//
//        Приведите код к читаемому виду.
//                Распределите действия перемещения к Горынычу по методам.
//        Исправьте показатель Урона за ход.
//                Приведите операторы присваивания к инкременту.
//        Сделайте к каждому удару отдельное описание.
//        Исправьте сигнатуру класса.
//                Найдите ошибку в описании Богатыря.

//        public class Bogatyr {
//            private String name = "Dobryia";
//            private String classs = "Bogatyr";
//            private String weapon = "Mech - Cladenetc (Uron: 100)";
//            private Boolean idtiBitGorynycha = true;
//            private int damage = 100;
//            private final int golovaB = 1;
//            public void idtiBitGorynycha() {
//                System.out.println("Vyhodim iz Kieva...");
//                System.out.println("Idem na Kudykinu goru...");
//                System.out.println("Sadimsia na konia...");
//                System.out.println("Gde eta zmeiuka...?");
//            }
//            public void bitva() {
//                int udar = 0;
//                short dpt = 0; // Damage Per Turn       //Так же, принимается изменение на "int"
//
//                switch (udar) {     // Описания ударов могут различаться
//                    case 0:
//                        udar++;
//                        dpt += damage;
//                        System.out.println("Первая голова отрублена");
//                        System.out.println("Суммарный урон: " + dpt);
//                    case 1:
//                        udar++;
//                        dpt += damage;
//                        System.out.println("Вторая голова отрублена");
//                        System.out.println("Суммарный урон: " + dpt);
//                    case 2:
//                        udar++;
//                        dpt += damage;
//                        System.out.println("Третья голова отрублена");
//                        System.out.println("Суммарный урон: " + dpt);
//                    case 3:
//                        System.out.println("Горыныч побежден.");
//                        break;
//                }
//
//            }
//            public void golovy() {
//                if (golovaB < 3) {
//                    System.out.println("Odna golova horosho, a tri - uzhe Gory`ny`ch.");
//                }
//            }
//        Bogatyr bogatyr = new Bogatyr();
//        bogatyr.idtiBitGorynycha();
//        bogatyr.golovy();
//        bogatyr.bitva();

//        Задание 2.5.28
//        Вычислить значение функции:

//E(n) (i=1) = x2+1  / i

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Vvedite znachenie n: ");
//        double n = scanner.nextInt();
//        System.out.print("Vvedite znachenie x: ");
//        double  x = scanner.nextInt();
//        double sum = 0;
//        for (double i = 1; i <= n ; i++) {
//         sum += (Math.pow(x, 2)/i) + (1 / i);
//        }
//        System.out.println(sum);

//        int[] array = new int[5];
//        array [2] = 89;
//        System.out.println(Arrays.toString(array));

//        int[] nums = new int[10];
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

//        int[] nums = new int[10];
//        nums[0] = 1;
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

//        int[] array = {22, 4, 5, 6};
//        int[] copyarray = Arrays.copyOf(array, array.length);
//        System.out.println(Arrays.toString(copyarray));

//        int[] array = {22, 4, 5, 6};
//        int[] copyarray = Arrays.copyOfRange(array, 0, 3);
//        System.out.println(Arrays.toString(copyarray));

//        int[] array = {22, 4, 5, 6};
//        System.out.println(Arrays.toString(array));

//        int[] array = {22, 4, 5, 6};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));

//        int[] array = {22, 4, 5, 6};
//        System.out.println(Arrays.binarySearch(array, 4));

//        int[] array = new int[10];
//        Arrays.fill(array, 23);
//        System.out.println(Arrays.toString(array));

//        int[] array1 = {1, 2, 4, 56};
//        int[] array2 = {1, 2, 4, 56};
//        System.out.println(Arrays.equals(array1, array2));


//        int[] array1 = {1, 2, 4, 56};
//        for (int e: array1) {
//            System.out.println(e);
//        }

//        int[] sourceArray = {755, 3, 5554, 5, 10};
//        int[] targetArray = new int[sourceArray.length];
//        for (int i = 0; i < sourceArray.length; i++) {
//            targetArray[i] = sourceArray[i];
//        }
//        System.out.println(Arrays.toString(targetArray));

//        double[] myArray = new double[10];
//        myArray[0] = 5.6;
//        myArray[1] = 4.5;
//        myArray[2] = 3.3;
//        myArray[3] = 13.2;
//        myArray[4] = 4.0;
//        myArray[5] = 34.33;
//        myArray[6] = 34.0;
//        myArray[7] = 45.45;
//        myArray[8] = 99.993;
//        myArray[9] = 11123.0;
//        System.out.println(Arrays.toString(myArray));


//        double[] myArray = new double[10];
//        Scanner input = new Scanner(System.in);
//        System.out.print("Vvedite " + myArray.length + " znachenii`: ");
//        for (int i = 0; i < myArray.length; i++)
//            myArray[i] = input.nextDouble();
//        System.out.println(Arrays.toString(myArray));

//        double total = 0;
//        for (int i = 0; i < myArray.length; i++) {
//            total += myArray[i];
//        }
//        System.out.println(total);
//        double max = myArray[0];
//        for (int i = 1; i < myArray.length; i++) {
//            if (myArray[i] > max)
//                max = myArray[i];
//        }
//        System.out.println(max);


//    double temp = myArray[0]; // Сохраняет первый элемент
//// Сдвинуть элементы влево
//for (int i = 1; i < myArray.length; i++) {
//        myArray[i - 1] = myArray[i];
//        }
//// Переместить значение первого элемента, чтобы заполнить последнюю позицию
//        myArray[myArray.length - 1] = temp;
//        System.out.println(Arrays.toString(myArray));

//
//        double[] list = new double[10];
//        list[list.length - 1] = 5.5;
//        list[list.length - 2] = 4.5;
//        System.out.println(list[0] + list[1]);
//        double sum = 0;
//        for (int i = 0; i < list.length; i++)
//            sum += list[i];
//        System.out.println(sum);
//
//        double min = list[0];
//        for (int i = 1; i < list.length; i++)
//            if (min > list[i])  min = list[i];
//        System.out.println(min);
//
//        System.out.println(list[(int)(Math.random() * list.length)]);
//
//        double[] list2 = {3.5, 5.5, 4.52, 5.6};


//        int[][] array = {
//                { 1, 2, 3 },
//                { 4, 5, 6 }
//        };
//        System.out.println(array[0][2]);

//        int[][] jaggedArray = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };
//        System.out.println(array[1][1]);


//        public static void printArray(int[] array) {
//            for (int i = 0; i < array.length; i++) {
//                System.out.print(array[i] + " ");
//            }
//        }


//        Вот пример метода reverse(), который возвращает новый массив, являющийся зеркальной (реверсивной) копией переданного массива:

//        public static int[] reverse(int[] list) {
//            int[] result = new int[list.length];
//            for (int i = 0, j = result.length - 1; i < list.length; i++, j--)
//                result[j] = list[i];
//            return result;
//        }

//        Задание 3.2.1
//        Напишите программу, в которой будет массив, заполненный элементами от 5 до 15, и напечатайте все элементы массива.

//        int[] array = new int[11]; // сейчас array содержит одни нули
//        int value = 5; // первое значение для массива array
//        for (int i = 0; i < array.length; i++) { // обходим весь массив, начиная с 0-го индекса
//            array[i] = value; // присваиваем ячейке значения value
//            value++; // увеличиваем value на 1 каждый раз (5, 6, 7, ..., 15)
//        }
//        for (int item : array) { // равносильно (int i = 0; i < array.length; i++)
//            System.out.println(item); //печатаем элемент массива
//        }


//        Задание 3.2.3
//        Чему будет равно значение элемента с индексом 3 в массиве copy после выполнения этой программы?
//                int[] array = {13, 32, 39, 4, 55, 36, 7, 82, 99, 10};
//                int[] copy = array;
//                for (int i = 0; i < copy.length; i++) {
//                    copy[i] = copy[i] * 2;
//                }
//        System.out.println(Arrays.toString(copy));


//        for (int i = 0; i < myArray.length; i++)
//            System.out.print(myArray[i] + " ");

//        Задание 3.2.7* с самопроверкой
//        Напишите программу, которая осуществляет поиск наименьшего индекса наибольшего элемента массива. Например, в массиве {1, 7, 3, 4, 4, 7, 7} нужно определить наибольшие значения (это будет 7), и среди всех таких значений, найти наименьший индекс (это будет 1).
//
//        Проверьте программу на последовательности: {6, 3, 3, 3, 7, 1, 6} (должно получиться 4).


//        double max = array[0];
//        int indexOfMax = 0;
//int [] array = {1, 7, 3, 4, 4, 7, 7};
//        for (int i = 0; i < array.length; i++) {
//                 if (array[i] > max){
//                     max = array[i];
//                     indexOfMax = i;
//                 }
//               }
//
//     System.out.println(Arrays.toString(array));

//        Считывание строки из консоли
//        Чтобы понять, как считывать строки с консоли, рассмотрим пример:
//        String s1, s2, s3;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Введите три слова через пробел: ");
//        s1 = input.next();
//        s2 = input.next();
//        s3 = input.next();
//
//        System.out.println("s1 равно " + s1);
//        System.out.println("s2 равно " + s2);
//        System.out.println("s3 равно " + s3);

//        Метод next() считывает строку до первого пробельного символа.
//        Для считывания целой строчки текста можно использовать метод nextLine().
//                Метод nextLine() считывает строку до нажатия клавиши Enter.
//        В следующем примере считывается строка целиком:


//                String s;
//
//                Scanner input = new Scanner(System.in);
//
//                System.out.println("Введите целую строчку: ");
//                s = input.nextLine();
//                System.out.println("Введенная строчка равна " + s);

//        String message = "Welcome to Java";
//        message = message.substring(11, 14) + "С++";
//        System.out.println(message);

//        String b = "Велосипедист";
//        System.out.println(b.length()); //В консоль будет выведено: 12

//        String message = "Welcome to Java";
//        message = message.substring(message.length()-4, 14) + "С++";
//        System.out.println(message);


//        System.out.println("Чтобы узнать длину этой строки в символах, достаточно написать такую команду:".length());

//        String b = "Velosipedist";

//        System.out.println(b.charAt(5)); //В консоль будет выведено: В

//        String s1 = "some";
//        String s2 = "Some";
//        System.out.println(s1.equals(s2)); //false
//        System.out.println(s1.equalsIgnoreCase(s2)); //true
//        System.out.println(s1.concat(s2)); //someSome
//        System.out.println(s1.lastIndexOf('m')); // 2
//        System.out.println(s1.indexOf("ome")); //1
//        System.out.println(s1.replace('o', 'x')); //sxme
//        System.out.println(s1.replaceAll("me", "momo")); //somomo
//        System.out.println(s1.replaceFirst("so", "Go")); //Gome
//        System.out.println(s1.split(",")); // [Ljava.lang.String;@5f184fc6
//        System.out.println(s1.toLowerCase()); // some
//        System.out.println(s1.toUpperCase()); // SOME
//        System.out.println(s1.trim()); // убирает лишние пробелы

//        Напишите код, который позволяет из строки, содержащей
//        значение "Sometimes", напечатать третий символ этого слова.
//        String s3 = "Sometimes";
//        System.out.println(s3.substring(2, 3)); //m

//        String s1 = "Привет";
//        String s2 = new String("Привет");
//        System.out.println(s1 == s2);  // Выведет false


//        static String mulString(String p, int n) {
//            String result = "";
//            for (int i = 0; i < n; i++)
//                result += p;
//            return result;
//        }
//        System.out.println(mulString("d", 4));

//        StringBuilder stringBuilder = new  StringBuilder("StringBuilder");
//        stringBuilder.append(" - class dlia chasto izmeniaemy`kh strok."); //StringBuilder - class dlia chasto izmeniaemy`kh strok.
//       stringBuilder.delete(5, 9); //Strinlder - class dlia chasto izmeniaemy`kh strok.
//      stringBuilder.insert(5, 94343); //Strin94343gBuilder - class dlia chasto izmeniaemy`kh strok.
//      stringBuilder.reverse(); // .korts hk`ymeainemzi otsahc aild ssalc - redliuBgnirtS


//        Задание 3.3.2
//        Можно ли пользователю выбрать себе имя "Иван Иванов", если уже есть другой
//        пользователь с именем "иван иванов", считая, что регистр важен для вашей системы?
//
//                Напишите код, который сравнивает эти имена и выводит результат сравнения.

//        String s1 = "Иван Иванов";
//        String s2 = "иван иванов";
//        System.out.println(s1.equalsIgnoreCase(s2)); //  true

//        Задание 3.3.3
//        Можно ли пользователю выбрать себе имя "Иван Иванов", если уже есть
//        другой пользователь с именем "иван иванов", считая, что регистр НЕ важен для вашей системы?
//
//        Напишите код, который сравнивает эти имена и выводит результат сравнения. В задании используйте методы из таблицы выше.
//        String s1 = "Иван Иванов";
//        String s2 = "иван иванов";
//        System.out.println(s1.equalsIgnoreCase(s2)); //  true


//        Задание 3.3.4
//        Измените код из предыдущего задания так, чтобы в случае совпадения
//        имен пользователей (без учета регистра) выводился ответ
//        : "Выберите другое имя пользователя", а если имена не совпадают,
//        выводится ответ: "Отличное имя!". В задании используйте методы из таблицы выше.
//
//       String s1 = "Иван Иванов";
//      String s2 = "иван иванов";
//        if (s1.equalsIgnoreCase(s2) == false){
//            System.out.println("vvedite dryggoe imya");
//        }
//        else {
//       System.out.println("otli4noe imya");}


//        Задание 3.3.5
//        Измените код из предыдущего задания так, чтобы вся проверка
//        имени была выделена в отдельный метод с именем, например checkUserName().


//       String s1 = "Иван Иванов";
//      String s2 = "иван иванов";
//        if (s1.equalsIgnoreCase(s2) == false){
//            System.out.println("vvedite dryggoe imya");
//        }
//        else {
//       System.out.println("otli4noe imya");}

//        Задание 3.3.5
//        Измените код из предыдущего задания так, чтобы вся проверка имени
//        была выделена в отдельный метод с именем, например checkUserName().


//        String s1 = "Иван5 Иванов";
//        String s2 = "иван иванов";
//        checkUserName(s1,s2);
//
//
//    }
//   public static void checkUserName(String s1, String s2) {
//        if (s1.equalsIgnoreCase(s2) == false) {
//            System.out.println("vvedite dryggoe imya");
//        } else {
//            System.out.println("otli4noe imya");
//        }


//        Задание 3.3 .6
//        Измените код из предыдущего задания так, чтобы в случае, если имя пользователя уникальное,
//                пользователю также сообщалось бы "Ваше имя имеет длину <длина имени> символов",
//                где вместо<длина имени>стоит соответствующее число.Проверьте, что ваша программа
//        работает корректно, заменив имя "Иван" на другое, например "Вова".В задании используйте
//        методы из таблицы выше.


//        Задание 3.3 .6
//        Измените код из предыдущего задания так, чтобы в случае, если имя пользователя уникальное,
//                пользователю также сообщалось бы "Ваше имя имеет длину <длина имени> символов",
//                где вместо<длина имени>стоит соответствующее число.Проверьте, что ваша программа
//        работает корректно, заменив имя "Иван" на другое, например "Вова".В задании используйте
//        методы из таблицы выше.


//        String s1 = "Иван5 Иванов";
//        String s2 = "иван иванов";
//        checkUserName(s1, s2);
//    }
//
//    public static void checkUserName(String s1, String s2) {
//        if (s1.equalsIgnoreCase(s2) == false) {
//            System.out.println("dlina vashego imeni: " + s1.length());
//            System.out.println("vvedite dryggoe imya");
//        } else {
//            System.out.println("otli4noe imya");
//        }


//        Задание 3.3.7
//        Измените код из предыдущего задания так, чтобы после надписи о длине имени добавлялось замечание
//    "А без пробелов ваше имя занимает <число> символов". Организуйте код таким образом, чтобы даже
//        если имя состоит из трех слов, программа работала корректно. В задании используйте методы из таблицы выше.


//                String s1 = " Иван5 Иванов ";
//        String s2 = "иван иванов";
//        checkUserName(s1, s2);
//    }
//
//    public static void checkUserName(String s1, String s2) {
//        if (s1.equalsIgnoreCase(s2) == false) {
//            System.out.println("dlina vashego imeni: " + s1.length());
//            s1 = s1.trim();
//            System.out.println("dlina vashego bez probelov: " + s1.length());
//            System.out.println("vvedite dryggoe imya");
//        } else {
//            System.out.println("otli4noe imya");
//        }


//        Задание 3.4.1 с самопроверкой
//        Следующий код написан для переворота массива, но является некорректным. Исправьте его.


//        int[] list = {1, 2, 3, 5, 4};
//        System.out.println(Arrays.toString(list));
//        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
//            // Переставить list[i] и list[j]
//            int temp = list[i];
//            System.out.println(Arrays.toString(list));
//            list[i] = list[j];
//            System.out.println(Arrays.toString(list));
//            list[j] = temp;
//            System.out.println(Arrays.toString(list));
//        }
//        System.out.println(Arrays.toString(list));


//        Задание 3.4.2 с самопроверкой
//        Пользуясь таблицей методов для изменения строк, представленной выше в этом уроке,
//        реализуйте метод, который будет удалять из строки все пробелы, но уже с использованием новых методов.
//                В этом задании нельзя использовать посимвольный обход слова.


//                System.out.println(removeWhiteSpaces("A roza upala na lapu Azora"));
//}
//    private static String removeWhiteSpaces(String str) {
//        return str.replace(" ","");


//        Задача 3.4.3
//        Создайте массив и инициализируйте его следующими значениями: 5, 24, 3, 66, 38, 16, 27.
//        Проведите сортировку массива и выведите третий элемент массива. Чему он равен?

//        int list[] = {5, 24, 3, 66, 38, 16, 27};
//        System.out.println(Arrays.toString(list));
//        Arrays.sort(list);
//        System.out.println(Arrays.toString(list));
//        System.out.println(Arrays.toString(list));
//        System.out.println("Tretiy element massiva raven: "+list[2]);

//        int[] array = {5, 24, 3, 66, 38, 16, 27};
//        Arrays.sort(array);
//        System.out.println(array[2]);


//        Задача 3.4.4
//        Напишите программу, в которой пользователя просят ввести имя и пароль.
//                Пароль должен быть ограничен по размеру от 8 до 15 символов.
//            В случае ввода неверного пароля программа должна запрашивать
//        пароль снова и выводить на экран причину ошибки.
//
//        В случае, если пароль введен верно, программа должна выводить
//        имя пользователя и его пароль. Удачи, и да прибудет с вами сила!

//        int pass = 12345678;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter login ");
//        String inputLogin = input.nextLine();
//
//        System.out.println("Sozdai`te parol`:");
//        String PW = input.nextLine();
//        if (PW.length() < 8 || PW.length() > 15) {
//            do {
//                System.out.println("Dlina parolia dolzhna sostavliat` ot 8 do 15 simvolov");
//                PW = input.nextLine();
//            } while (PW.length() < 8 || PW.length() > 15);
//        }
//        System.out.printf("%s, Vash novyi parol: %s", inputLogin, PW);


//        Задача 3.4.5
//        Прошло соревнование среди 5 участников: Саша, Игорь, Миша, Коля и Владимир,
//        по 5 различным дисциплинам. Организаторами был создан двухмерный массив: каждая i-ая строка —
//        это количество полученных баллов i-го игрока. Задание: вывести одномерный
//        массив в виде "<Имя игрока>  <сумма баллов>".


//        int i,j;
//        String[] result = new String[5];
//        int[][] points = {
//                {4, 3, 2, 5, 1},
//                {3, 4, 4, 6, 2},
//                {2, 5, 4, 3, 2},
//                {8, 4, 2, 0, 4},
//                {4, 4, 3, 2, 9},
//        };
//        int[] sumPoints = new int[5];
//        String[] names = {"Alex","Igor","Michael","Nicolay","Vladimir"};
//        for (i=0; i < names.length; i++) {
//            for (j = 0; j < points[i].length; j++) {
//                sumPoints[i] += points[i][j];
//            }
//            result[i] = names[i] + " " + sumPoints[i];
//            System.out.println(result[i]);
//        }


//        Задача 3.4.7
//        Напишите метод, в котором будет массив, содержащий числа с плавающей точкой.
//
//        К примеру: {1.3, 3.2, 5.1, 4.7}
//
//        Создайте package с названием «modul3».
//        Создайте в пакете class Main.
//        Создайте в методе цикл, который будет выводить в консоль все элементы массива.
//                Напишите к нему цикл, способный считать сумму всех элементов, чтобы в консоль выводилось: "Сумма чисел массива: ".
//                Найдите в своем массиве наибольший элемент и выведите его в консоль: "Наибольший элемент: ".
//        double[] myList = {1.3, 3.2, 5.1, 4.7};
//
//        // Вывести на экран все элементы массива
//        for (int i = 0 ; i < myList.length; i++) {
//            System.out.println(myList[i] + " ");
//        }
//        // Сумма элементов массива
//        double total = 0;
//        for (int i = 0 ; i < myList.length; i++) {
//            total += myList[i];
//        }
//        System.out.println("Сумма чисел массива: " + total);
//        // Нахождение среди элементов массива наибольшего
//        double max = myList[0];
//        for (int i = 1 ; i < myList.length; i++) {
//            if (myList[i] > max) max = myList[i];
//        }
//        System.out.println("Наибольший элемент: " + max);


//        Задача 3.4.8
//        Используя методы для строк и массивов, напишите свой метод для переворачивания слова наоборот. Он должен работать только для одного слова.
//                Пример:
//        абра кадабра
//        Введите корректное имя!
//                кадабра
//        Слово наоборот - арбадак
//        Scanner scanner = new Scanner(System.in);
//            boolean isCorrectName = false;
//            String name = "";
//            while (!isCorrectName) {
//                name = scanner.nextLine(); //Считывает строку из System.in
//                isCorrectName = checkName(name);
//                if (!isCorrectName) System.out.println("Введите корректное имя!");
//            }
//            System.out.println("Слово наоборот - " + reverse(name));
//
//         String reverse(String name) {
//            String str = "";
//            for (int i=name.length()-1; i>=0; i--) {
//                str += name.charAt(i);
//            }
//            return str;
//        }
//
//        boolean checkName(String name){
//            if (name.split(" ").length == 1) {
//                return true;
//            } else return false;
//        }

//        Задача 3.4.9
//        Напишите программу, которая меняет местами элементы одномерного
//        массива из String в обратном порядке. Не используйте второй массив для хранения результатов.


//        String[] a = { "Kazhdyi", "ohotneyk", "zhelaet", "znat" };
////выводим начальный массив в консоль
//        for (String s : a) {
//            System.out.print(s);
//        }
//        System.out.println();
//
//        int n = a.length;
//// переменная, которая будет использоваться при замене элементов
//        String temporary;
//
//        for(int i = 0; i < n/2; i++) {
//            temporary = a[n-i-1];
//            // n-i-1 формула для определения противоположного элемента массива
//            a[n-i-1] = a[i];
//            a[i] = temporary;
//        }
////выводим измененный массив в консоль
//        for (String s : a) {
//            System.out.print(s);
//        }

//        Задача 3.4.11
//        Дан массив: {27, 97, 86, 88, 31, 46, 59, 48, 16, 4}.
//        Вывести его в обратном порядке. Затем отсортировать в порядке убывания.

//        int[] arr = {27, 97, 86, 88, 31, 46, 59, 48, 16, 4};
//        int flag;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    flag = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = flag;
//                }
//            }
//            System.out.print(arr[i] + " ");
//        }


//        Задача 3.4.12
//        Напишите программу, которая содержит информацию о названиях предметов, например
//        на складе. У пользователя есть возможность проверить наличие товара, добавить новый
//        товар или удалить товар с помощью ключевых слов «Проверить», «Добавить» или «Удалить» соответственно.
//                В случае проверки программа выдает «Есть» или «Нет», в зависимости от наличия предмета.
//                В случае добавления программа выдает «Успешно добавлено» или
//    «Предмет уже есть», когда товара не было или был на складе соответственно.
//                Ограничение по размеру склада: 12 предметов (не очень большой склад, верно).
//                В случае добавления 13-го предмета программа выдает ошибку:
//        «Невозможно добавить предмет. Место на складе кончилось».
//        В случае попытки удалить предмет с пустого склада или удалить
//        несуществующий предмет программа выдает ошибку: «Удаление предмета невозможно. Предмета нет на складе».
//
//        Также можно добавить вывод всех предметов со склада на текущий момент.


//        private static final Scanner SCANNER = new Scanner(System.in);
//        private static boolean status = true;
//
//
//
//            System.out.println("Welcome to storage!");
//            System.out.println("For information about available commands enter \"help\"");
//            Storage.fillStorage();
//            while (status) {
//                String command = SCANNER.nextLine();
//                String[] comAndValue = command.split(" ");
//                comAndValue[0] = comAndValue[0].toLowerCase();
//                switch (comAndValue[0]) {
//                    case "add":
//                        Storage.addObject(comAndValue[1]);
//                        break;
//                    case "delete":
//                        Storage.removeObject(comAndValue[1]);
//                        break;
//                    case "check":
//                        Storage.findObject(comAndValue[1]);
//                        break;
//                    case "showall":
//                        Storage.showAllStorage();
//                        break;
//                    case "help":
//                        System.out.println("Add [Object Name] - command to add object to storage");
//                        System.out.println("Delete [Object Name] - command to remove object from storage");
//                        System.out.println("Check [Object Name] - command to check object availability");
//                        System.out.println("ShowAll - command to show all storage content");
//                        break;
//                    case "exit":
//                        status = false;
//                        break;
//                    default:
//                        System.out.println("Incorrect command. Please check and repeat.");
//                }
//            }
//        }
//
//    public class Storage {
//        private static final int STORAGE_SIZE = 12;
//        private static String[] storageList = new String[STORAGE_SIZE];
//        private static int freePlaces;
//
//        public static int getFreePlaces() {
//            checkFreePlaces();
//            return freePlaces;
//        }
//
//        public static void addObject(String object) {
//            if (Arrays.binarySearch(storageList, object) > 0) {
//                System.out.printf("Object %s already exist. \n",object);
//            } else {
//                if (getFreePlaces() > 0) {
//                    storageList[Arrays.binarySearch(storageList, " ")] = object.toLowerCase();
//                    System.out.printf("Object %s successfully added. \n", object);
//                    Arrays.sort(storageList);
//                } else {
//                    System.out.println("Cannot add object. No free space.");
//                }
//            }
//        }
//
//        public static boolean isInStock(String object) {
//            return Arrays.binarySearch(storageList, object.toLowerCase()) > 0;
//        }
//
//        public static void checkFreePlaces() {
//            freePlaces = STORAGE_SIZE - Arrays.binarySearch(storageList, " ") - 1;
//        }
//
//        public static void removeObject(String object) {
//            if (isInStock(object)) {
//                storageList[Arrays.binarySearch(storageList, " ")] = " ";
//                Arrays.sort(storageList);
//                System.out.printf("Object %s successfully added. \n", object);
//            } else {
//                System.out.printf("Removing failure. Object %s not found.\n", object);
//            }
//        }
//
//        public static void showAllStorage() {
//            for (int i = 0; i < STORAGE_SIZE; i++) {
//                if (!storageList[i].equals(" ")) {
//                    System.out.print(storageList[i] + "\n");
//                }
//            }
//        }
//
//        public static void findObject(String object) {
//            int objectIndex = Arrays.binarySearch(storageList, object);
//            if (objectIndex < 0) {
//                System.out.printf("Object %s not found.\n", object);
//            } else {
//                System.out.printf("Object %s exist.\n");
//            }
//        }
//
//        public static void fillStorage() {
//            Arrays.fill(storageList, " ");
//        }
//    }


//        Задача 3.4.13
//        Сидоров Иван захотел учиться без двоек, но тратить больше времени на учебу желания нет.
//                И тогда он решил подправить код электронного дневника так,
//        чтобы все выставленные учителем двойки превращались в пятёрки. Помогите ему.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vvedite ocenku ot 1 do 5");
//        String ocenkiMoi = scanner.nextLine();
//        String otlichnik = ocenkiMoi.replaceAll( "2","5");
//        System.out.println(otlichnik);


//        Задача 3.4.14
//        Написать программу, которая после ввода адреса электронной почты возвращала бы домен введенной электронной почты.
//        Scanner scanner = new Scanner(System.in);
//        String email = scanner.nextLine();
//        System.out.println(pochtoviYashik(email));
//
//
//
//
//    }
//    public static String pochtoviYashik(String a){
//        int indexSobaka = a.indexOf('@');
//        String pochtoviYashik = a.substring(indexSobaka + 1);
//        return pochtoviYashik;


//        Задача 3.4.15
//        Имитировать раздачу карт для игры в покер. Программа получает число n,
//        задаваемое с консоли пользователем, и раздает карты на n игроков (по 5 карт каждому) из
//        отсортированной колоды. Разделяйте пять карт, выданных каждому игроку, пустой строкой.


//        int cardsPerPlayer = 5;
//        int players =0 ;
//        String[] suits = {
//                "Pik", "Buben", "Cherv", "Tref"
//        };
//        String[] rank = {
//                "2", "3", "4", "5", "6", "7", "8", "9", "10",
//                "Valet", "Koroleva", "Korol`", "Tuz"
//        };
//        int n = suits.length * rank.length; // количество карт
//
//        for(;;){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Vvedite kolichestvo igrokov: ");
//            if (sc.hasNextInt()) {
//                players = sc.nextInt();
//                if (cardsPerPlayer * players <= n) {
//                    break;
//                } else {
//                    if (players == 0) {
//                        System.out.println("Igra prekrashchena.");
//                        break;
//                    } else if (players < 0) {
//                        System.out.println("Chislo igrokov ne mozhet by`t` men`she 0");
//                    } else {
//                        System.out.println("Slishkom mnogo igrokov!");
//                    }
//                }
//            } else {
//                System.out.println("Vy` vveli ne chislo, ili Vashe chislo slishkom bol`shoe!");
//            }
//        }
//// часть 3 - инициализация колоды
//        String[] deck = new String[n];
//        for (int i = 0; i < rank.length; i++) {
//            for (int j = 0; j < suits.length; j++) {
//                deck[suits.length*i + j] = rank[i] + " " + suits[j];
//            }
//        }
//        // часть 4 - перетасовка колоды
//        for (int i = 0; i < n; i++) {
//            int r = i + (int) (Math.random() * (n-i)); // случайная карта в колоде
//            String temp = deck[r];
//            deck[r] = deck[i];
//            deck[i] = temp;
//        }
//        // часть 5 - перетасованная колода выводится на экран
//        for (int i = 0; i < players * cardsPerPlayer; i++) {
//            System.out.println(deck[i]);
//            if (i % cardsPerPlayer == cardsPerPlayer - 1)
//                System.out.println();
//        }


//        Задание 3.4.16
//        Проверка паролей:
//
//        Принять пароль.
//        Проверить, чтобы он не был похож на предыдущие.
//        Если пароль был найден в массиве предыдущих паролей, то предложить ввести другой пароль.
//        Проверить длину пароля (больше 8 символов).
//        Если длина меньше 8 символов, то написать об этом и предложить ввести ещё раз.
//        Если условия выполняются, написать «Security password verified success» и завершить программу.

//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter new password (minimum 8 character)");
//            String newPassword = scanner.next();
//            System.out.println(passwordValidation(newPassword));
//    }
//    public static String passwordValidation(String newPassword) {
//        String[] passwords = {"asdasdas","qwertyui"};
//        String validationResult = "Security password verified success";
//
//        for (int i=0; i <passwords.length; i++) {
//            if (newPassword.equals(passwords[i])) {
//                validationResult = "Password was use before.";
//            }
//            if(newPassword.length()<8) {
//                validationResult = "Password small";
//            }
//        }
//        return validationResult;


//        Задание 3.4.17
//        В классе Main объявлен массив numbers.
//                Заполните его числами так, чтобы содержимое выглядело следующим образом:
//        [1, -2, 3, -4, 5, …, -98, 99, -100]. Советуем использовать циклы.
//                Не меняйте модификаторы доступа переменных!

//        numbers[0] = 1;
//
//        for (int i = 0, stop = numbers.length; i < stop; i++) {
//            numbers[i] = (int) (Math.pow(-1, i) * (numbers[i] + i));
//        }
//
//                System.out.println(Arrays.toString(numbers));
//    }
//    public static int[] numbers = new int[100];
//
//        Задание 3.4.18
//        В классе Main объявлен массив numbers. Заполните его весь (30 ячеек) числами Фибоначчи.
//        Числа Фибоначчи определяются так: первые два числа равны единице, а каждое последующее —
//        сумме двух предыдущих. Начало последовательности выглядит так:1, 1, 2, 3, 5, 8, 13, 21, …


//
//        int[] numbers = new int[30];
//        numbers[0] = numbers[1] = 1;
//        for (int i = 2, stop = numbers.length; i < stop; i++) {
//            numbers[i] = numbers[i - 1] + numbers[i - 2];
//        }
//        System.out.println(Arrays.toString(numbers));

//        int a = 0;
//        for(int i = 5; i > 0; i--, a++) {
//            System.out.print("Шаг: " + a + " Значение: ");
//            System.out.println(i);
//        }


//        Задание 3.4.19
//        В классе Main объявлен двумерный зубчатый массив ints и целое число size (> 2).
//        Вам нужно сформировать и вывести массив, представляющий треугольник Паскаля.
//        Не нужно центрировать вывод.

//        short size = 3;
//        int[][] ints = new int[size][];
//        ints[0] = new int[]{1};
//        ints[1] = new int[]{1, 1};
//
//        for (int i = 2; i < size; i++) {
//            int[] line = new int[i + 1];
//            line[0] = line[i] = 1;
//
//            for (int j = 1; j < line.length - 1; j++) {
//                line[j] = ints[i - 1][j - 1] + ints[i - 1][j];
//            }
//
//            ints[i] = line;
//        }
//
//        for (int i = 0; i < size; i++) {
//            System.out.println(Arrays.toString(ints[i]));
//        }

//        Задание 3.4.20
//        В классе Main объявлены два массива: strings и output.
//                Ваша задача — из каждой строки массива strings
//        взять nth-ый символ и положить его в массив output.
//                Вы можете поменять значение nth, а также строки в массиве,
//        но для прохождения теста верните все значения на изначальные.
//        Character[] output;
//        String[] strings = new String[]{
//                "Claudius, King of Denmark.",
//                "Hamlet, Son to the former, and Nephew to the present King.",
//                "Polonius, Lord Chamberlain.",
//                "Horatio, Friend to Hamlet.",
//                "Laertes, Son to Polonius.",
//                "Voltimand, Courtier.",
//                "Cornelius, Courtier.",
//                "Rosencrantz, Courtier.",
//                "Guildenstern, Courtier.",
//                "Osric, Courtier.",
//                "A Gentleman, Courtier.", "A Priest.",
//                "Marcellus, Officer.","Bernardo, Officer.",
//                "Francisco, a Soldier",
//                "Reynaldo, Servant to Polonius.",
//                "Players.",
//                "Two Clowns, Grave-diggers.",
//                "Fortinbras, Prince of Norway.",
//                "A Captain.",
//                "English Ambassadors.",
//                "Ghost of Hamlet's Father." };
//        output = new Character[strings.length];
//        int nth = 0;
//        for (int i = 0; i < strings.length; i++) {
//            output[i] = strings[i].charAt(nth);
//        }
//        Arrays.stream(output).forEach(System.out::print);

//        Задание 3.4.21
//        В классе Main объявлен пустой массив strings и целое число size
//        Вам требуется вывести квадратную доску размером size x size. Пример при size = 4:

//        A4 B4 C4 D4
//        A3 B3 C3 D3
//        A2 B2 C2 D2
//        A1 B1 C1 D1

//        short size = 9;
//        String[][] strings;
//        strings = new String[size][size];
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                strings[i][j] = (char) ('A' + j) + String.valueOf(size - i);
//            }
//        }
//        for (int i = 0; i < size; i++) {
//            System.out.println(String.join(" ", strings[i]));
//        }

//        Задание 3.4.22
//        В классе Main дана строка. Выведите в столбик ее подстроки так,
//        чтобы каждую итерацию пропадали первый и последний ее символы.
//                Выводите до тех пор, пока не останется 1 или 2 символа.
//            Пример для строки "helloworld":
//
//        helloworld
//        elloworl
//        llowor
//        lowo
//        ow
//        Внимание: меняйте данную строку! После выполнения программы ее длина должна быть равна либо 1, либо 2.


//        Задание 3.4.23*
//                Клод заботится о конфиденциальности, поэтому не хочет,
//        чтобы передаваемую им информацию смогли перехватить. Но для подстраховки
//        мужчина решил зашифровать свои послания, он будет использовать для этой цели шифр Цезаря.
//                вам предстоит написать для него энкриптор (шифровщик) и декриптор (дешифровщик).
//                Шифр Цезаря работает так: берется каждый символ строки и сдвигается на shift (целое число) вправо.
//                Так, например, при shift = 5, строка ABC станет FGH, а VWXYZ — ABCDE.
//                Шифруем мы только английский текст, сохраняя регистр, а знаки препинания и прочие символы,
//                не являющиеся английскими буквами, оставляем на своих местах.
//                В классе Main даны сигнатуры двух функций: encrypt и decrypt.
//                Напишите код, реализующий шифрование и дешифрование с произвольным данным текстом и сдвигом.
//                Подумайте, можно ли повторно использовать код одной функции для другой, не копируя его.

//        String text = "Lorem ipsum is a placeholder text " +
//                "commonly used to demonstrate the visual form " +
//                "of a document or a typeface without relying on " +
//                "meaningful content. Lorem ipsum may be used as a " +
//                "placeholder before final copy is available. It is " +
//                "also used to temporarily replace text in a process " +
//                "called greeking, which allows designers to consider " +
//                "the form of a webpage or publication, without the " +
//                "meaning of the text influencing the design.";
//        System.out.println(encrypt(text, 5));
//        System.out.println(decrypt(text, 5));
//    }
//    public static String decrypt(String text, int shift) {
//        return encrypt(text, -shift);
//    }
//
//    public static  String encrypt(String text, int shift) {
//        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String lower = upper.toLowerCase();
//        char[] encrypted = new char[text.length()];
//
//        while (shift < 0) {
//            shift += upper.length();
//        }
//
//        for (int i = 0; i < text.length(); i++) {
//            if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z') {
//                encrypted[i] = upper.charAt((upper.indexOf(text.charAt(i)) + shift) % upper.length());
//            } else if ('a' <= text.charAt(i) && text.charAt(i) <= 'z') {
//                encrypted[i] = lower.charAt((lower.indexOf(text.charAt(i)) + shift) % lower.length());
//            } else {
//                encrypted[i] = text.charAt(i);
//            }
//        }
//
//        return new String(encrypted);


//        for(int i = 0; i < 5; i++) {
//            System.out.print(i + " | ");
//            for(int j = 0; j < 5; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.print('\n');
//        }


//        Пример использования байтового потока:
//                FileInputStream inputStream = new FileInputStream("input.txt");
//                int data = inputStream.read();
//                while (data != -1) {
//                    System.out.print((char) data);
//                    data = inputStream.read();
//                }
//                inputStream.close();


//        Пример использования символьного потока:
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//            String line = reader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = reader.readLine();
//            }
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//    Пример использования буферизированного потока:
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//            String line = reader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = reader.readLine();
//            }
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Пример использования небуферизованного потока:
//        FileInputStream inputStream = new FileInputStream("input.txt");
//        int data = inputStream.read();
//        while (data != -1) {
//            System.out.print((char) data);
//            data = inputStream.read();
//        }
//        inputStream.close();


//        byte x = -1;
//        int y = -1;
//// в шестнадцатеричном представлении по 8 цифр
//        System.out.println(String.format("%08X and %08X", x, y));


//             FileOutputStream fos = new FileOutputStream("test.txt");
//                fos.write("Hello FileOutputStream world".getBytes());
//                fos.close();


//        Запустите этот метод на локальной машине. Лучше всего даже использовать не текстовые файлы, а картинки. Посмотрите, не поломается ли скопированная картинка, откроется ли нормально средствами просмотра.
//
//        Здесь файл копируется блоками по 1024 байта. Поэкспериментируйте на больших файлах, замерьте скорость копирования при разных размерах буфера.
//
//        Код для запуска:


//        copyFileUsingStream("input.txt", "output.txt");
//    }
//}
//
//    //        Давайте скопируем файл при помощи потоков. Будем для этого использовать блоковые read()-write(), которые позволяют за раз считывать-записывать целый массив байтов.
//    private static void copyFileUsingStream(String source, String dest) throws IOException {
//        InputStream fis = new FileInputStream(source);
//        OutputStream fos = new FileOutputStream(dest);
//        byte[] buffer = new byte[1024];
//        int length;
//        while ((length = fis.read(buffer)) > 0) {
//            fos.write(buffer, 0, length);
//        }
//        fis.close();
//        fos.close();



       // Создание объекта ByteOutputStream для записи в файл
   //      FileOutputStream outputStream = new FileOutputStream("output.txt");
   //      ByteOutputStream byteOutputStream = new ByteOutputStream(outputStream);
        // Запись данных в поток
   //      byteOutputStream.write(65); // Записываем символ 'A'
    //     byteOutputStream.flush(); // Очищаем буфер и записываем данные в файл

        // Закрытие потока
   //      byteOutputStream.close();











    }

}

