import org.junit.Test;
import jp.co.topgate.tami.web.main;

import static org.junit.Assert.assertEquals;
public class test{
    @Test
    public void testAdd() {
        assertEquals(3, main.add(1, 2));
    }
}