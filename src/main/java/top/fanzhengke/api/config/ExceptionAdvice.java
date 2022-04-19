package top.fanzhengke.api.config;


import cn.hutool.json.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.fanzhengke.api.common.util.Result;
import top.fanzhengke.api.exception.EmosException;

@Slf4j
@RestControllerAdvice
public class ExceptionAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(Exception e) {
        JSONObject json = new JSONObject();
        // 处理后端验证失败产生的异常
        if (e instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException exception = (MethodArgumentNotValidException) e;
            json.set("error", exception.getBindingResult().getFieldError().getDefaultMessage());
        }
        // 处理业务异常
        else if (e instanceof EmosException) {
            log.error("执行异常", e);
            EmosException exception = (EmosException) e;
            json.set("error", exception.getMsg());
        }
        // 处理其余的异常
        else {
            log.error("执行异常", e);
            json.set("error", "执行异常");
        }
        return Result.error(json.toString());
    }
}