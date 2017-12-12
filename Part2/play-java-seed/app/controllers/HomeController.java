package controllers;

import play.mvc.*;
import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;

public class HomeController extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result about() {
        return ok(about.render());
    }

    public Result products() {
        List<Product> productList = Product.findAll();
        return ok(products.render(productList));
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
