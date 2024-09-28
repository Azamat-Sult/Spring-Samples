package ru.example.sample1.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import ru.example.sample1.dto.Result;

@Getter
@AllArgsConstructor
public enum ResultCreator {

    ALL_CLEAR(ResultCode.SUCCESS, "All clear"),
    SOME_ERRORS(ResultCode.NEED_TO_CHECK, "Some errors"),
    EPIC_FAIL(ResultCode.FAIL, "Epic fail");

    private final ResultCode code;
    private final String message;

    public Result getResult() {
        Result result = new Result().code(this.code);
        if (StringUtils.isNotEmpty(this.message)) {
            result.addUserMessage(this.message);
        }
        return result;
    }

}