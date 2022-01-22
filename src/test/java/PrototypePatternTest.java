import PrototypePattern.ShapeImplment.Rectangle;
import PrototypePattern.Shape;
import PrototypePattern.ShapeCache;
import PrototypePattern.ShapeImplment.Square;
import PrototypePattern.ShapeTypeEnum;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class PrototypePatternTest {

    private ShapeCache shapeCache;

    @Before
    public void initTest() {
        shapeCache =  new ShapeCache();
        shapeCache.loadCache();
    }

    @Test
    public void should_get_Rectangle(){
        Shape shape = shapeCache.getShape(ShapeTypeEnum.Rectangle);
        Assert.assertEquals(shape.getClass(), Rectangle.class);
    }

    @Test
    public void should_get_Square(){
        Shape shape = shapeCache.getShape(ShapeTypeEnum.Square);
        Assert.assertEquals(shape.getClass(), Square.class);
    }

    @Test
    public void should_get_Circle(){
        Shape shape = shapeCache.getShape(ShapeTypeEnum.Square);
        Assert.assertEquals(shape.getClass(), Square.class);
    }

}
