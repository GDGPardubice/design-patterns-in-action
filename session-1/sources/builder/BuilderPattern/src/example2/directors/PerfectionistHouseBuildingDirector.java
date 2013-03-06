package example2.directors;

import example2.House;
import example2.builders.HouseBuilder;


public class PerfectionistHouseBuildingDirector {
    private HouseBuilder houseBuilder;

    public PerfectionistHouseBuildingDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    
    public House constructHouse() {
        buildHouse();
        return houseBuilder.getHouse();
    }

    private void buildHouse() {
        houseBuilder.buildBasement();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
    }
}
