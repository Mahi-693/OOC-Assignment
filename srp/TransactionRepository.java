package com.codurance.srp;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private List<Transaction> transactions = new ArrayList<>();

    public void add(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> all() {
        return transactions;
    }
}
