package fao.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import fao.org.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	/*

	@GetMapping("/product")
	public List<ProductDTO> getProducts() {
		List<ProductDTO> produtos = productService.getAll();
		return produtos;
	}

	@GetMapping("/product/category/{categoryId}")
	public List<ProductDTO> getProductByCategory(@PathVariable Long categoryId) {
		List<ProductDTO> produtos = productService.getProductByCategoryId(categoryId);
		return produtos;
	}

	@GetMapping("/product/{productIdentifier}")
	ProductDTO findById(@PathVariable String productIdentifier) {
		return productService.findByProductIdentifier(productIdentifier);
	}

	@PostMapping("/product")
	ProductDTO newProduct(@Valid @RequestBody ProductDTO productDTO) {
		return productService.save(productDTO);
	}

	*/
}
