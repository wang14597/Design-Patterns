package BridgePattern;

import BridgePattern.Abstract.Shape;
import BridgePattern.Interface.DrawAPI;

public class Circle extends Shape {
    private final int x;
    private final int y;
    private final int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        this.drawAPI.drawCircle(radius, x, y);
    }
}
