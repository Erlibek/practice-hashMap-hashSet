package task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private static final Map<String, List<Contact>> phoneBook = new HashMap<>();

    public void addContacts(String groupName, List<Contact> contacts) {
        phoneBook.put(groupName, contacts);
    }

    public void searchContactsByGroup(String group) {
        for (Map.Entry<String, List<Contact>> entry : phoneBook.entrySet()) {
            String key = entry.getKey();
            List<Contact> contacts = entry.getValue();
            if (group.equals(key)) {
                for (Contact contact : contacts) {
                    System.out.printf("Name: %s, номер: %s", contact.getName(), contact.getNumber());
                }
                return;
            }
        }
        System.out.println("Такой группы нет!");
    }

    public void searchContactsByNumber(String phoneNumber) {
        for (Map.Entry<String, List<Contact>> entry : phoneBook.entrySet()) {
            String key = entry.getKey();
            List<Contact> value = entry.getValue();
            for (Contact contact : value) {
                if (contact.getNumber().equals(phoneNumber)) {
                    System.out.printf("Имя: %s номер: %s\n", contact.getName(), contact.getNumber());
                    return;
                }
            }
        }
        System.out.println("Такого номера нет!");
    }
}