package com.kruger.pat.repositories;

import com.kruger.pat.models.Item;
import com.kruger.pat.models.Payment;
import com.kruger.pat.models.TableList;
import com.kruger.pat.services.ItemsService;
import com.kruger.pat.services.PaymentService;
import com.kruger.pat.services.TableListService;
import org.junit.Ignore;
import org.mockito.Mock;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Transactional
public class TableListRepositoryTest {

    @Mock
    TableListRepository tableListRepository;
    @Mock
    ItemRepository itemRepository;
    @Mock
    PaymentRepository paymentRepository;

    TableListService tableListService;
    ItemsService itemsService;
    PaymentService paymentService;

//    @Before
//    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//        tableListService = new TableListService(tableListRepository);
//        itemsService = new ItemsService(itemRepository);
//        paymentService = new PaymentService(paymentRepository);
//    }

    @Ignore
    public void addTableList(){

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
        tableListService.saveTableList(tableList);

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


        tableListService.saveTableList(tableList);
    }
}