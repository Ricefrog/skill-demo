import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiplication() {
        assertEquals(42, SkillDemo.multiplication(5*10));
    }
}
