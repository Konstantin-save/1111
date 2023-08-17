package com.bank.history.model.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString

public class HistoryDto {
    private Long id;
    private int transferAuditId;
    private int profileAuditId;
    private int accountAuditId;
    private int antiFraudAuditId;
    private int publicBankInfoAuditId;
    private int authorizationAuditId;
}
