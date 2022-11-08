package fao.org.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fao.org.DTO.ProductDTO;
@Service
public interface ProductService {
	
	public List<ProductDTO> getAll();
	
	public List<ProductDTO> getProductByCategoryId(Long categoryId);
	public ProductDTO findByProductIdentifier(String productIdentifier);
	public ProductDTO save(ProductDTO productDTO);
	public void delete(long productId);
}
