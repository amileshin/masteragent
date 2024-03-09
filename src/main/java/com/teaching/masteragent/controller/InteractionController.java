package com.teaching.masteragent.controller;

import com.teaching.masteragent.serviece.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class InteractionController {
    private final BaseService baseService;

    @GetMapping("/master")
    public ResponseEntity<String> masterUrl() {
        return new ResponseEntity<>(baseService.getMasterUrl(), HttpStatus.OK);
    }

    @GetMapping("/type")
    public ResponseEntity<String> nodeType() {
        return new ResponseEntity<>(baseService.getInteractionType(), HttpStatus.OK);
    }
}
