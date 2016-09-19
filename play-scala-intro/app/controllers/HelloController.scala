package controllers

import play.api.mvc._


/**
  * @author humayun
  */
class HelloController extends Controller {

  def hello(name: String) = Action {
    request => Ok(views.html.hello("Welcome: " + name))
  }
}
