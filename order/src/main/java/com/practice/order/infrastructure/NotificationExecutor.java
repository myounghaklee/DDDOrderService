package com.practice.order.infrastructure;

import com.practice.order.domain.Notification.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotificationExecutor implements NotificationService {

    @Override
    public void sendEmail(String email, String title, String description) {
        log.info("email");
    }

    @Override
    public void sendKakao(String phoneNo, String description) {
        log.info("kakao");
    }

    @Override
    public void sendSms(String phoneNo, String description) {
        log.info("sms");
    }
}
