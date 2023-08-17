package com.bank.history.repository;

import com.bank.history.model.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * интерфейс для взаимодействия с базой данных и выполнения операций связанных с сущностью History.
 */
@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
}
