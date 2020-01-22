package com.kruger.pat.repositories;

import com.kruger.pat.models.TableList;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface TableListRepository extends CrudRepository<TableList, Long> {

    //@Query("SELECT tl.* i.* p.* FROM tablelist tl INNER JOIN payment p ON p.invoice_no = tl.invoice_no INNER JOIN item i ON i.item_id = tl.item_id")
   Set<TableList> getTableListByStaffMember(final Integer staffMember);


}
