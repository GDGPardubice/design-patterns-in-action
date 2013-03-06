package example2;

import example2.builders.HouseBuilder;
import example2.builders.IglooHouseBuilder;
import example2.builders.TeepeeHouseBuilder;
import example2.directors.PerfectionistHouseBuildingDirector;
import example2.directors.SloppyHouseBuildingDirector;


public class Client {
    public static void main(String[] args) {
        House house;
        
        IglooHouseBuilder iglooBuilder = new IglooHouseBuilder();
        SloppyHouseBuildingDirector sloppyIglooBuildingDirector = new SloppyHouseBuildingDirector(iglooBuilder);
        PerfectionistHouseBuildingDirector perfectionistIglooBuildingDirector = new PerfectionistHouseBuildingDirector(iglooBuilder);
        
        house = sloppyIglooBuildingDirector.constructHouse();
        System.out.println(house);
        
        house = perfectionistIglooBuildingDirector.constructHouse();
        System.out.println(house);
        
        TeepeeHouseBuilder teepeeHouseBuilder = new TeepeeHouseBuilder();
        SloppyHouseBuildingDirector sloppyTeeepeeBuildingDirector = new SloppyHouseBuildingDirector(teepeeHouseBuilder);
        PerfectionistHouseBuildingDirector perfectionistTeePeeBuildingDirector = new PerfectionistHouseBuildingDirector(teepeeHouseBuilder);
        
        house = sloppyTeeepeeBuildingDirector.constructHouse();
        System.out.println(house);
        
        house = perfectionistTeePeeBuildingDirector.constructHouse();
        System.out.println(house);
    }
}
