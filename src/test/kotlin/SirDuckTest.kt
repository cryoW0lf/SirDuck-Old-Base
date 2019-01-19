package pw.cryow0lf.sirduck

import net.dv8tion.jda.core.JDA
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import java.lang.IllegalStateException

class SirDuckTest {

    @Test
    fun healthyStartUp() {
        val jda: JDA = Mockito.mock(JDA::class.java)
        `when`(jda.awaitReady()).thenReturn(jda)
        val sirDuck = SirDuck(jda)

        assertTrue(sirDuck.healthy, "SirDuck should be healthy if nothing failed")
    }

    @Test
    fun discordFailStartUp() {
        val jda: JDA = Mockito.mock(JDA::class.java)
        `when`(jda.awaitReady()).thenThrow(IllegalStateException("Was shutdown trying to await status"))

        assertThrows(IllegalStateException::class.java, { SirDuck(jda) }, "SirDuck should rethrow JDA-awaitReady Exceptions")
    }
}