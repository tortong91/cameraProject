package controllers;
import models.Aptest;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import views.html.*;

import static views.html.order.render;

public class Application extends Controller {

    public static Result index() {
        return ok(main.render());
    }

    public static Result order() {
        return ok(render());
    }

    public static Result promotion() {
        return ok(promotion.render());
    }

    public static Result product() {
        return ok(product.render());
    }
    public  static Result seller(){

        return ok(seller_pro.render());
    }


    public static Result camera_form(){

        return ok(form_product.render());
    }
    public static Result camera_post(){
        DynamicForm myForm = Form.form().bindFromRequest();
        String title,cameratype,a,aword,detail;
        double price;

        title = myForm.get("title");
        cameratype=myForm.get("cameratype");
        a=myForm.get("a");
        //aword=myForm.get("aword");
        if(myForm.get("aword")!=null)
            aword ="เคยได้รับรางวัล";
        else
            aword="ยังไม่เคยได้รับรางวัล";
        detail=myForm.get("detail");
        price =Double.parseDouble(myForm.get("price"));
return ok(camera_show.render(title,cameratype,a,aword,detail,price));
    }
/*
    public static Result Apptest(){
        Aptest camm1 = new Aptest();
        camm1.setId("001");
        camm1.setName("nikon001");
        camm1.setPrice(49000.00);
        camm1.setAmount(10);
        Aptest Camm2 = new Aptest("002","Sony1",103000.00,5);
        Aptest Camm3 = new Aptest("003","Sony",103500.00,10);
        Aptest Camm4 = new Aptest("004","Sony",103500.00,10);
        Aptest Camm5 = new Aptest("005","Sony",103500.00,10);
        Aptest Camm6 = new Aptest("006","Sony",103500.00,10);



        return ok(Apptestshow.render(camm1,Camm2,Camm3,Camm4,Camm5,Camm6));
    }
*/
}
