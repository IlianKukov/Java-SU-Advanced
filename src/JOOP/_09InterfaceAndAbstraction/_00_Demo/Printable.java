package JOOP._09InterfaceAndAbstraction._00_Demo;

import java.io.Serializable;

public interface Printable extends Serializable {
    double pricePerSheet = 0.04;

    void print();
}
