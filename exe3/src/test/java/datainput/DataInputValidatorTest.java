package datainput;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class DataInputValidatorTest {

    @Test
    public void shouldValidDataInput(){
        String input = "16/11/2019";
        DataInputValidator validator = new DataInputValidator();
        assertEquals(LocalDate.of(2019, 11, 16), validator.Input(input));
        input = "85asdadasd";
        assertEquals(null, validator.Input(input));
        input = "16/11/2021";
        assertEquals(LocalDate.of(2021, 11, 16), validator.Input(input));
    }

    @Test
    public void shouldPlus7day(){
        String input = "16/11/2021";
        DataInputValidator validator = new DataInputValidator();
        validator.Input(input);
        validator.setDataInputPlus7Days();
        assertEquals(LocalDate.of(2021, 11, 23), validator.getDataInputLD());
        validator.setDataInputPlus7Days();
        assertEquals(LocalDate.of(2021, 11, 30), validator.getDataInputLD());
        validator.setDataInputPlus7Days();
        assertEquals(LocalDate.of(2021, 12, 7), validator.getDataInputLD());
        validator.setDataInputPlus7Days();
        assertEquals(LocalDate.of(2021, 12, 14), validator.getDataInputLD());
        validator.setDataInputPlus7Days();
        assertEquals(LocalDate.of(2021, 12, 21), validator.getDataInputLD());
        validator.setDataInputPlus7Days();
        assertEquals(LocalDate.of(2021, 12, 28), validator.getDataInputLD());
    }

}