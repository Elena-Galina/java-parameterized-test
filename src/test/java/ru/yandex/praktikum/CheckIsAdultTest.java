package ru.yandex.praktikum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {
    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }
    @Parameterized.Parameters
    public static Object[][] getTextData(){
        return new Object[][]{
                {-1,false},
                {17,false},
                {18,true},
                {19,true},
        };
    }
    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program= new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Должно вернуться true, если пользователь совершеннолетний", result, isAdult);
    }
}
