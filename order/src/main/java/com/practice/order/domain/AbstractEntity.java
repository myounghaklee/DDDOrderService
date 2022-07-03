package com.practice.order.domain;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.ZonedDateTime;

@Getter
@MappedSuperclass//상송받는 클래스에서 자동으로 createdAt, updatedAt 속성이 추가된다.
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {

    @CreationTimestamp
    private ZonedDateTime createdAt;

    @UpdateTimestamp
    private ZonedDateTime updatedAt;
}
