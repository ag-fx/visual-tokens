package com.snaulX.VisualTokens.app

import javafx.scene.layout.HBox
import tornadofx.*

interface Block {
    val code: Byte
    val root: HBox
    var select: Boolean

    /**
     * Implement [select] for all blocks
     */
    fun onSelect() {
        root.setOnMouseClicked {
            select = !select
        }
    }
    fun run(blocks: List<Block>)
    fun toBytes(): ByteArray
    fun read(start: Int, data: ByteArray): Int
}