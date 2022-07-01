package com.practice.order.domain.partner;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Slf4j
public class partner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partnerName;
    private String businessNo;
    private String email;

    private Status status;

    @Getter
    @RequiredArgsConstructor
    public enum Status{
        ENABLE, DISABLE;
        private final String description;
    }

}
