package com.practice.order.domain.partner;

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
}
