/**
 * 
 */
package perks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * @author zeil
 *
 */
public class TestRequirements {

    Perk strength1 = new Perk("strength1", 1);
    Perk agility1 = new Perk("agility1", 1);
    Perk acrobat1 = new Perk("acrobat", 1);
    
    Perk[] strengthAndAgilityA = {strength1, agility1};
    HashSet<Perk> strengthAndAgility = new HashSet<>(Arrays.asList(strengthAndAgilityA));
    Perk[] strengthOnlyA = {strength1};
    HashSet<Perk> strengthOnly = new HashSet<>(Arrays.asList(strengthOnlyA));
    Perk[] agilityOnlyA = {agility1};
    HashSet<Perk> agilityOnly = new HashSet<>(Arrays.asList(agilityOnlyA));
    

    @Test
    public void testRequirements() {
        Requirements requirements = new Requirements();
        assertEquals(null, requirements.getPerk("strength1"));
        assertEquals(0, requirements.numberOfPerks());
        assertEquals(0, requirements.allPerks().size());
        assertFalse(requirements.canSelect(acrobat1, strengthAndAgility));
    }

    @Test
    public void testAddPerk() {
        Requirements requirements = new Requirements();
        requirements.addPerk(strength1);
        requirements.addPerk(agility1);
        assertEquals(strength1, requirements.getPerk("strength1"));
        assertEquals(agility1, requirements.getPerk("agility1"));
        assertEquals(2, requirements.numberOfPerks());

        assertIterableEquals(strengthAndAgility, requirements.allPerks());
        assertTrue(requirements.canSelect(agility1, new HashSet<>()));
        assertTrue(requirements.canSelect(strength1, new HashSet<>()));
        assertFalse(requirements.canSelect(acrobat1, new HashSet<>()));
    }

    @Test
    public void testAddDependency() {
        Requirements requirements = new Requirements();
        requirements.addPerk(strength1);
        requirements.addPerk(agility1);
        requirements.addPerk(acrobat1);
        requirements.addDependency(acrobat1, strength1);
        assertFalse(requirements.canSelect(acrobat1, new HashSet<>()));
        assertTrue(requirements.canSelect(acrobat1, strengthOnly));
        assertTrue(requirements.canSelect(acrobat1, strengthAndAgility));
        assertFalse(requirements.canSelect(acrobat1, agilityOnly));

        requirements.addDependency(acrobat1, agility1);
        assertFalse(requirements.canSelect(acrobat1, new HashSet<>()));
        assertFalse(requirements.canSelect(acrobat1, strengthOnly));
        assertTrue(requirements.canSelect(acrobat1, strengthAndAgility));
        assertFalse(requirements.canSelect(acrobat1, agilityOnly));
    }

}
