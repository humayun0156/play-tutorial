package controllers.slick

import play.api.mvc.{Action, Controller}

/**
  * @author humayun
  */
class PersonController extends Controller {

  def index = Action {
    Ok(views.html.slick.slickindex("Hello Slick"))
  }

}
