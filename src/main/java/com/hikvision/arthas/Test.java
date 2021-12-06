package com.hikvision.arthas;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author wsl
 * @Description:
 * @date 2021/12/6/16:59
 */
@RestController
@RequestMapping(value = "/test/arthas" )
public class Test {
    @GetMapping("/arthas")
    public String getId() {
        return "HelloArthas";
    }
}
