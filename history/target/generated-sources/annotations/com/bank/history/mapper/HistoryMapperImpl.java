package com.bank.history.mapper;

import com.bank.history.model.dto.HistoryDto;
import com.bank.history.model.entity.History;
import java.util.Optional;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-24T14:54:15+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class HistoryMapperImpl implements HistoryMapper {

    @Override
    public History mapToEntity(HistoryDto historyDto) {
        if ( historyDto == null ) {
            return null;
        }

        History history = new History();

        history.setId( historyDto.getId() );
        history.setTransferAuditId( historyDto.getTransferAuditId() );
        history.setProfileAuditId( historyDto.getProfileAuditId() );
        history.setAccountAuditId( historyDto.getAccountAuditId() );
        history.setAntiFraudAuditId( historyDto.getAntiFraudAuditId() );
        history.setPublicBankInfoAuditId( historyDto.getPublicBankInfoAuditId() );
        history.setAuthorizationAuditId( historyDto.getAuthorizationAuditId() );

        return history;
    }

    @Override
    public HistoryDto mapToDto(History history) {
        if ( history == null ) {
            return null;
        }

        HistoryDto historyDto = new HistoryDto();

        historyDto.setId( history.getId() );
        historyDto.setTransferAuditId( history.getTransferAuditId() );
        historyDto.setProfileAuditId( history.getProfileAuditId() );
        historyDto.setAccountAuditId( history.getAccountAuditId() );
        historyDto.setAntiFraudAuditId( history.getAntiFraudAuditId() );
        historyDto.setPublicBankInfoAuditId( history.getPublicBankInfoAuditId() );
        historyDto.setAuthorizationAuditId( history.getAuthorizationAuditId() );

        return historyDto;
    }

    @Override
    public HistoryDto mapToDto(Optional<History> history) {
        if ( history == null ) {
            return null;
        }

        HistoryDto historyDto = new HistoryDto();

        return historyDto;
    }
}
