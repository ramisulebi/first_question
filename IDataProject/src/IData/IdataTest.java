package IData;

import static org.junit.Assert.*;
import org.junit.Test;

public class IdataTest {
    
    @Test
    public void testProductionIdata() {
        Idata production = new ProductionIdata();
        assertEquals(MainWork.Paper, production.getMainWork());
        assertEquals("Production", production.getDepartment());
    }
    
    @Test
    public void testDevIdata() {
        Idata dev = new DevIdata();
        assertEquals(MainWork.Digital, dev.getMainWork());
        assertEquals("Development", dev.getDepartment());
    }
}