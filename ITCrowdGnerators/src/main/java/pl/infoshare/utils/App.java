package pl.infoshare.utils;

import pl.infoshare.dataModels.Address;
import pl.infoshare.dataModels.Bag;
import pl.infoshare.dataModels.Payment;
import pl.infoshare.dataModels.RegisteredUser;


public class App
{
    public static void main( String[] args )
    {
        Address address = new Address(true);
        RegisteredUser user = new RegisteredUser();
        Payment payment = new Payment();
        Bag bag = new Bag();
        Bag bagForCategory = new Bag("Beach bags");
        Bag bagForCollection = new Bag("Handbags", "Chic");

        System.out.println(payment.toString());
        System.out.println(address.toString());
        System.out.println(user.toString());
        System.out.println(bag.toString());
        System.out.println(bagForCategory.toString());
        System.out.println(bagForCollection.toString());

    }

}
