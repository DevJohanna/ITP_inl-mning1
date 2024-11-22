import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LogicTest {

    // Testar att "stop" stoppar programmet.
   @Test
   public void addRowStopTrue() {
        var logic = new Logic();
        logic.addRow("stop");
        boolean actual = logic.stop;
        assertEquals(true, actual);
    }

    // Testar att "STOP" inte stoppar programmet.
    @Test
   public void addRowStopFalse() {
        var logic = new Logic();
        logic.addRow("STOP");
        boolean actual = logic.stop;
        assertEquals(false, actual);
    }

// Testar antal rader.
    @Test
   public void rowCountIs3() {
        var logic = new Logic();
        logic.addRow("A");
        logic.addRow("B");
        logic.addRow("C");

        int actual = logic.rowCount();
        assertEquals(3,actual);
    }

    // Testar antal tecken i rader.
    @Test
   public void charCountIs10() {
        var logic = new Logic();
        logic.addRow("ABC");
        logic.addRow("DEF");
        logic.addRow("GHJI");

        int actual = logic.charCount();
        assertEquals(10,actual);
    }

    // Testar tecken i tomma rader.
    @Test
    public void charCountIsEmpty() {
        var logic = new Logic();
        logic.addRow("");
        logic.addRow("");
        logic.addRow("");

        int actual = logic.charCount();
        assertEquals(0,actual);
    }

}
