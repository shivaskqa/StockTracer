package com.aitracker.controller;

import com.aitracker.model.AiTool;
import com.aitracker.service.AiToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tools")
@CrossOrigin(origins = "*") // Allow frontend to call backend if on different port/domain
public class AiToolController {

    private final AiToolService aiToolService;

    @Autowired
    public AiToolController(AiToolService aiToolService) {
        this.aiToolService = aiToolService;
    }

    @GetMapping("/top10")
    public List<AiTool> getTop10Tools() {
        return aiToolService.getTop10Tools();
    }

    @GetMapping("/search")
    public List<AiTool> searchTools(@RequestParam String q) {
        return aiToolService.searchTools(q);
    }
}
