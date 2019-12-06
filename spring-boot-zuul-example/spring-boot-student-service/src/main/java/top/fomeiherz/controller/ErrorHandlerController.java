package top.fomeiherz.controller;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: viagra
 * @Date: 2019/12/1 17:02
 * @Description:
 */

@RestController
public class ErrorHandlerController implements ErrorController {

    /**
     * 出异常后进入该方法，交由下面的方法处理
     */
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public String error() {
        return "出现异常";
    }
}
