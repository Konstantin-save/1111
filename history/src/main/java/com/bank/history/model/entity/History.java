package com.bank.history.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "history")
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString

public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "transferAuditId")
    private int transferAuditId;
    @Column(name = "profileAuditId")
    private int profileAuditId;
    @Column(name = "accountAuditId")
    private int accountAuditId;
    @Column(name = "antiFraudAuditId")
    private int antiFraudAuditId;
    @Column(name = "publicBankInfoAuditId")
    private int publicBankInfoAuditId;
    @Column(name = "authorizationAuditId")
    private int authorizationAuditId;

}
