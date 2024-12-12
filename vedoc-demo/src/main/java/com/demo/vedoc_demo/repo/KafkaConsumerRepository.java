package com.demo.vedoc_demo.repo;

import com.demo.vedoc_demo.model.KafkaMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafkaConsumerRepository extends JpaRepository<KafkaMessage, Long> {
}
