package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;

import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	//Asla ve Asla hibernate baglý degiliz artýk interface ile reference tutucu
	//olarak kullanabiliriz.
	//dependency injection
	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün Eklendi" + product.getName());
		//Database Sistemine sýký sýkýya baglamýs oluyoruz
		//bu yüzden istemeyiz
		//HibernateProductDao dao=new HibernateProductDao();
		//dao.add(product);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
