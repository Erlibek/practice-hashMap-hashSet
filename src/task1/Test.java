package task1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        ArrayList<Contact> contacts2 = new ArrayList<>();
        PhoneBook phoneBook = new PhoneBook();
        contacts.add(new Contact("Адель", "87471655780"));
        contacts.add(new Contact("Никита", "87456873245"));
        contacts.add(new Contact("Рамиль", "87456873987"));
        contacts.add(new Contact("Аслан", "87434473245"));
        contacts.add(new Contact("Арман", "87459863245"));
        phoneBook.addContacts("Друзья", contacts);
        contacts2.add(new Contact("Алишер", "3913152998"));
        contacts2.add(new Contact("Данеля", "8780951264"));
        contacts2.add(new Contact("Ербол", "9237061274"));
        contacts2.add(new Contact("Денис", "9834023932"));
        contacts2.add(new Contact("Саша", "2367494843"));
        phoneBook.addContacts("Работа", contacts2);
        phoneBook.searchContactsByNumber("87456873245");
    }
}