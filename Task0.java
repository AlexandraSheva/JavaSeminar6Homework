import java.util.HashSet;
import java.util.Set;

/**
 * Task0. 1)Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
 * Реализовать в java.
2)Создать множество ноутбуков.
3)Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:

1 - ОЗУ

2 - Объем ЖД

3 - Операционная система

4 - Цвет …

1)Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
2)Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Task0 {

  public static void main(String[] args) {

    Laptops lap1 = new Laptops("Acer", "AHD2345", 8, 3.0, "Wind 11", "black");
    Laptops lap2 = new Laptops("Apple", "MacBook Air", 24, 6.0, "macOS Monterey", "grey");
    Laptops lap3 = new Laptops("HP", "123214-CV", 16, 2.0, "Wind 7", "red");
    Laptops lap4 = new Laptops("Lenovo", "HGKL", 2, 0.84, "Wind-2000", "white");

    Set <Laptops> set = new HashSet <> (); 
    set.add (lap1);
    set.add (lap2);
    set.add (lap3);
    set.add (lap4);
  }

  
}
