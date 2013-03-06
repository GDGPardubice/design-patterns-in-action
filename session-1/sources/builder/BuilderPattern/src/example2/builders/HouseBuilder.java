package example2.builders;

import example2.House;

public interface HouseBuilder {

    void buildBasement();

    void buildStructure();

    void buildRoof();

    void buildInterior();

    House getHouse();
}
