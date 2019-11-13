import org.junit.Test;
import ru.job4j.bot.DummyBot;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void whenGreetingsBot () {
        assertThat(DummyBot.answer("Привет, бот"), is("Привет, умник"));
    }

    @Test
    public void whenByeBot () {
        assertThat(DummyBot.answer("Пока, бот"), is("До скорой встречи"));
    }

    @Test
    public void whenAnotherBot () {
        assertThat(DummyBot.answer("Что делаешь, бот?"), is("Это ставит меня в тупик. Задайте другой вопрос"));
    }


}
