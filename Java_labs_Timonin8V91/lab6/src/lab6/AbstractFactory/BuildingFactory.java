package lab6.AbstractFactory;

import lab6.CottageInterface;
import lab6.LivingHouseInterface;
import lab6.PrivateHouseInterface;
import lab6.SampleBuildInterface;

public interface BuildingFactory {
    CottageInterface getCottage();
    SampleBuildInterface getSampleBuild();
    LivingHouseInterface getLivingHouse();
    PrivateHouseInterface getPrivateHouse();
}
