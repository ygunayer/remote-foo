package com.yalingunayer.foo

import akka.actor.Actor
import akka.actor.Props

object FooActor {
  def props(): Props = Props(classOf[FooActor])
}

class FooActor extends Actor {
  def receive = {
    case s: String => {
      println(f"Received a message: $s")
      sender ! f"Hello from ${self.path}!" 
    }
  }
  
  override def preStart(): Unit = {
    println(f"Foo actor is listening at ${self.path}")
  }
}
