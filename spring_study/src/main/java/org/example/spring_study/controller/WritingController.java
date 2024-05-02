package org.example.spring_study.controller;


import lombok.RequiredArgsConstructor;
import org.example.spring_study.domain.Reply;
import org.example.spring_study.domain.Writing;
import org.example.spring_study.service.WritingService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/writing")
public class WritingController {
    private final WritingService writingService;

    @GetMapping("")
    public Page<Writing> list(
            @RequestParam(value = "pageNumber", defaultValue = "0") int pageNumber,
            @RequestParam(value = "count", defaultValue = "10") int count) {
        return writingService.list(pageNumber, count);
    }

    @PostMapping("/reply")
    public Reply addReply(@RequestBody Reply reply){
        return writingService.addReply(reply);
    }

    @DeleteMapping("/delete/{writingId}")
    public boolean delete(@PathVariable("writingId") int writingId) {
        return writingService.delete(writingId);
    }


}
