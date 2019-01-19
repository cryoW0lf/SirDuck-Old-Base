package pw.cryow0lf.sirduck

import net.dv8tion.jda.core.JDA

class SirDuck(val jda: JDA) {
    var healthy : Boolean = false

    init {
        jda.awaitReady()

        healthy = true
    }

}