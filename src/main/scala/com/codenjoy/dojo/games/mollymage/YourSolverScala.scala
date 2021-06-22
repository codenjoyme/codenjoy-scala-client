package com.codenjoy.dojo.games.mollymage

import com.codenjoy.dojo.client.Solver
import com.codenjoy.dojo.client.runner.Language
import com.codenjoy.dojo.services.{Dice, Direction}

@Language("scala")
class YourSolverScala(var dice: Dice) extends Solver[BoardScala] {
  private var board: BoardScala = _

  override def get(board: BoardScala): String = {
    this.board = board
    if (board.isGameOver) return ""
    // TODO put your logic here
    Direction.ACT.toString
  }
}