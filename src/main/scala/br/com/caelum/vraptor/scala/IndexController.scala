package br.com.caelum.vraptor.scala

import br.com.caelum.vraptor.{ Get, Post, Resource };

@Resource
class IndexController {

  @Get(Array("/"))
  def index = new MyModel("It works!")

  @Post(Array("/"))
  def index(myModel: MyModel) = myModel

  @Get(Array("/jsp"))
  def jsp = new Model2Jsp("It works with JSP too!")

  @Get(Array("/list"))
  def list = List("It", "works", "with", "lists")
}
