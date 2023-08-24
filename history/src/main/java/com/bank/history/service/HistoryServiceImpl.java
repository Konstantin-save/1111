package com.bank.history.service;



import com.bank.history.mapper.HistoryMapper;
import com.bank.history.model.dto.HistoryDto;
import com.bank.history.model.entity.History;
import com.bank.history.repository.HistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * сервисный класс для работы с объектами {@link History}, использует HistoryRepository для выполнения операций с базой данных
 */


@Service
public class HistoryServiceImpl implements HistoryService{

    private final HistoryRepository historyRepository;
    private final HistoryMapper historyMapper; // добавьте ModelMapper

    /**
     * @param historyRepository {@link History} сохр
     *                          аняет его в базе данных с помощью метода save из historyRepository
     * @param historyMapper
     */

    public HistoryServiceImpl(HistoryRepository historyRepository, HistoryMapper historyMapper) {
        this.historyRepository = historyRepository;
        this.historyMapper = historyMapper;
    }

    /**
     * возвращает список всех записей {@link History} из базы данных
     */
    public HistoryDto saveHistory(HistoryDto historyDto) {
        History historyEntity = historyMapper.mapToEntity(historyDto);
        historyRepository.save(historyEntity);
        return historyMapper.mapToDto(historyEntity); // Маппинг из сущности в DTO
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
    public History getHistoryById(Long id) {
        return historyRepository.findById(id).orElse(null);
        //return HistoryMapper.INSTANCE.mapToDto(historyRepository.findById(id));
    }

    /**
     * принимает идентификатор id в качестве параметра и удаляет запись {@link History} с ним
     */
    public void deleteHistoryById(Long id) {
        historyRepository.deleteById(id);
    }
}
