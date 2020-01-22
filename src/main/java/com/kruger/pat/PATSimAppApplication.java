package com.kruger.pat;

import com.kruger.pat.models.Item;
import com.kruger.pat.models.Payment;
import com.kruger.pat.models.TableList;
import com.kruger.pat.repositories.ItemRepository;
import com.kruger.pat.repositories.PaymentRepository;
import com.kruger.pat.repositories.TableListRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class PATSimAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PATSimAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(TableListRepository tableListRepository,
									  ItemRepository itemRepository,
									  PaymentRepository paymentRepository){

		return args -> {
			TableList tableList = new TableList();
			Set<Item> items = new HashSet<>();
			Item item = new Item();

			Set<Payment> payments = new HashSet<>();
			Payment payment = new Payment();

			tableList.setTableListResponseName("Table 1");
			tableList.setTableListResponseItemCount(5);
			tableList.setTableListResponseInvoiceDescription(2);
			tableList.setTableListResponseAccountNo(0);
			tableList.setStaffMember(2);
			tableList.setTableListResponseOrderNo(0);
			tableList.setTableListResponsePriceLevel(0);
			tableList.setTableListResponseTotal("65.00");
			tableList.setTableListResponseTotaled(0);
			tableListRepository.saveAll(Arrays.asList(tableList));

			item.setItemsSeatNo(2);
			item.setItemsQty(1);
			item.setItemsLineTotal(10.00);
			item.setItemsName("Coke");

			items.add(item);
			itemRepository.saveAll(items);


			payment.setInvoiceNo(1);
			payment.setPaymentsName("Card");
			payment.setPaymentsSpecial(false);
			payment.setPaymentsType(0);
			payment.setPaymentsValue(100.00);

			payments.add(payment);
			paymentRepository.saveAll(payments);

			tableList.getItems().addAll(items);
			tableList.getPayments().addAll(payments);

			tableListRepository.saveAll(Arrays.asList(tableList));

		};

	}

}
