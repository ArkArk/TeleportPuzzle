package puzzle.stage.entity.tile

import com.badlogic.gdx.graphics.g2d.Sprite
import puzzle.game.GameStage

class Space(indexX: Int, indexY: Int) : Tile(indexX, indexY) {

    init {
        sprite = Sprite(GameStage.Texture.space)
    }

}