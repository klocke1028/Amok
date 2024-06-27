package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    private VirtualPetShelter shelter;

    @BeforeEach
    public void setUp() {
        shelter = new VirtualPetShelter();
    }

    @Test
    public void testAdmitPets() {
        VirtualPet orgPet = new OrganicCat("TestCat", "Test org cat", 10, 10, 10, 10);
        shelter.admitPet(orgPet);
        assertEquals(2, 2);
    }

    @Test 
    public void testPetExists() {
        
    }

}
