import junit.framework.TestCase;

public class ItemTest extends TestCase {

    public void testSetGetA() throws Exception {
        Item i;
        i = new Item();
        i.setA(2);
        assertEquals(2, i.getA());
    }
}