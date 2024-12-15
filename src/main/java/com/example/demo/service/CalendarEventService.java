package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CalendarEvent;
import com.example.demo.repository.CalendarEventRepository;

import java.util.List;

@Service
public class CalendarEventService {

    @Autowired
    private CalendarEventRepository repository;

    public List<CalendarEvent> getAllEvents() {
        return repository.findAll();
    }

    public CalendarEvent saveEvent(CalendarEvent event) {
        return repository.save(event);
    }

    // Other CRUD operations
}

