package com.bank.history.controller;

import com.bank.history.mapper.HistoryMapper;
import com.bank.history.model.dto.HistoryDto;
import com.bank.history.model.entity.History;
import com.bank.history.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/history")
public class HistoryController  {
    private final HistoryService historyService;

    @Autowired
    public HistoryController(HistoryService historyService) {
        this.historyService = historyService;

    }
    @PostMapping("/create")
    public ResponseEntity<HistoryDto> createHistory(@RequestBody HistoryDto historyDto) {
        return ResponseEntity.ok(historyService.saveHistory(historyDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<HistoryDto>> getAllHistories() {
        List<History> histories = historyService.getAllHistories();
        List<HistoryDto> historyDtos = histories.stream()
                .map(HistoryMapper.INSTANCE::mapToDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(historyDtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HistoryDto> getHistoryById(@PathVariable Long id) {
        History history = historyService.getHistoryById(id);
        if (history != null) {
            HistoryDto historyDto = HistoryMapper.INSTANCE.mapToDto(history);
            return ResponseEntity.ok(historyDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHistoryById(@PathVariable Long id) {
        historyService.deleteHistoryById(id);
        return ResponseEntity.noContent().build();
    }
}


