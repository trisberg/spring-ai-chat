package com.example.aichat;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.PromptChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.vectorstore.QuestionAnswerAdvisor;
import org.springframework.ai.chat.memory.InMemoryChatMemoryRepository;
import org.springframework.ai.chat.memory.MessageWindowChatMemory;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.ai.chat.memory.ChatMemory;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(
            ChatClient.Builder chatClientBuilder,
            VectorStore vectorStore) {
        this.chatClient = chatClientBuilder
                .defaultAdvisors(
                        QuestionAnswerAdvisor.builder(vectorStore).build(),
                        PromptChatMemoryAdvisor.builder(MessageWindowChatMemory.builder().chatMemoryRepository(new InMemoryChatMemoryRepository()).build()).build())
                .build();
    }

    @PostMapping
    public Answer chat(@RequestBody Question question, Authentication user) {
        return chatClient.prompt()
                .user(question.question())
                .advisors(advisorSpec -> advisorSpec.param(ChatMemory.CONVERSATION_ID, user.getPrincipal()))
                .call()
                .entity(Answer.class);
    }

}