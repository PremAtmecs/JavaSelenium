package BasicOops;

public class childEmirates extends parentAirCraft {
    public static void main(String[] args) {
        childEmirates c = new childEmirates();
        c.bodyColor();
        c.engine();
    }

    @Override
    public void bodyColor() {
        System.out.println("Red colour aircraft body");
    }
}
