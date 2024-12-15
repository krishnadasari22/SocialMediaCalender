package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CalendarEvent;
import com.example.demo.service.CalendarEventService;

import java.util.List;

@RestController
@RequestMapping("/api/calendar-events")
public class CalendarEventController {

    @Autowired
    private CalendarEventService eventService;

    @GetMapping
    public List<CalendarEvent> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping
    public CalendarEvent createEvent(@RequestBody CalendarEvent event) {
        return eventService.saveEvent(event);
    }

    // Other API endpoints
}

