import java.util.LinkedHashMap;

/**
 * Lab 
 *
 * Test suite for the RPSArena class.
 *
 * @author Stephen
 * @version 2018-03-12
 *
 */
public class RPSArenaTest {

    /**
     * The RPSArena instance to test.
     */
    private static RPSArena arena;

    /**
     * Creates a RPSArena instance for testing.
     */
    public static void initialize() throws AssertException
    {
    	arena = new RPSArena();
    }
    
    /**
     * Tests the constructor and the contestant lists
     */
    public void testContestantList() throws AssertException {
    	String expected = "BET - betty: contestant from west throwing paper";
    	Assert.assertEquals(expected, arena.listContestantsWithHandChoice(HandChoice.PAPER));
    }

    /**
     * Tests getting the abbreviations.
     */
    public void testContestantAbbreviations() throws AssertException {

    	LinkedHashMap<String, Integer> testMap = new LinkedHashMap<String, Integer>();
    	testMap.put("GEO", 42);
    	testMap.put("JIL", 8);
    	testMap.put("MAT", 82);
    	testMap.put("BET", 27);
    	
    	Assert.assertEquals(testMap.keySet(), arena.getContestantAbbreivations());
    }
    
    /**
     * Tests getting the contestants that exist in the map.
     */
    public void testGetContestantExists() throws AssertException {
    	Assert.assertEquals(Contestant.GEORGE, arena.getContestant("geo"));
    }
    
    /**
     * Tests getting a contestant that does not exist in the map.
     * Note: there is an assertNull method within Assert.java you can use
     */
    public void testGetContestantDoesNotExist() throws AssertException {
    	Assert.assertEquals(null, arena.getContestant("hal"));
    	}
    
    /**
     * Tests a contestant battle ending in a tie.
     * Note: there is an assertNull method within Assert.java you can use
     */
    public void testContestantBattleTie() throws AssertException {
    	Assert.assertEquals(null, RPSArena.battleContestants(Contestant.GEORGE, Contestant.GEORGE));
    }
    
    /**
     * Tests a contestant battle ending in George winning.
     */
    public void testContestantBattleGeorgeWins() throws AssertException {
    	Assert.assertEquals(Contestant.GEORGE, RPSArena.battleContestants(Contestant.GEORGE, Contestant.MATTHEW));
    }
    
    /**
     * Tests a contestant battle ending in Betty winning.
     */
    public void testContestantBattleBettyWins() throws AssertException {
    	Assert.assertEquals(Contestant.BETTY, RPSArena.battleContestants(Contestant.BETTY, Contestant.GEORGE));
    }
}
