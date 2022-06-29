package by.epam.yanushkevich_irina.module4.task2_3.main;

import by.epam.yanushkevich_irina.module4.task2_3.entity.City;
import by.epam.yanushkevich_irina.module4.task2_3.entity.District;
import by.epam.yanushkevich_irina.module4.task2_3.entity.Region;
import by.epam.yanushkevich_irina.module4.task2_3.entity.State;
import by.epam.yanushkevich_irina.module4.task2_3.logic.StateLogic;

public class Main {

    /* 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
          столицу, количество областей, площадь, областные центры. */

    public static void main(String[] args) {

        City city1 = new City("Smolevichi", 20_548);
        City city2 = new City("Orsha", 104_605);
        City city3 = new City("Lida", 103_479);
        City city4 = new City("Rechica", 65_561);
        City city5 = new City("Glusk", 7_134);
        City city6 = new City("Pinsk", 125_060);

        District district1 = new District("Smolevichsky", 190);
        District district2 = new District("Orshansky", 260);
        District district3 = new District("Lidsky", 276);
        District district4 = new District("Rechitsky", 188);
        District district5 = new District("Glusskiy", 106);
        District district6 = new District("Pinsky", 179);

        Region region1 = new Region("Minsky", new City("Minsk", 1_996_553), 39_854);
        Region region2 = new Region("Vitebsky", new City("Vitebsk", 364_800), 40_051);
        Region region3 = new Region("Grodnensky", new City("Grodno", 357_500), 25_127);
        Region region4 = new Region("Gomelsky", new City("Gomel", 507_795), 40_372);
        Region region5 = new Region("Mogilevsky", new City("Mogilev", 357_100), 29_068);
        Region region6 = new Region("Brestskiy", new City("Brest", 340_318), 32_790);

        State state = new State("Belarus", new City("Minsk", 1_996_553));

        district1.addCity(city1);
        district2.addCity(city2);
        district3.addCity(city3);
        district4.addCity(city4);
        district5.addCity(city5);
        district6.addCity(city6);

        region1.addDistrict(district1);
        region2.addDistrict(district2);
        region3.addDistrict(district3);
        region4.addDistrict(district4);
        region5.addDistrict(district5);
        region6.addDistrict(district6);

        state.addRegion(region1);
        state.addRegion(region2);
        state.addRegion(region3);
        state.addRegion(region4);
        state.addRegion(region5);
        state.addRegion(region6);

        StateLogic logic = new StateLogic();

        logic.printCapital(state);
        logic.printRegionAmount(state);
        logic.printStateSquare(state);
        logic.printRegionalCenters(state);
    }
}
