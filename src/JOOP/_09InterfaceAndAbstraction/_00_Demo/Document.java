package JOOP._09InterfaceAndAbstraction._00_Demo;

public class Document implements Printable{
    @Override
    public void print(){
        System.out.println("printing document...");
    }
}
