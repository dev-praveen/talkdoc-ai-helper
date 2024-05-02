package com.devpraveen.ai.controller;

import dev.langchain4j.model.chat.ChatLanguageModel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.Instant;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AiController {

  private final ChatLanguageModel chatLanguageModel;

  @GetMapping(value = "/hi")
  public String sayHello(@RequestParam("name") String name) {

    return "Hi " + name + " good wishes " + Instant.now();
  }

  @GetMapping(value = "/chat")
  public String chat(@RequestParam("prompt") String prompt) {

    return chatLanguageModel.generate(prompt);
  }
}
