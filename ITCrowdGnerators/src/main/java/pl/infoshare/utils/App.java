package pl.infoshare.utils;

import pl.infoshare.dataModels.Address;
import pl.infoshare.dataModels.Bag;
import pl.infoshare.dataModels.Payment;
import pl.infoshare.dataModels.RegisteredUser;
import pl.infoshare.generators.BagGenerator;

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

        System.out.println(payment.paymentData());
        System.out.println(address.addressData());
        System.out.println(user.userData());
        System.out.println(bag.bagItem());
        System.out.println(bagForCategory.bagItem());
        System.out.println(bagForCollection.bagItem());

    }

}
