package com.bank.history.service;
import com.bank.history.model.dto.HistoryDto;
import com.bank.history.model.entity.History;

import java.util.List;

public interface HistoryService {
    HistoryDto saveHistory(HistoryDto history);

    List<History> getAllHistories();

    History getHistoryById(Long id);

    void deleteHistoryById(Long id);
}
