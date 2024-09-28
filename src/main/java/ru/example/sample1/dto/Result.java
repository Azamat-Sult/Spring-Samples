package ru.example.sample1.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import ru.example.sample1.enums.ResultCode;

import java.util.ArrayList;

@Data
@Accessors(chain = true)
public class Result {

    private ResultCode code;
    private ArrayList<String> userMessages = new ArrayList<>();

    public Result code(ResultCode code) {
        this.code = code;
        return this;
    }

    public void addUserMessage(String userMessage) {
        this.userMessages.add(userMessage);
    }
}