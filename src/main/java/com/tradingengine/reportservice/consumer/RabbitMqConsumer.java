package com.tradingengine.reportservice.consumer;

import com.tradingengine.reportservice.dto.UserReportDto;
import com.tradingengine.reportservice.service.UserReportService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMqConsumer {

    private final UserReportService userReportService;
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMqConsumer.class);

    @RabbitListener(queues = {"${rabbitMq.queue.user-queue}"})
    public void consumeUser(UserReportDto userReportDto) {
        LOGGER.info(String.format("Received Message from report -> %s",userReportDto.toString()));
        userReportService.saveUserReport(userReportDto);
    }

}
