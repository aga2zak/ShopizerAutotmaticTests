package pl.infoshare.generators;

import pl.infoshare.dataModels.Bag;
import java.util.ArrayList;
import java.util.List;

public class BagGenerator extends RandomGenerator {

    public static Bag vintageExotikCarryBag = new Bag( "Handbags","Vintage","Vintage Exotik Carry Bag", true, 62, 1, 17, 28, 4);
    public static Bag multiUseHandBag = new Bag( "Handbags", "Vintage","Multi use hand bag", true, 65, 1, 18, 29, 5);
    public static Bag vintageBag = new Bag( "Handbags", "Vintage","Vintage bag", true, 69, 1, 20, 30, 4);
    public static Bag chicVintageDeVille = new Bag( "Handbags", "Chic","Chic vintage DeVille", true, 78, 1, 17, 28, 4);
    public static Bag vintageChicHandbag = new Bag( "Handbags", "Chic","Vintage chic handbag", true, 68, 2, 17, 28, 5);
    public static Bag vintageCourierBag = new Bag( "Handbags", "Courier","Vintage courier bag", true, 60, 2, 18, 22, 10);
    public static Bag retroStyleBag = new Bag( "Beach bags", "Retro","Retro style bag", true, 48, 1, 20, 30, 4);
    public static Bag vintageBeachBag = new Bag( "Beach bags", "Beach","Vintage beach bag", true, 60, 1, 20, 30, 8);
    public static Bag VintageLaptopBag = new Bag( "Laptop bags", "Vintage","Vintage laptop bag", true, 78, 2, 18, 20, 4);
    public static Bag vintageBagWithLeatherBands = new Bag( "Bags", "Retro","Vintage bag with leather bands", true, 68, 1, 19, 27, 4);

    public static List<Bag> listAllBag() {
        List<Bag> bagList = new ArrayList<>();
        bagList.add(vintageExotikCarryBag);
        bagList.add(multiUseHandBag);
        bagList.add(vintageBag);
        bagList.add(chicVintageDeVille);
        bagList.add(vintageChicHandbag);
        bagList.add(vintageCourierBag);
        bagList.add(retroStyleBag);
        bagList.add(vintageBeachBag);
        bagList.add(VintageLaptopBag);
        bagList.add(vintageBagWithLeatherBands);

        return  bagList;
    }

    public static List<Bag> listCategoryBag(String category) {
        List<Bag> bagCategoryList = new ArrayList<>();
        for (Bag bag : listAllBag()) {
            if (bag.getCategory().equals(category)) {
                bagCategoryList.add(bag);
            }
        }
        return bagCategoryList;
    }

    public static List<Bag> listCollectionBag(String category, String collection) {
        List<Bag> bagCollectionList = new ArrayList<>();
        for (Bag bag : listAllBag()) {
            if (bag.getCategory().equals(category) && bag.getCollection().equals(collection)) {
                bagCollectionList.add(bag);
            }
        }
        return bagCollectionList;
    }

    public static Bag generateRandomBag() {
        Bag randomBag = listAllBag().get(generateRandomNumber(0, (listAllBag().size()-1)));
        return randomBag;
    }

    public static Bag generateCategoryRandomBag(String category) {
        Bag randomCategoryBag = listCategoryBag(category).get(generateRandomNumber(0, (listAllBag().size()-1)));
        return randomCategoryBag;
    }

    public static Bag generateCollectionRandomBag(String category, String collection) {
        Bag randomCollectonBag = listCollectionBag(category, collection).get(generateRandomNumber(0, (listAllBag().size()-1)));
        return randomCollectonBag;
    }

}