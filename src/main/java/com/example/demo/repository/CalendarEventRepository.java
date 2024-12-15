package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CalendarEvent;

public interface CalendarEventRepository extends JpaRepository<CalendarEvent, Long> {
    // You can define custom query methods here if necessary
}

