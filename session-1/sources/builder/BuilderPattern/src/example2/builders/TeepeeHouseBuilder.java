package example2.builders;

import example2.House;

public class TeepeeHouseBuilder implements HouseBuilder {

    private House house;

    public TeepeeHouseBuilder() {
        house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Travnatý porost");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Dřevěné tyče");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Bizoní kůže");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Malby zvířat");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
