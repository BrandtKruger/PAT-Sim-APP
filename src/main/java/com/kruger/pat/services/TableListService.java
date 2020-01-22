package com.kruger.pat.services;

import com.kruger.pat.commands.TableListCommand;
import com.kruger.pat.converters.TableListToTableListCommand;
import com.kruger.pat.converters.TablistCommandToTableList;
import com.kruger.pat.models.TableList;
import com.kruger.pat.repositories.TableListRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TableListService implements TableListInterface {

    private final TableListRepository tableListRepository;
    private final TableListToTableListCommand tableListToTableListCommand;
    private final TablistCommandToTableList tablistCommandToTableList;


    public TableListService(TableListRepository tableListRepository,
                            TableListToTableListCommand tableListToTableListCommand,
                            TablistCommandToTableList tablistCommandToTableList) {
        this.tableListRepository = tableListRepository;
        this.tableListToTableListCommand = tableListToTableListCommand;
        this.tablistCommandToTableList = tablistCommandToTableList;
    }

    public Set<TableListCommand> getTableList(final Integer staffMember) {

        return  tableListToTableListCommand.convert(tableListRepository.getTableListByStaffMember(staffMember));
    }

    public void saveTableList(TableList tableList){
        tableListRepository.save(tableList);
    }
}
