package com.rhy.stw;

import com.rhy.stw.bean.PinPai;
import org.springframework.boot.SpringApplication;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yan_t on 2017-09-13.
 */
public class Spider {

//    http://sdsem20170114.ushost2.08jt.com
//    http://sdsem20170114.ushost2.08jt.com/page/getChexi.php?pinpai=奥迪
//    http://sdsem20170114.ushost2.08jt.com/page/getNiankuan.php?niankuan=奥迪A6L
//    http://sdsem20170114.ushost2.08jt.com/page/queryData.php?chexi=奥迪A6L&niankuan=2005款+2.0T+自动标准型&pinpai=奥迪

    public static void main(String[] args) {
        Connect();
    }

    public static void Connect(){

        // 品牌列表
        List<String> list = new ArrayList<>();
        list.add("奥迪");
        list.add("标致");
        list.add("比亚迪");
        list.add("保时捷");
        list.add("北京汽车");
        list.add("宝马");
        list.add("奔驰");
        list.add("别克");
        list.add("奔腾");
        list.add("本田");
        list.add("长安");
        list.add("长城");
        list.add("DS");
        list.add("东南汽车");
        list.add("东风风行");
        list.add("东风风神");
        list.add("大众");
        list.add("菲亚特");
        list.add("福田");
        list.add("丰田");
        list.add("福特");
        list.add("广汽传祺");
        list.add("广汽吉奥");
        list.add("海马");
        list.add("哈弗");
        list.add("华泰");
        list.add("捷豹");
        list.add("吉利汽车");
        list.add("Jeep");
        list.add("江淮");
        list.add("凯迪拉克");
        list.add("铃木");
        list.add("雷诺");
        list.add("理念");
        list.add("路虎");
        list.add("力帆");
        list.add("雷克萨斯");
        list.add("MG");
        list.add("马自达");
        list.add("MINI");
        list.add("纳智捷");
        list.add("讴歌");
        list.add("欧朗");
        list.add("奇瑞");
        list.add("起亚");
        list.add("瑞麒");
        list.add("日产");
        list.add("荣威");
        list.add("三菱");
        list.add("斯巴鲁");
        list.add("斯柯达");
        list.add("smart");
        list.add("双龙");
        list.add("威麟");
        list.add("沃尔沃");
        list.add("雪佛兰");
        list.add("现代");
        list.add("雪铁龙");
        list.add("西雅特");
        list.add("英菲尼迪");
        list.add("一汽");
        list.add("众泰");
        list.add("中华");
        list.add("中兴");
        list.add("五菱汽车");
        list.add("欧宝");
        list.add("宾利");
        list.add("宝骏");
        list.add("启辰");
        list.add("道奇");
        list.add("克莱斯勒");
        list.add("红旗");
        list.add("快速换油");
        list.add("自动清洁");
        list.add("萨博");
        list.add("瑞麟");
        list.add("林肯");
        list.add("莲花汽车");
        list.add("金杯");
        list.add("GMC");
        list.add("悍马");
        list.add("大发");
        list.add("阿尔法罗密欧");
        list.add("阿斯顿马丁");

        // 车系map
        Map<String,List<String>> chexiMap = new HashMap<>();

        // 年款map
        Map<String,List<String>> niankuanMap = new HashMap<>();


        HttpURLConnection conn = null;
        URL url = null;
        InputStream in = null;
        BufferedReader reader = null;
        try {
            for(String pinpai : list) {
                try {
                    url = new URL("http://sdsem20170114.ushost2.08jt.com/page/getChexi.php?pinpai=" + pinpai);
                    conn = (HttpURLConnection) url.openConnection();
                    conn.setConnectTimeout(5000);
                    conn.setReadTimeout(5000);
                    conn.setDoInput(true);
                    conn.connect();
                    in = conn.getInputStream();
                    reader = new BufferedReader(new InputStreamReader(in));
                    String line = reader.readLine();
                    line = ascii2native(line);
                    System.out.println(line);
                } catch (Exception e) {
                e.printStackTrace();
                    continue;
            }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.disconnect();
            try {
                in.close();
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//        return stringBuffer.toString();
    }

    private static String ascii2native ( String asciicode )
    {
        String[] asciis = asciicode.split ("\\\\u");
        String nativeValue = asciis[0];
        try
        {
            for ( int i = 1; i < asciis.length; i++ )
            {
                String code = asciis[i];
                nativeValue += (char) Integer.parseInt (code.substring (0, 4), 16);
                if (code.length () > 4)
                {
                    nativeValue += code.substring (4, code.length ());
                }
            }
        }
        catch (NumberFormatException e)
        {
            return asciicode;
        }
        return nativeValue;
    }
}
