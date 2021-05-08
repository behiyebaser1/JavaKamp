import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		//BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1,"Muhammed Engin","Ba�er", LocalDate.of(1999,3,22),"11111111111"));
		
		System.out.println();//bilgiler do�ru girildi�inde (b�y�k k���k harf duyarl�, do�um y�l� baz al�n�yor.)
		                     //mernis do�rulama �al���yor

	}

}
