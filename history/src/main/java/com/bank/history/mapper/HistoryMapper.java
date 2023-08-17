package com.bank.history.mapper;


import com.bank.history.model.dto.HistoryDto;
import com.bank.history.model.entity.History;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface HistoryMapper {
    HistoryMapper INSTANCE = Mappers.getMapper(HistoryMapper.class); // Преобразование в объект HistoryDto
    History mapToEntity(HistoryDto historyDto);
    HistoryDto mapToDto(Optional<History> history);



//    @Mapping(target = "transferAuditId", source = "transferAuditId")
//    @Mapping(target = "profileAuditId", source = "profileAuditId")
//    @Mapping(target = "accountAuditId", source = "accountAuditId")
//    @Mapping(target = "antiFraudAuditId", source = "antiFraudAuditId")
//    @Mapping(target = "publicBankInfoAuditId", source = "publicBankInfoAuditId")
//    @Mapping(target = "authorizationAuditId", source = "authorizationAuditId")
//    HistoryDto hitoryToHistoryDto(Optional<History> history);
//
//    @Mapping(target = "transferAuditId", source = "transferAuditId")
//    @Mapping(target = "profileAuditId", source = "profileAuditId")
//    @Mapping(target = "accountAuditId", source = "accountAuditId")
//    @Mapping(target = "antiFraudAuditId", source = "antiFraudAuditId")
//    @Mapping(target = "publicBankInfoAuditId", source = "publicBankInfoAuditId")
//    @Mapping(target = "authorizationAuditId", source = "authorizationAuditId")
//    History hitoryDtoToHistory(HistoryDto historyDto);

}
