package com.example

import scalaz._
import Scalaz._
import scalaz.effect.IO
import scalaz.effect.IO.putStrLn

object Hello {
  def main(args: Array[String]): Unit = {
    val helloWorld = for {
      _ <- putStrLn("Hello, world!")
    } yield ()

    helloWorld.unsafePerformIO
  }
}
