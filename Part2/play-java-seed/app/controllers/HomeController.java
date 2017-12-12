package controllers;

import play.mvc.*;
import views.html.*;

public class HomeController extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result about() {
        return ok(about.render());
    }

    public Result products() {
        return ok(products.render());
    }

    public Result product() {
        return ok(product.render());
    }

    public Result search(String query) {
        return ok(search.render(query));
    }

    public Result basket() {
        return ok(basket.render());
    }

    public Result purchase() {
        return ok(purchase.render());
    }
}
