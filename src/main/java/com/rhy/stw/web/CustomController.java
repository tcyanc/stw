package com.rhy.stw.web;

import com.rhy.stw.bean.CheXi;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yan_t on 2017-09-12.
 */
@RestController
@RequestMapping("/custom")
public class CustomController {
    @RequestMapping("/getChexi")
    public List getChexi() {

        List<CheXi> list = new ArrayList<>();
        list.add(new CheXi("123"));
        list.add(new CheXi("456"));
//        model.addAttribute("chexi", list);
        return list;
    }
}
