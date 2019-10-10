import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Lab 8
 *
 * Test suite for the Contestant enum.
 *
 * @author Stephen
 * @version 2018-03-12
 *
 */
public class Contestant_Test
{
    /**
     * Tests that George's region is the expected value.
     */
	@Test
    public void contestantGeorgeGetRegionTest() throws AssertException
    {
    	assertEquals(Region.NORTH, Contestant.GEORGE.getRegion());
    }
    
    /**
     * Tests that Jill's region is the expected value.
     */
	@Test
	public void contestantJillGetRegionTest() throws AssertException
    {
    	Assert.assertEquals(Region.SOUTH, Contestant.JILL.getRegion());
    }

    /**
     * Tests that Matthew's region is the expected value.
     */
    @Test
    public void contestantMatthewGetRegionTest() throws AssertException
    {
    	Assert.assertEquals(Region.EAST, Contestant.MATTHEW.getRegion());
    }

    /**
     * Tests that Betty's region is the expected value.
     */
    @Test
    public void contestantBettyGetRegionTest() throws AssertException
    {
    	Assert.assertEquals(Region.WEST, Contestant.BETTY.getRegion());
    }

    /**
     * Tests that George's hand choice is the expected value.
     */
    @Test
    public void contestantGeorgeGetChoiceTest() throws AssertException
    {
    	Assert.assertEquals(HandChoice.ROCK, Contestant.GEORGE.getChoice());
    }
    
    /**
     * Tests that Jill's hand choice is the expected value.
     */

    @Test
    public void contestantJillGetChoiceTest() throws AssertException
    { 
    	Assert.assertEquals(HandChoice.ROCK, Contestant.JILL.getChoice());
    }

    /**
     * Tests that Matthew's hand choice is the expected value.
     */
    @Test
    public void contestantMatthewGetChoiceTest() throws AssertException
    {
    	Assert.assertEquals(HandChoice.SCISSORS, Contestant.MATTHEW.getChoice());
    }

    /**
     * Tests that Betty's hand choice is the expected value.
     */
    @Test
    public void contestantBettyGetChoiceTest() throws AssertException
    {
    	Assert.assertEquals(HandChoice.PAPER, Contestant.BETTY.getChoice());
    }

    /**
     * Tests that Supercontestant.toString() returns the expected value for each contestant.
     */
    @Test
    public void contestantToStringTest() throws AssertException
    {
    	String expected = "betty: contestant from west throwing paper";
    	String actual = Contestant.BETTY.toString();
    	Assert.assertEquals(expected, actual);
    }
}
