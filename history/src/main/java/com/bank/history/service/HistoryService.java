package com.bank.history.service;
import com.bank.history.model.dto.HistoryDto;
import com.bank.history.model.entity.History;

import java.util.List;

public interface HistoryService {
    History saveHistory(History history);

    List<History> getAllHistories();

    HistoryDto getHistoryById(Long id);

    void deleteHistoryById(Long id);
}
