package _09.beanParam.service;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import _09.beanParam.model.Product;

@Path("/product-beanParam")
public class ProductResource {

	@GET
	@Path("/getProductById")
	// http://localhost:8080/injavawetrust.jersey.tutorial/product-beanParam/getProductById?id=100
	public String getProductById(@BeanParam Product product) {
		System.out.println(product);
		return product.toString();
	}

	@GET
	@Path("/getProductsByBrand")
	// http://localhost:8080/injavawetrust.jersey.tutorial/product-beanParam/getProductsByBrand;brand=acer
	public String getProductsByBrand(@BeanParam Product product) {
		System.out.println(product);
		return product.toString();
	}

	// http://localhost:8080/injavawetrust.jersey.tutorial/product-beanParam/getProductsByCategoryAndBrand/laptop;brand=acer;
	@GET
	@Path("/getProductsByCategoryAndBrand/{category}")
	public String getProductsByCategoryAndBrand(@BeanParam Product product) {
		System.out.println(product);
		return product.toString();
	}

}
