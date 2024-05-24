package com.company;
import java.util.*;
public class Array_contact_list_find_program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name[] = new String[5];
        int number[] = new int[5];
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter the contact names.");
            name[i] = in.nextLine();
            System.out.println("Enter the contact numbers.");
            number[i] = in.nextInt();
            String fe = in.nextLine();
        }
        System.out.println("Whose number are you looking for ? Please provide the contact name.");
        String find = in.nextLine();
        for (int i = 0; i < 5; i++) {
            if (name[i].equals(find))
                //System.out.println("Contact list index number\tContact name\tMobile number");
                //System.out.println((i + 1) + "\t\t\t\t\t\t\t" + name[i] + "\t\t" + number[i]);
                System.out.println(name[i]+" "+ number[i]);
        }
    }
}

