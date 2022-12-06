package Lessons;

public class Lesson_02 {
    public static void main(String[] args) {

        /*
        1. Параметры метода println()
        Тело метода состоит из команд. Можно даже сказать, что метод — это команды, объединенные в группу,
        которой дали имя (имя метода). И так, и так будет верно.

        Команды бывают разные. В языке Java есть команды на все случаи жизни. Каждая команда описывает какое-то
        определенное действие. В конце каждой команды ставится точка с запятой.

        Примеры команд:

        System.out.println(1); - выводит на экран число: 1
        System.out.println("Amigo"); - выводит на экран надпись: Amigo
        System.out.println("Risha & Amigo"); - выводит на экран надпись: Risha & Amigo

        На самом деле это одна команда – System.out.println. А в круглых скобках в нее передаются параметры.
        В зависимости от значений параметров, одна команда может выполнять разные действия. Это очень удобно.

        (!!! )ВАЖНО
        В Java размер имеет значение: имеет значение, большими или маленькими буквами написаны команды.
        Команда System.out.println() работать будет, а system.out.println() — нет.

        Если вы хотите вывести на экран текст, его нужно с двух сторон обозначить двойными кавычками.
        Одинарная кавычка выглядит вот так ', а двойная — вот так ". Двойная кавычка — это не две одинарных:
        просьба не путать. Двойная — это та, которая рядом с кнопкой Enter. На ней еще обычно находится русская буква Э.

        --------------

        2. Отличия println() и print()
        Есть две вариации команды вывода на экран: System.out.println() и System.out.print()
        Если вы пишете команду System.out.println() несколько раз, каждый раз переданный в нее текст будет выводиться с
        новой строки. Если System.out.print(), текст будет выводиться на той же строке.
        Пример:

        System.out.println("Amigo");
        System.out.println("The");
        System.out.println("Best");

        Amigo
        The
        Best

        System.out.print("Amigo");
        System.out.println("The");
        System.out.print("Best");

        AmigoThe
        Best

        System.out.print("Amigo");
        System.out.print("The");
        System.out.print("Best");

        AmigoTheBest

        Небольшое примечание. Команда println() не выводит текст с новой строки – она выводит текст на текущей строке,
        но делает так, чтобы следующий текст выводился с новой строки. Команда println() выводит на экран текст и затем
        добавляет специальный невидимый символ перевода строки, в результате чего следующий текст будет отображаться с
        начала новой строки.

        Так будет выглядеть полностью написанная программа вместе с объявлением класса Amigo и методом main:

        public class Amigo {
            public static void main (String[] args) {
                System.out.print("Amigo ");
                System.out.print("The ");
                System.out.print("Best");
            }
        }




         */

    }
}