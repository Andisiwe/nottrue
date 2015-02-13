package za.ac.cput.nottrue;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by student on 2015/02/12.
 */
public class TestIsFalse extends TestCase {
    public void testFalse() throws Exception{
        IsFalse isF = new IsFalse();

        Assert.assertFalse("False", isF.notTrue() < 3);
    }
}
