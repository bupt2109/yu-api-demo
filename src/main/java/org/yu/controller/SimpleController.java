package org.yu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * SimpleController
 *
 * @author yu
 * @version v1.0
 * @Description
 * @Date 2020/5/13
 */
//@RequestMapping("/simple")
@RestController
public class SimpleController {

    @RequestMapping("/map1")
    public Map<String, String> Index(){
        Map map = new HashMap<String, String>();
        map.put("北京","北方城市");
        map.put("深圳","南方城市");
        return map;
    }
}
