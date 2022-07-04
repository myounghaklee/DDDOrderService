package com.practice.order.infrastructure;

import com.practice.order.domain.Notification.NotificationService;

public class NotificationExecutor implements NotificationService {

    @Override
    public void sendEmail(String email, String title, String description) {
        
    }

    @Override
    public void sendKakao(String phoneNo, String description) {

    }

    @Override
    public void sendSms(String phoneNo, String description) {

    }
}
