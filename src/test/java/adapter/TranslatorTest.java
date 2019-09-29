package adapter;

import adapter.impl.Center;
import adapter.impl.Forwards;
import adapter.impl.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranslatorTest {

    /**
     * 适配器模式匹配
     *
     * @throws Exception
     */
    @Test
    public void testPlayer() throws Exception {
        Player player = new Forwards("巴蒂尔");
        player.attack();
        player.defense();

        Player player1 = new Translator("姚明");
        player1.attack();
        player1.defense();
    }

}