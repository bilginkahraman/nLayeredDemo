package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	public void add(Product product); 
	public void update(Product product);
	public void delete(Product product);
	//ürün idye göre getirmesi için kullanýyoruz.
	Product get(int id);
	//Listeleme getall tüm tipe baglý ürünleri ceker.
	List<Product> getAll();
}
