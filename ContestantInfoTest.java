/**
 * Lab 8
 *
 * Test suite for the ContestantInfo class.
 *
 * @author Stephen
 * @version 2018-03-12
 *
 */
public class ContestantInfoTest
{
    /**
     * The ContestantInfo instance to test.
     */
    private static ContestantInfo info;

    /**
     * Creates a ContestantInfo instance for testing.
     */
    public static void initialize() throws AssertException
    {
    	info = new ContestantInfo(Region.NORTH, HandChoice.PAPER);
    	boolean worked = false;
    	if(info.getRegion().equals(Region.NORTH) && info.getChoice().equals(HandChoice.PAPER))
    	{
    		worked = true;
    	}
    	Assert.assertEquals(true, worked);
    }

    /**
     * Tests the ContestantInfo constructor.
     */
    public void contestantInfoConstructorTest() throws AssertException
    {
    	info = new ContestantInfo(Region.NORTH, HandChoice.PAPER);
    	boolean worked = false;
    	if(info.getRegion().equals(Region.NORTH) && info.getChoice().equals(HandChoice.PAPER))
    	{
    		worked = true;
    	}
    	Assert.assertEquals(true, worked);
    }

    /**
     * Tests that ContestantInfo.toString() returns the expected value.
     */
    public void contestantInfoToStringTest() throws AssertException
    {
    	info = new ContestantInfo(Region.NORTH, HandChoice.PAPER);
    	String expected = "contestant from north throwing paper";
    	String actual = info.toString();
    	Assert.assertEquals(expected, actual);
    }
}
