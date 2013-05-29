package br.com.caelum.vraptor.scala

import scala.reflect.BeanProperty

/*
 * A simple example model.
 * The @BeanProperty annotation is only required if this class
 * is used at JSP view files.
 */
class MyModel {
	
	@BeanProperty 
	var data: String = _

	def this(data: String) {
		this()
		this.data = data
	}

}