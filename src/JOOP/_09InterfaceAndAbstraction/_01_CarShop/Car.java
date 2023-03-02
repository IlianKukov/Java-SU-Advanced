package JOOP._09InterfaceAndAbstraction._01_CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    int TIRES = 4;

    String getModel();

    int getHorsePower();
    String countryProduced();

    String getColor();


}
