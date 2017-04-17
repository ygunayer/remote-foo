package com.yalingunayer.foo

import akka.actor.ActorSystem

object Application {
  def main(args: Array[String]): Unit = {
    val foo = ActorSystem("Foo")
    foo.actorOf(FooActor.props())
  }
}
