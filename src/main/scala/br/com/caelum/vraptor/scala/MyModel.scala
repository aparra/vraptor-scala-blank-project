package br.com.caelum.vraptor.scala

import scala.reflect.BeanProperty

class MyModel {
	
	var data: String = _

	def this(data: String) {
		this()
		this.data = data
	}
}