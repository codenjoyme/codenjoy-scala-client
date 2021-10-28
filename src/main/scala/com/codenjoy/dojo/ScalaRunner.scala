package com.codenjoy.dojo

import com.codenjoy.dojo.client.WebSocketRunner
import com.codenjoy.dojo.client.runner.ReflectLoader.{loadScalaBoard, loadScalaSolver}

object ScalaRunner {

  // Select your game
  var GAME = "mollymage"

  // Paste here board page url from browser after registration,
  // or put it as command line parameter.
  var URL = "http://localhost:8080/codenjoy-contest/board/player/0?code=000000000000"

  def main(args: Array[String]): Unit = {
    if (args != null && args.length == 2) {
      GAME = args(0)
      URL = args(1)
    }
    WebSocketRunner.runClient(URL, loadScalaSolver(GAME), loadScalaBoard(GAME))
  }
}