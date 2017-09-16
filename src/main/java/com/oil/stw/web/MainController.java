package com.oil.stw.web;

/**
 * Created by yan_t on 2017-09-12.
 */

import com.oil.stw.bean.PinPai;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController{

    @RequestMapping("/")
    public String toIndex(Model model) {
        List<PinPai> list = new ArrayList();
        list.add(new PinPai("奥迪"));
        list.add(new PinPai("标致"));
        list.add(new PinPai("比亚迪"));
        list.add(new PinPai("保时捷"));
        list.add(new PinPai("北京汽车"));
        list.add(new PinPai("宝马"));
        list.add(new PinPai("奔驰"));
        list.add(new PinPai("别克"));
        list.add(new PinPai("奔腾"));
        list.add(new PinPai("本田"));
        list.add(new PinPai("长安"));
        list.add(new PinPai("长城"));
        list.add(new PinPai("DS"));
        list.add(new PinPai("东南汽车"));
        list.add(new PinPai("东风风行"));
        list.add(new PinPai("东风风神"));
        list.add(new PinPai("大众"));
        list.add(new PinPai("菲亚特"));
        list.add(new PinPai("福田"));
        list.add(new PinPai("丰田"));
        list.add(new PinPai("福特"));
        list.add(new PinPai("广汽传祺"));
        list.add(new PinPai("广汽吉奥"));
        list.add(new PinPai("海马"));
        list.add(new PinPai("哈弗"));
        list.add(new PinPai("华泰"));
        list.add(new PinPai("捷豹"));
        list.add(new PinPai("吉利汽车"));
        list.add(new PinPai("Jeep"));
        list.add(new PinPai("江淮"));
        list.add(new PinPai("凯迪拉克"));
        list.add(new PinPai("铃木"));
        list.add(new PinPai("雷诺"));
        list.add(new PinPai("理念"));
        list.add(new PinPai("路虎"));
        list.add(new PinPai("力帆"));
        list.add(new PinPai("雷克萨斯"));
        list.add(new PinPai("MG"));
        list.add(new PinPai("马自达"));
        list.add(new PinPai("MINI"));
        list.add(new PinPai("纳智捷"));
        list.add(new PinPai("讴歌"));
        list.add(new PinPai("欧朗"));
        list.add(new PinPai("奇瑞"));
        list.add(new PinPai("起亚"));
        list.add(new PinPai("瑞麒"));
        list.add(new PinPai("日产"));
        list.add(new PinPai("荣威"));
        list.add(new PinPai("三菱"));
        list.add(new PinPai("斯巴鲁"));
        list.add(new PinPai("斯柯达"));
        list.add(new PinPai("smart"));
        list.add(new PinPai("双龙"));
        list.add(new PinPai("威麟"));
        list.add(new PinPai("沃尔沃"));
        list.add(new PinPai("雪佛兰"));
        list.add(new PinPai("现代"));
        list.add(new PinPai("雪铁龙"));
        list.add(new PinPai("西雅特"));
        list.add(new PinPai("英菲尼迪"));
        list.add(new PinPai("一汽"));
        list.add(new PinPai("众泰"));
        list.add(new PinPai("中华"));
        list.add(new PinPai("中兴"));
        list.add(new PinPai("五菱汽车"));
        list.add(new PinPai("欧宝"));
        list.add(new PinPai("宾利"));
        list.add(new PinPai("宝骏"));
        list.add(new PinPai("启辰"));
        list.add(new PinPai("道奇"));
        list.add(new PinPai("克莱斯勒"));
        list.add(new PinPai("红旗"));
        list.add(new PinPai("快速换油"));
        list.add(new PinPai("自动清洁"));
        list.add(new PinPai("萨博"));
        list.add(new PinPai("瑞麟"));
        list.add(new PinPai("林肯"));
        list.add(new PinPai("莲花汽车"));
        list.add(new PinPai("金杯"));
        list.add(new PinPai("GMC"));
        list.add(new PinPai("悍马"));
        list.add(new PinPai("大发"));
        list.add(new PinPai("阿尔法罗密欧"));
        list.add(new PinPai("阿斯顿马丁"));
        model.addAttribute("list", list);
        return "index";
    }



}