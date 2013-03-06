package example2.builders;

import example2.House;

public class IglooHouseBuilder implements HouseBuilder {

    private House house;

    public IglooHouseBuilder() {
        house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Ledová plocha");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Bloky ledu");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ledová kopule");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Rytiny v ledu");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
