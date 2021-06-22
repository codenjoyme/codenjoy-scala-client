package com.codenjoy.dojo.games.tetris

import com.codenjoy.dojo.client.AbstractJsonSolver
import com.codenjoy.dojo.client.runner.Language
import com.codenjoy.dojo.services.{Dice, Direction}

/**
 * User: your name
 * Это твой алгоритм AI для игры. Реализуй его на свое усмотрение.
 * Обрати внимание на {@see SolverScalaTest} - там приготовлен тестовый
 * фреймворк для тебя.
 */
@Language("scala")
class YourSolverScala(var dice: Dice) extends AbstractJsonSolver[BoardScala] {

  override def getAnswer(board: BoardScala): String = {
    // TODO your code here
    Direction.DOWN.toString
  }
}