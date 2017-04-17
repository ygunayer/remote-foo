package com.yalingunayer.foo

import akka.actor.ActorSystem
import akka.routing.FromConfig
import com.typesafe.config.ConfigFactory

object Application {
  def main(args: Array[String]): Unit = {
    val foo = ActorSystem("Foo")
    foo.actorOf(FooActor.props().withRouter(FromConfig()), name = "foo")
  }
}
