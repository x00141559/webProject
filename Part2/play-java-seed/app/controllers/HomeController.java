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
import models.users.*;

public class HomeController extends Controller {

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f){
        this.formFactory = f;
    }
    public Result index(Long cat ){
        List<Product> productList = null;
        if (cat ==0){
            productList = Product.findAll();

            
        }
        else{
            return null;
        }
        return ok(index.render(productList,User.getUserById(session().get("email"))));
    }
@Security.Authenticated(Secured.class)
@With(AuthAdmin.class)
public Result addProduct(){
    Form<Product> productForm = formFactory.form(Product.class);
    return ok(addProduct.render(productForm,User.getUserById(session().get("email"))));
}
    // public Result about() {
    //     return ok(about.render(User.getUserById(session().get("email"))));
    // }

    public Result addProductSubmit(){
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();
        if(newProductForm.hasErrors()){
            return badRequest(addProduct.render(newProductForm,User.getUserById(session().get("email"))));
        }
        else{
            Product newProduct = newProductForm.get();
            if (newProduct.getId()==null){
                newProduct.save();
                flash("success","Product "+newProduct.getName()+"was added");
            }
            else if(newProduct.getId()!=null){
                newProduct.update();       
                flash("success","Product "+newProduct.getName()+"was updated");
                 }
        }
        return redirect(controllers.routes.HomeController.index(0));
    }
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateProduct(Long id){
        Product p;
        Form<Product>productForm ;
        try{
            p = Product.find.byId(id);
            productForm = formFactory.form(Product.class).fill(p);
        }
        catch(Exception e){
   return badRequest("error");
        }
        return ok(addProduct.render(productForm,User.getUserById(session().get("email"))));
    }
    public Result products() {
        List<Product> productList = Product.findAll();
        return ok(products.render(productList,User.getUserById(session().get("email"))));
    }

    // public Result product() {
    //     return ok(product.render(product()));
    // }

    public Result search(String query) {
        List<Product> productList = Product.findSearch(query);
        return ok(search.render(query, productList,User.getUserById(session().get("email"))));
    }


    // public Result purchase() {
    //     return ok(purchase.render(purchase.class,User.getUserById(session().get("email"))));
    // }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteProduct(Long id){
        Product.find.ref(id).delete();
        flash("success","product has been deleted");
        return redirect(routes.HomeController.index(0));
    }
}
