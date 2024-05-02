package com.devpraveen.ai.config;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.huggingface.HuggingFaceChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAiConfig {

  @Bean
  public ChatLanguageModel model(@Value("${ai-model.api-key}") String openAiKey) {

    return HuggingFaceChatModel.builder().accessToken(openAiKey).maxNewTokens(50).build();
  }
}
