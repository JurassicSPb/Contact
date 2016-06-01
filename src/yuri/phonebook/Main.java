package yuri.phonebook;

/**
 * Created by Юрий on 01.06.2016.
 */
public class Main {
    public static void main (String[] args) {
        Contact contact [] = new Contact [10];
        for (int i=0; i<contact.length; i++)
        {
            contact[i]=new Contact();
        }
        contact[0].name="Ivan";
        contact[1].name="Maria";
        contact[2].name="Petr";
        contact[3].name="Alexandr";
        contact[4].name="Svetlana";
        contact[5].name="Anna";
        contact[6].name="Egor";
        contact[7].name="Maksim";
        contact[8].name="Sofia";
        contact[9].name="Artem";

        contact[0].phone="89754123598";
        contact[1].phone="89654266551";
        contact[2].phone="89217569863";
        contact[3].phone="89556522941";
        contact[4].phone="89365755666";
        contact[5].phone="89451326565";
        contact[6].phone="89314895555";
        contact[7].phone="87456664111";
        contact[8].phone="99423242344";
        contact[9].phone="98551222222";

        contact[0].email = "ivan@yandex.ru";
        contact[1].email = "maria@gmail.com";
        contact[2].email = "petja@mail.ru";
        contact[3].email = "alex1988@rambler.ru";
        contact[4].email = "svetik@ya.ru";
        contact[5].email = "anna-k@aport.ru";
        contact[6].email = "egorka@host.com";
        contact[7].email = "maks91@bing.com";
        contact[8].email = "sonja@levelp.ru";
        contact[9].email = "art@icloud.com";

        Contact temp;
        for (int j = 0; j < contact.length - 1; j++)
        {
            for (int i = 0; i < contact.length - 1 - j; i++)
            {
                if (contact[i].name.toCharArray()[0] > contact[i+1].name.toCharArray()[0])
                {
                    temp = contact[i];
                    contact[i] = contact[i+1];
                    contact[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < contact.length; i++)
        {
            System.out.println(contact[i].name  + " " + contact[i].phone + " " + contact[i].email);
        }

    }

}
