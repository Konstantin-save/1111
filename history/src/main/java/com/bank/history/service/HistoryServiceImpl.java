package com.bank.history.service;



import com.bank.history.mapper.HistoryMapper;
import com.bank.history.model.dto.HistoryDto;
import com.bank.history.model.entity.History;
import com.bank.history.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * сервисный класс для работы с объектами {@link History}, использует HistoryRepository для выполнения операций с базой данных
 */


@Service
public class HistoryServiceImpl implements HistoryService{

    private final HistoryRepository historyRepository;


    /**
     * @param historyRepository {@link History} сохр
     *                          аняет его в базе данных с помощью метода save из historyRepository
     *
     */

    public HistoryServiceImpl(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    /**
     * возвращает список всех записей {@link History} из базы данных
     */
    public History saveHistory(History history) {
        return historyRepository.save(history);
    }

    /**
     * возвращает список всех записей {@link History} из базы данных
     */
    public List<History> getAllHistories() {
        return historyRepository.findAll();
    }

    /**
     * Возвращает запись {@link History} с идентификатором Если запись не найдена, возвращается значение null
     */
    public HistoryDto getHistoryById(Long id) {
        //return historyRepository.findById(id).orElse(null);
        return HistoryMapper.INSTANCE.mapToDto(historyRepository.findById(id));
    }

    /**
     * принимает идентификатор id в качестве параметра и удаляет запись {@link History} с ним
     */
    public void deleteHistoryById(Long id) {
        historyRepository.deleteById(id);
    }
}
