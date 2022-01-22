package PrototypePattern;

import PrototypePattern.ShapeImplment.Circle;
import PrototypePattern.ShapeImplment.Rectangle;
import PrototypePattern.ShapeImplment.Square;

import java.util.HashMap;

public class ShapeCache {

    private final HashMap<ShapeTypeEnum, Shape> cache = new HashMap<>();

    public void loadCache() {
        cache.put(ShapeTypeEnum.Rectangle, new Rectangle());
        cache.put(ShapeTypeEnum.Square, new Square());
        cache.put(ShapeTypeEnum.Circle, new Circle());
    }

    public Shape getShape(ShapeTypeEnum typeEnum) {
        return (Shape) cache.get(typeEnum).clone();
    }
}
