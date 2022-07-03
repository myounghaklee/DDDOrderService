package com.practice.order.domain.partner;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Slf4j
@Getter
@NoArgsConstructor
@Table(name = "partners")
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String partnerToken;

    private String partnerName;
    private String businessNo;
    private String email;

    private ZonedDateTime createAt;
    private ZonedDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Getter
    @RequiredArgsConstructor
    public enum Status{
        ENABLE("활성화"), DISABLE("비활성화");
        private final String description;
    }

    @Builder
    public Partner(String name , String businessNO, String email){
        if(name == null)throw new IllegalArgumentException();
        this.partnerToken = "randomToken";
        this.partnerName = name;
        this.businessNo = businessNO;
        this.email = email;
        this.status = Status.ENABLE;
        this.createAt = ZonedDateTime.now();
        this.updatedAt = ZonedDateTime.now();
    }
    public void enable(){
        this.status = Status.ENABLE;
    }

    public void disable(){
        this.status = Status.DISABLE;
    }
}
