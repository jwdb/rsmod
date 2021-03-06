package org.rsmod.game.model.world

import com.google.inject.Inject
import org.rsmod.game.collision.CollisionMap
import org.rsmod.game.collision.GameObjectMap
import org.rsmod.game.queue.GameQueueList

class World @Inject constructor(
    val collisionMap: CollisionMap,
    val objectMap: GameObjectMap
) {

    internal val queueList = GameQueueList()

    fun queue(block: suspend () -> Unit) = queueList.queue(block)
}
