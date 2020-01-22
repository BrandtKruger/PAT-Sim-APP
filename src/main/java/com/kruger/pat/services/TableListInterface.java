package com.kruger.pat.services;

import com.kruger.pat.commands.TableListCommand;

import java.util.Set;

public interface TableListInterface {

    Set<TableListCommand> getTableList(final Integer staffMember);
}
