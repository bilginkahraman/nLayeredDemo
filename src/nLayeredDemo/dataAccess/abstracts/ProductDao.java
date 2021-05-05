package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	public void add(Product product); 
	public void update(Product product);
	public void delete(Product product);
	//�r�n idye g�re getirmesi i�in kullan�yoruz.
	Product get(int id);
	//Listeleme getall t�m tipe bagl� �r�nleri ceker.
	List<Product> getAll();
}
