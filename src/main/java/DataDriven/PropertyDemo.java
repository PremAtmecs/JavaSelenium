package DataDriven;

public class PropertyDemo {
    //String path=System.getProperty("user.dir")+"src/main/resources/configproperty.properties";
    String path = "C:\\Users\\premkumar.sarathi\\IdeaProjects\\BasicsJava\\src\\main\\resources\\configproperty.properties";
    public static PropertyParser property;
    public PropertyDemo(){
        property = new PropertyParser(path);
    }

    public static void main(String[] args) {
        PropertyDemo propertyDemo = new PropertyDemo();
        System.out.println(property.getProperties("Name"));
    }
}
