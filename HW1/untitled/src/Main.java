//Реализовать, с учетом ооп подхода, приложение Для проведения
//        исследований с генеалогическим древом. Идея: описать некоторое
//        количество компонент, например: модель человека компонента
//        хранения связей и отношений между людьми: родитель, ребёнок -
//        классика, но можно подумать и про отношение, брат, свекровь, сестра
//        и т. д. компонент для проведения исследований дополнительные
//        компоненты, например отвечающие за вывод данных в консоль,
//        загрузку и сохранения в файл, получение\построение отдельных
//        моделей человека Под “проведением исследования” можно понимать
//        получение всех детей выбранного человека. Описать с ООП стиле,
//        логику взаимодействия объектов реального мира между собой: шкаф-
//        человек. Какие члены должны быть у каждого из классов (у меня на
//        семинаре студенты пришли к тому, чтобы продумать логику
//        взаимодействия жена разрешает открыть дверцу шкафа мужу, после
//        чего эту дверцу можно открыть) Подумать как описать логику
//        взаимодействия человека и домашнего питомца. Сценарий: “Человек
//        “зовёт” котика “кис-кис”, котик отзывается. Какое ещё взаимодействие
//        может быть? Продумать какие проблемы могут возникнуть в том, коде,
//        который они написали. Например в первой задаче (с генеалогическим
//        древом) мы можем знать о двух людях, но не знаем в каких
//        “отношениях” они были - двоюродные или троюродные, или мы точно
//        знаем как звали прапрабабушку, но совершенно не знаем прабабушку -
//        как хранить такие связи или что будет если в компоненту обхода
//        передать ссылку на null-дерево. У задач нет единственного
//        правильного решения


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov", 1870, 1925, "male");
        Person person2 = new Person("Anna", "Ivanova", 1875, 1935, "female");
        Childrens person3 = new Childrens("Petr", "Ivanov", 1900, 1968, "maopiple");
        Childrens person4 = new Childrens("Olga", "Petrova", 1902, 1978, "female");
        Childrens person5 = new Childrens("Sergei", "Ivanov", 1940, "male");
        System.out.println(person1);
        System.out.println(person3);

        person2.makeChildren(person1, person3);
        System.out.println(person1);
        System.out.println(person2);
        person3.makeChildren(person2, person3);
        System.out.println(person3);

        person3.makeChildren(person4, person5);
        System.out.println(person3);
        System.out.println(person5);
        System.out.println("Grandparents list of " + person5.getName() + " " + person5.getSurname() + " - " + person5.printGrandParentsList());

        Husband hus1 = new Husband("Oleg", "Petrov", 1980);
        Wife wife1 = new Wife("Maria", "Petrova", 1985);
        ListOfMArriedAndDevorces list1 = new ListOfMArriedAndDevorces();
        list1.getMarried(hus1,wife1);
        System.out.println(list1);
        ListOfMArriedAndDevorces list2 = new ListOfMArriedAndDevorces();
        System.out.println(list2);
        Products prod1 = new Products();
        hus1.EatBorsh(prod1);
        System.out.println(prod1);
        wife1.toMakeBorsch(prod1, 2);
        System.out.println(prod1);
        wife1.toMakeBorsch(prod1, 1);
        System.out.println(prod1);
        hus1.EatBorsh(prod1);
        System.out.println(prod1);
        person3.EatBorsh(prod1);
    }
}