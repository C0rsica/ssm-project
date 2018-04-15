package top.yangluotong.ssm.api;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author corsica
 * @date 2018/3/30
 * @time 下午11:53
 */
@Controller
@RequestMapping(value = "/api")
@Api(value = "/store", description = "Operations about store")
public class ApiController {

    @ApiOperation(
            value = "Find purchase order by ID",
            notes = "For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions",
            tags = {"Pet Store"})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "Order not found")})
    @RequestMapping(value = "hello")
    @ResponseBody
    public String sendMessage() {
        return "hello";
    }

}
