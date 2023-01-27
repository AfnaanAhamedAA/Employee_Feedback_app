package com.employee_feedback_web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee_feedback_web.Entities.FeedbackEntity;

public interface FeedbackRepository extends JpaRepository<FeedbackEntity, Long> {

                
}
